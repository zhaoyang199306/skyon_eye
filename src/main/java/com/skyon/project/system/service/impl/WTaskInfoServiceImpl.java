package com.skyon.project.system.service.impl;

import com.skyon.project.system.domain.eye.TBondInfo;
import com.skyon.project.system.domain.ferghana.DpApTaskInfo;
import com.skyon.project.system.mapper.TBondInfoMapper;
import com.skyon.project.system.mapper.DpApTaskInfoMapper;
import com.skyon.project.system.service.WTaskInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class WTaskInfoServiceImpl implements WTaskInfoService {

    @Autowired
    private DpApTaskInfoMapper taskInfoMapper;
    @Autowired
    private TBondInfoMapper bondInfoMapper;

    /**
     * 根据待办箱任务编号查询任务详情集合
     *
     * @param list taskInfoNo 集合
     * @return 实体集合
     */
    @Override
    public List<DpApTaskInfo> getWTaskInfoByList1(Set set) {
        return taskInfoMapper.getWTaskInfoByList1(set);
    }


    @Override
    public List<DpApTaskInfo> getWTaskInfoListByRole(String role) {
        return taskInfoMapper.getWTaskInfoListByRole(role);
    }

    @Override
    public int updateRunStatusByNo(String taskInfoNo, String riskControlMeasures, String personalRiskLevel, String checkResult) {
        return taskInfoMapper.updateRunStatusByNo(taskInfoNo, riskControlMeasures, personalRiskLevel, checkResult);
    }

    @Override
    public int updateRunStatusByNoAndTrack(String taskInfoNo) {
        return taskInfoMapper.updateRunStatusByNoAndTrack(taskInfoNo);
    }

    @Override
    public int celarRunStatusByNo(String taskInfoNo) {
        return taskInfoMapper.celarRunStatusByNo(taskInfoNo);
    }

    @Override
    public int insertWTaskInfo(DpApTaskInfo dpApTaskInfo) {
        int i = taskInfoMapper.insertWTaskInfo(dpApTaskInfo);
        List<TBondInfo> bondInfoList = dpApTaskInfo.getBondInfoList();
        if (!bondInfoList.isEmpty()) {
            for (TBondInfo tBondInfo : bondInfoList) {
                tBondInfo.setTaskInfoNo(dpApTaskInfo.getTaskInfoNo());
            }
            bondInfoMapper.insertTBondInfo(bondInfoList);
        }
        return i;
    }

    @Override
    public List selectAllTaskInfoNo() {
        return taskInfoMapper.selectAllTaskInfoNo();
    }

    @Override
    public Set selectIsProprietary() {
        return taskInfoMapper.selectIsProprietary();
    }

    @Override
    public Set selectIsNoProprietary() {
        return taskInfoMapper.selectIsNoProprietary();
    }

    @Override
    public DpApTaskInfo selectDpApTaskInfoByTaskInfoNo(String taskInfoNo) {
        return taskInfoMapper.selectDpApTaskInfoByTaskInfoNo(taskInfoNo);
    }


}
