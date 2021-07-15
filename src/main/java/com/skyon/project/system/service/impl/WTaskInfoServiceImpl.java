package com.skyon.project.system.service.impl;

import com.skyon.project.system.domain.eye.TBondInfo;
import com.skyon.project.system.domain.ferghana.WTaskInfo;
import com.skyon.project.system.mapper.TBondInfoMapper;
import com.skyon.project.system.mapper.WTaskInfoMapper;
import com.skyon.project.system.service.WTaskInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class WTaskInfoServiceImpl implements WTaskInfoService {

    @Autowired
    private WTaskInfoMapper taskInfoMapper;
    @Autowired
    private TBondInfoMapper bondInfoMapper;

    /**
     * 根据待办箱任务编号查询任务详情集合
     *
     * @param list taskInfoNo 集合
     * @return 实体集合
     */
    @Override
    public List<WTaskInfo> getWTaskInfoByList1(Set set) {
        return taskInfoMapper.getWTaskInfoByList1(set);
    }

    @Override
    public List<WTaskInfo> getWTaskInfoByList2(List list) {
        return taskInfoMapper.getWTaskInfoByList2(list);
    }

    @Override
    public List<WTaskInfo> getWTaskInfoByList3(List list) {
        return taskInfoMapper.getWTaskInfoByList3(list);
    }

    @Override
    public List<WTaskInfo> getWTaskInfoListByRole(String role) {
        return taskInfoMapper.getWTaskInfoListByRole(role);
    }

    @Override
    public int updateRunStatusByNo(String taskInfoNo) {
        return taskInfoMapper.updateRunStatusByNo(taskInfoNo);
    }

    @Override
    public int celarRunStatusByNo(String taskInfoNo) {
        return taskInfoMapper.celarRunStatusByNo(taskInfoNo);
    }

    @Override
    public int insertWTaskInfo(WTaskInfo wTaskInfo) {
        int i = taskInfoMapper.insertWTaskInfo(wTaskInfo);
        List<TBondInfo> bondInfoList = wTaskInfo.getBondInfoList();
        if (bondInfoList.size() > 0) {
            for (TBondInfo tBondInfo : bondInfoList) {
                tBondInfo.setTaskInfoNo(wTaskInfo.getTaskInfoNo());
            }
            bondInfoMapper.insertTBondInfo(bondInfoList);
        }
        return i;
    }

    @Override
    public List selectAllTaskInfoNo() {
        return taskInfoMapper.selectAllTaskInfoNo();
    }


}
