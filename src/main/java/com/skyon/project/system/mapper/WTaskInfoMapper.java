package com.skyon.project.system.mapper;

import com.skyon.project.system.domain.ferghana.WTaskInfo;

import java.util.List;
import java.util.Set;

public interface WTaskInfoMapper {

    // 根据待办箱的任务编号查询任务详情
    public List<WTaskInfo> getWTaskInfoByList1(Set set);
    public List<WTaskInfo> getWTaskInfoByList2(List list);
    public List<WTaskInfo> getWTaskInfoByList3(List list);

    // 查询预警认定角色的任务详细
    public List<WTaskInfo> getWTaskInfoListByRole(String role);

    // 根据taskInfoNo 修改run_status状态
    public int updateRunStatusByNo(String taskInfoNo);

    // 初始化run_status状态
    public int celarRunStatusByNo(String taskInfoNo);


    public int insertWTaskInfo(WTaskInfo wTaskInfo);

    // 查询人工录入的件
    public List<WTaskInfo> getWTaskInfoListByManual();

    public WTaskInfo getWTaskInfoListManualByCustNo(String custNo);

    public List<WTaskInfo> selectWTaskInfoByCustNo(String custNo);

    // 查询所有的task_info_no
    public List selectAllTaskInfoNo();
    // 查询处置跟踪的非自营
    public Set selectIsProprietary();
}
