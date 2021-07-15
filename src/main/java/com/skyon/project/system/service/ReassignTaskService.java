package com.skyon.project.system.service;

import com.skyon.project.system.domain.eye.TReassignTaskInfo;

import java.util.List;
import java.util.Map;

public interface ReassignTaskService {
    public List getReassignTaskList();

    public List<Map> getUnReassignTaskList();

    public List<Map> selectReassignUserByRole(String role);

    // 新增改派信息
    public int insertRessignTaskByArtificial(TReassignTaskInfo reassignTaskInfo);

    /**
     * 根据改派编号查询改派任务
     * @param reassignTaskNo 改派编号
     * @return TReassignTaskInfo 实体
     */
    public TReassignTaskInfo getReassignTaskByReassignTaskNo(String reassignTaskNo);
}
