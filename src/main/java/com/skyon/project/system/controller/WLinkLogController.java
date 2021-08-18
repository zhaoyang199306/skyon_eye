package com.skyon.project.system.controller;

import com.skyon.framework.web.controller.BaseController;
import com.skyon.framework.web.domain.AjaxResult;
import com.skyon.project.system.domain.ferghana.WLinkLog;
import com.skyon.project.system.service.WLinkLogService;
import com.skyon.project.system.service.WTaskInfoService;
import com.skyon.project.system.service.activiti.TaskWFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 流程信息查询类
 */
@RestController
@RequestMapping("/linkLogs")
public class WLinkLogController extends BaseController {

    @Autowired
    private WLinkLogService linkLogService;
    @Autowired
    private TaskWFService taskWFService;
    @Autowired
    private WTaskInfoService taskInfoService;


    @GetMapping("/list/{taskInfoNo}")
    public AjaxResult getList(@PathVariable("taskInfoNo") String taskInfoNo) {
        List<WLinkLog> list = linkLogService.getList(taskInfoNo);
        if (list.size() > 0) {
            return AjaxResult.success(list);
        } else {
            return AjaxResult.success("noData");
        }
    }

    /**
     * 清除流程信息
     *
     * @param taskInfoNo 任务编号
     * @return
     */
    @GetMapping("/clearWF/{taskInfoNo}")
    public AjaxResult clearWF(@PathVariable("taskInfoNo") String taskInfoNo) {
        try {
            logger.info("------------clearWF----清除流程信息---------{}", taskInfoNo);
            // 删除流程信息表
            int i = linkLogService.deleteList(taskInfoNo);
            logger.info("------------删除流程信息表----删除-----{}  条", i);

            // 修改DP_AP_task_info表状态
            int i1 = taskInfoService.celarRunStatusByNo(taskInfoNo);

            // 删除工作流表 信息
            taskWFService.deleteInstance(taskInfoNo);
            return AjaxResult.success();
        } catch (Exception e) {
            return AjaxResult.error();
        }


    }
}
