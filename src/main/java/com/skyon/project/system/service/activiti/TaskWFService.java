package com.skyon.project.system.service.activiti;

import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.task.Task;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface TaskWFService {

    // 查询个人任务
    public Map<String, String> taskWfUser(String user);

    // 查询候选任务
    public List taskWfGroup(String user);

    // 根据任务编号执行任务
    public String exeTaskByTaskInfoNo(String taskInfoNo, String user, Map map);

    // 根据任务编号获取当前任务
    public Task getCurrentTaskByNo(String taskInfoNo);

    // 根据历史任务分配处理人
    public void claimAssigneeByTask(HistoricTaskInstance taskInstance, String taskInfoNo);

    // 根据任务编号分配处理人
    public String claimAssigneeByTaskInfoNo(String taskInfoNo, String user);

    // 根据代理人查询历史所有任务实例id 任务编号需通过实例id查询出来
    public Set findlActAll(String user);

    // 改派
    public void updateAssignee(String taskInfoNo, String user);


    // 删除一个流程实例
    public void deleteInstance(String taskInfoNo);
}
