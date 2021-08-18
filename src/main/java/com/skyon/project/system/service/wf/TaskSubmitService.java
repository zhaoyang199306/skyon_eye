package com.skyon.project.system.service.wf;

import com.skyon.project.system.domain.eye.TaskInfoSubmitPojo;

/**
 * 任务的流转 -- 提交
 */
public interface TaskSubmitService {

    /**
     * 任务提交
     */
    public void taskSubmitMethod(TaskInfoSubmitPojo pojo);

}
