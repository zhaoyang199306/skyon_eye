package com.skyon.project.system.mapper;

import com.skyon.project.system.domain.eye.TReassignTaskInfo;

import java.util.List;
import java.util.Map;

public interface ReassignTaskMapper {

    public List getReassignTaskList();

    // 查询未结束的 分配人的  所有件
    public List<Map> getUnReassignTaskList();

    // 新增改派信息
    public int insertRessignTaskByArtificial(TReassignTaskInfo reassignTaskInfo);

    /**
     * 根据改派编号查询改派任务
     * @param reassignTaskNo 改派编号
     * @return TReassignTaskInfo 实体
     */
    public TReassignTaskInfo getReassignTaskByReassignTaskNo(String reassignTaskNo);
}
