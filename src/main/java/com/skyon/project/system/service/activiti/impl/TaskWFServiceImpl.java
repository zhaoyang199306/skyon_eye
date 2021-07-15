package com.skyon.project.system.service.activiti.impl;

import com.skyon.project.system.service.activiti.TaskWFService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TaskWFServiceImpl implements TaskWFService {
//    private ProcessEngine defaultProcessEngine;
//
//    {
//        defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
//    }



    /**
     * 根据用户id查询代办任务
     * @param user 用户id
     * @return 任务编号
     */
    @Override
    public Map<String, String> taskWfUser(String user) {
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        RuntimeService runtimeService = defaultProcessEngine.getRuntimeService();
        // 获取任务对象
        TaskService taskService = defaultProcessEngine.getTaskService();
        // 查询当前登录人在为候选人组时的所有任务
        List<Task> list = taskService.createTaskQuery().taskAssignee(user).list();
        List<Task> list1 = taskService.createTaskQuery().taskCandidateUser(user)//指定组任务查询
                .list();
//        HashSet<Task> hs = new HashSet<>(list);
//        hs.addAll(new HashSet<Task>(list1));
        list.addAll(list1);

        // 查询自己的任务编号
        return getTaskInfoList(list, runtimeService);
    }

    @Override
    public List taskWfGroup(String user) {
        return null;
    }

    /**
     * 执行任务
     * @param taskInfoNo 任务编号
     * @param user 用户号
     * @param map 参数
     *          comtwoid 预警认定审批员id
     * @return
     */
    @Override
    public String exeTaskByTaskInfoNo(String taskInfoNo, String user, Map map) {
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        String name = "";
        // 获取当前任务
        TaskService taskService = defaultProcessEngine.getTaskService();
        Task task = taskService.createTaskQuery().processInstanceBusinessKey(taskInfoNo).singleResult();
        if (task != null) {
            String idID = task.getId();
            // 如果未分配任务的先分配任务
            if (task.getAssignee() == null){
                // 分配任务
                taskService.claim(idID, user);
            }
            // 执行任务
            taskService.complete(idID, map);
            name = task.getName();
        }
        return name;
    }

    @Override
    public Task getCurrentTaskByNo(String taskInfoNo) {
        return null;
    }

    @Override
    public void claimAssigneeByTask(HistoricTaskInstance taskInstance, String taskInfoNo) {

    }

    /**
     *  分配任务
     * @param taskInfoNo 任务编号
     * @param user 用户名
     * @return
     */
    @Override
    public String claimAssigneeByTaskInfoNo(String taskInfoNo, String user) {
        return claim(taskInfoNo,user);
    }

    @Override
    public Set findlActAll(String user) {
        return null;
    }

    /**
     * 改派任务
     * @param taskInfoNo 任务编号
     * @param user 人
     * @return
     */
    @Override
    public void updateAssignee(String taskInfoNo, String user) {
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        TaskService taskService = defaultProcessEngine.getTaskService();
        Task task = taskService.createTaskQuery().processInstanceBusinessKey(taskInfoNo).singleResult();
        taskService.setAssignee(task.getId(),user);
    }

    /**
     * 根据实例删除
     */
    @Override
    public void deleteInstance(String taskInfoNo) {
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        RuntimeService runtimeService = defaultProcessEngine.getRuntimeService();
        ProcessInstance processInstance = runtimeService.createProcessInstanceQuery().processInstanceBusinessKey(taskInfoNo).singleResult();
        String processInstanceId = processInstance.getProcessInstanceId();
        runtimeService.deleteProcessInstance(processInstanceId,"手动删除");
    }


    // 分配任务
    private String claim(String taskInfoNo, String user) {
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        TaskService taskService = defaultProcessEngine.getTaskService();
        Task task = taskService.createTaskQuery().processInstanceBusinessKey(taskInfoNo).singleResult();
        if (task != null) {
            String idID = task.getId();
            // 分配任务
            taskService.claim(idID, user);
            return task.getName();
        }
        return "";
    }

    // 根据任务查询任务编号
    private Map<String, String> getTaskInfoList(List<Task> list, RuntimeService runtimeService) {
        // map 存储 key : 任务号id ; value : 任务节点名
        Map<String, String> map = new HashMap<>();
        for (Task task : list) {
            ProcessInstance pi = runtimeService.createProcessInstanceQuery().
                    processInstanceId(task.getProcessInstanceId()).singleResult();
            map.put(pi.getBusinessKey(),task.getName());
        }
        return map;
    }
}
