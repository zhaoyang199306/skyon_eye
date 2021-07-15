package com.skyon.project.system.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.skyon.project.system.domain.ferghana.TDataSource;
import com.skyon.project.system.domain.ferghana.TDatasourceField;
import com.skyon.project.system.mapper.TDataSourceMapper;
import com.skyon.project.system.mapper.TDatasourceFieldMapper;
import com.skyon.project.system.service.ITDataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @date 2020-05-21
 */
@Service
public class TDataSourceServiceImpl implements ITDataSourceService {

    @Autowired
    private TDataSourceMapper tDataSourceMapper;

    @Autowired
    private TDatasourceFieldMapper fieldMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param dataSourceId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public TDataSource selectTDataSourceById(Long dataSourceId) {

        TDataSource tDataSource = tDataSourceMapper.selectTDataSourceById(dataSourceId);
        JSONArray array = JSON.parseArray(tDataSource.getSchemaDefine());

        // 查询数据源表字段的使用情况 01:数据源表
        List<TDatasourceField> tDatasourceFields = fieldMapper.selectTDatasourceFieldByName(tDataSource.getTableName(), "01");
        if (tDatasourceFields != null) {
            for (int j = 0; j < array.size(); j++) {
                JSONObject o = (JSONObject) array.get(j);
                Object schemaDefine = o.get("schemaDefine");
                for (int i = 0; i < tDatasourceFields.size(); i++) {
                    TDatasourceField tDatasourceField = tDatasourceFields.get(i);
                    String fieldName = tDatasourceField.getFieldName();
                    if (schemaDefine.equals(fieldName)) {
                        o.put("isUsed",tDatasourceField.getIsUsed());
                        o.put("fieldId",tDatasourceField.getId());
                        break;
                    }
                }
            }
        }
        tDataSource.setDynamicItem(array.toArray());

        return tDataSource;
    }

    // 根据表名查询schema
    @Override
    public TDataSource selectTDataSourceByTableName(String tableName) {
        return tDataSourceMapper.selectTDataSourceByTableName(tableName);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param tDataSource 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TDataSource> selectTDataSourceList(TDataSource tDataSource) {
        return tDataSourceMapper.selectTDataSourceList(tDataSource);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param tDataSource 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTDataSource(TDataSource tDataSource) {
        tranSchemaJson(tDataSource);
        tDataSource.setCreateTableSql(joinCreateTableSql(tDataSource));
        return tDataSourceMapper.insertTDataSource(tDataSource);
    }

    // 拼接建表sql
    private String joinCreateTableSql(TDataSource dataSource) {
        String sqlString = "";
        String sourceTableSchema = schemaTransform(dataSource.getSchemaDefine());
        //01代表kafka连接器
        if ("01".equals(dataSource.getConnectorType())) {
            String consumerMode;
            String topicName;
            if ("01".equals(dataSource.getConsumerMode())) {
                consumerMode = "latest-offset";
            } else {
                consumerMode = "earliest-offset";
            }
            topicName = dataSource.getTopicName();
            String waterMark = dataSource.getWaterMarkName() != null ?
                    "`" + dataSource.getWaterMarkName() + "` as " + dataSource.getWaterMarkName() + " - INTERVAL '" + dataSource.getWaterMarkTime() + "' SECOND"
                    : "proctime as proctime - INTERVAL '" + dataSource.getWaterMarkTime() + "' SECOND";
            String waterSchema = dataSource.getWaterMarkName() != null ? ",`" + dataSource.getWaterMarkName() + "` TIMESTAMP" : " ";
            sqlString = "CREATE TABLE `" + dataSource.getTableName() + "`(" + sourceTableSchema + waterSchema +
                    ",proctime AS PROCTIME(),WATERMARK FOR " + waterMark +
                    ") WITH ('connector' = 'kafka-0.11' ,'topic' = '"
                    + topicName + "','properties.bootstrap.servers' = '" + dataSource.getKafkaAddress()
                    + "','properties.group.id' = '" + dataSource.getConsumerGroup()
                    + "','scan.startup.mode' = '" + consumerMode + "','format' = 'json')";
        }
        return sqlString;
    }

    // 拼接字段
    private String schemaTransform(String schemaDefine) {
        StringBuilder sb = new StringBuilder();
        JSONArray array = JSON.parseArray(schemaDefine);
        for (int i = 0; i < array.size(); i++) {
            JSONObject o = (JSONObject) array.get(i);
            Object schemaDefine1 = o.get("schemaDefine");
            Object dataBaseType = o.get("dataBaseType");
            sb.append("`" + schemaDefine1 + "` " + dataBaseType + ",");
        }
//        schemaDefine = StringUtils.strip(schemaDefine, "[");
//        schemaDefine = StringUtils.strip(schemaDefine, "]");
//
//
//        String[] split = schemaDefine.split(",");
//        for (int i = 0; i < split.length; i++) {
//            JSONObject jsonObj = JSON.parseObject(split[i]);
//            for (Map.Entry<String, Object> entry : jsonObj.entrySet()) {
//                sb.append("`"+entry.getKey()).append("` ").append(entry.getValue()).append(",");
//            }
//        }
        return sb.substring(0, sb.length() - 1);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param tDataSource 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTDataSource(TDataSource tDataSource) {
        tranSchemaJson(tDataSource);
        tDataSource.setCreateTableSql(joinCreateTableSql(tDataSource));
        tDataSource.setModifyTime(new Date());
        return tDataSourceMapper.updateTDataSource(tDataSource);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param dataSourceIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTDataSourceByIds(Long[] dataSourceIds) {
        return tDataSourceMapper.deleteTDataSourceByIds(dataSourceIds);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param dataSourceId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTDataSourceById(Long dataSourceId) {
        return tDataSourceMapper.deleteTDataSourceById(dataSourceId);
    }

    // 将数组转换为字段schema_defina的json格式
    private void tranSchemaJson(TDataSource tDataSource) {

        Object[] dynamicItem = tDataSource.getDynamicItem();
//        List list = new ArrayList();
//        // 把schema转换成json串
//        if (dynamicItem != null && dynamicItem.length > 0) {
//            for (int i = 0; i < dynamicItem.length; i++) {
//                HashMap hashMap = new HashMap();
//                HashMap o = (HashMap) dynamicItem[i];
//                hashMap.put(o.get("schemaDefine"), o.get("dataBaseType"));
//                list.add(hashMap);
//            }
//        }
        String s = JSON.toJSONString(dynamicItem);
        tDataSource.setSchemaDefine(s);
    }

    // 根据id查集合
    @Override
    public List<TDataSource> selectTDataSourceListByIds(Long[] ids){
        return tDataSourceMapper.selectTDataSourceListByIds(ids);
    }
}
