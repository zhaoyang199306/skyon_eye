package com.skyon.framework.manager.factory;

import com.skyon.project.system.service.wf.TaskSubmitService;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;

/**
 *  环节流转 根据角色处理流程的工厂类
 */
public class WfDealRoleRegisterFactory {

    private static ConcurrentHashMap<String, TaskSubmitService> map = new ConcurrentHashMap();

    /**
     * 根据角色获取对应的环节处理类
     * @param role 角色名
     * @return
     */
    public static TaskSubmitService getService(String role){
        return map.get(role);
    }

    /**
     *
     * @param role 角色名
     * @param service 不同的任务处理类
     */
    public static void register(String role, TaskSubmitService service){
        map.put(role, service);
    }






}
