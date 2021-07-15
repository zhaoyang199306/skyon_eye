package com.skyon.project.system.service.impl;

import com.skyon.common.core.lang.UUID;
import com.skyon.common.utils.DateUtils;
import com.skyon.project.system.domain.ferghana.WLinkLog;
import com.skyon.project.system.mapper.WLinkLogMapper;
import com.skyon.project.system.service.WLinkLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WLinkLogServiceImpl implements WLinkLogService {

    @Autowired
    private WLinkLogMapper wLinkLogMapper;

    /**
     * 插入数据
     *
     * @param wLinkLog 实体
     * @return 条数
     */
    @Override
    public int insertWLinkLog(String taskINfoNo, String taskType, String dealRole, String dealUser, String operation,
                              String riskValue, String examinValue) {
        WLinkLog wLinkLog = new WLinkLog();
        wLinkLog.setId(UUID.randomUUID().toString().replaceAll("-", "")); // 主键
        wLinkLog.setTaskInfoNo(taskINfoNo);
        wLinkLog.setTaskNum(taskType + DateUtils.dateTimeNow()); // 任务编号
        wLinkLog.setDealRole(dealRole); // 处理岗位
        wLinkLog.setDealUser(dealUser); // 处理岗位
        wLinkLog.setOperation(operation); // 操作
        wLinkLog.setRiskValue(riskValue); // 风险措施
        wLinkLog.setExaminValue(examinValue); // 审核意见
        return wLinkLogMapper.insertWLinkLog(wLinkLog);
    }

    @Override
    public List<WLinkLog> getList(String taskInfoNo) {
        return wLinkLogMapper.getListByTaskInfoNo(taskInfoNo);
    }

    @Override
    public int deleteList(String taskInfoNo) {
        return wLinkLogMapper.deleteWLinkLog(taskInfoNo);
    }
}
