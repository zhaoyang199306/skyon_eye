package com.skyon.project.system.mapper;

import java.util.Map;

public interface WorkbenchMapper {

    // 查询预警认定的数量
    public Integer queryTaskInfoCount();
    // 查询处理跟踪的数量
    public Integer queryDisposalTrackCount();
    // 查询预警解除的数量
    public Integer queryRemoveRiskCount();
    // 查询人工信号的数量
    public Integer querySignalManualCount();
    // 查询客户名单的数量
    public Integer queryBlackManageFlowCount();
    // 查询任务改派的数量
    public Integer queryReassignTaskCount();

}
