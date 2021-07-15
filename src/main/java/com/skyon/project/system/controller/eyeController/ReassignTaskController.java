package com.skyon.project.system.controller.eyeController;

import com.skyon.framework.web.domain.AjaxResult;
import com.skyon.project.system.domain.ferghana.TReassignTaskDetail;
import com.skyon.project.system.domain.eye.TReassignTaskInfo;
import com.skyon.project.system.service.ReassignTaskService;
import com.skyon.project.system.service.activiti.TaskWFService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/reassignTask")
public class ReassignTaskController {

    @Autowired
    private ReassignTaskService reassignTaskService;
    @Autowired
    private TaskWFService taskWFService;

    @GetMapping("/list")
    public AjaxResult getReassignTaskList() {
        List list = reassignTaskService.getReassignTaskList();
        return AjaxResult.success(list);
    }

    @GetMapping("/getById")
    public AjaxResult getReassignTaskById(@Param("id") String id) {
        TReassignTaskInfo taskInfo = reassignTaskService.getReassignTaskByReassignTaskNo(id);
        return AjaxResult.success(taskInfo);
    }


    // 查询已分配人 在途 所有件
    @GetMapping("/getReassigTaskList")
    public AjaxResult getReassigTaskList(){
        List<Map> unReassignTaskList = reassignTaskService.getUnReassignTaskList();
        return AjaxResult.success(unReassignTaskList);
    }

    @GetMapping("/getOtherUser/{role}")
    public AjaxResult getOtherUser(@PathVariable("role") String role) {
        List<Map> users = reassignTaskService.selectReassignUserByRole(role);
        return AjaxResult.success(users);
    }

    /**
     *  新增
     * @param reassignTaskInfo
     * @return
     */
    @PostMapping("/submitReassignTask")
    @Transactional
    public AjaxResult submitReassignTask(@RequestBody TReassignTaskInfo reassignTaskInfo){
        // 保存改派信息
        reassignTaskInfo.setReassignType("人工改派");
        reassignTaskInfo.setApplicant(reassignTaskInfo.getReassignUser());
        int i = reassignTaskService.insertRessignTaskByArtificial(reassignTaskInfo);

        // 修改流程代理人
        List<TReassignTaskDetail> reassignTaskDetails = reassignTaskInfo.getReassignTaskDetails();
        for (TReassignTaskDetail reassignTaskDetail : reassignTaskDetails) {
            taskWFService.updateAssignee(reassignTaskDetail.getTaskInfoNo(), reassignTaskInfo.getReassignID());
        }


        return AjaxResult.success();
    }



}
