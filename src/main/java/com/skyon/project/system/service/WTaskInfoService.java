package com.skyon.project.system.service;

import com.skyon.project.system.domain.ferghana.WTaskInfo;

import java.util.List;
import java.util.Set;

public interface WTaskInfoService {

    public List<WTaskInfo> getWTaskInfoByList1(Set set);
    public List<WTaskInfo> getWTaskInfoByList2(List list);
    public List<WTaskInfo> getWTaskInfoByList3(List list);

    // 查询预警认定角色的任务详细
    public List<WTaskInfo> getWTaskInfoListByRole(String role);

    // 根据taskInfoNo 修改run_status状态
    public int updateRunStatusByNo(String taskInfoNo,String riskValue,String personalRiskLevel,String checkResult);

    public int updateRunStatusByNoAndTrack(String taskInfoNo);

    public int celarRunStatusByNo(String taskInfoNo);

    public int insertWTaskInfo(WTaskInfo wTaskInfo);

    // 查询所有的task_info_no
    public List selectAllTaskInfoNo();

    // 查询处置跟踪的非自营
    public Set selectIsProprietary();

    public Set selectIsNoProprietary();
}
