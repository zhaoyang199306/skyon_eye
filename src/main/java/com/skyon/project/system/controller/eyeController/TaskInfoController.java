package com.skyon.project.system.controller.eyeController;

import com.skyon.common.enums.DealType;
import com.skyon.common.enums.RoleName;
import com.skyon.common.enums.WFLink;
import com.skyon.common.enums.WFRole;
import com.skyon.common.utils.ServletUtils;
import com.skyon.framework.security.LoginUser;
import com.skyon.framework.security.service.TokenService;
import com.skyon.framework.web.controller.BaseController;
import com.skyon.framework.web.domain.AjaxResult;
import com.skyon.project.system.domain.SysRole;
import com.skyon.project.system.domain.SysUser;
import com.skyon.project.system.domain.eye.TWarnSignal;
import com.skyon.project.system.domain.ferghana.WTaskInfo;
import com.skyon.project.system.service.SignalManualSevice;
import com.skyon.project.system.service.TWarnSignalService;
import com.skyon.project.system.service.WLinkLogService;
import com.skyon.project.system.service.WTaskInfoService;
import com.skyon.project.system.service.activiti.RunWFService;
import com.skyon.project.system.service.activiti.TaskWFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/taskInfo")
public class TaskInfoController extends BaseController {

    public static final String SUBMIT_BUTTON = "提交";

    @Autowired
    private SignalManualSevice signalManualSevice;
    @Autowired
    private RunWFService runWFService;
    @Autowired
    private TaskWFService taskWFService;
    @Autowired
    private TokenService tokenService;
    @Autowired
    private WLinkLogService linkLogService;

    @Autowired
    private WTaskInfoService taskInfoService;
    @Autowired
    private TWarnSignalService warnSignalService;

    @GetMapping("/list")
    @Transactional
    public AjaxResult getSignalManualList(Object object) {
        List<WTaskInfo> list = new ArrayList<>();

        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        SysUser user = loginUser.getUser();
        List<SysRole> roles = user.getRoles();

        if (RoleName.ACCOUNT_MANAGER.getInfo().equals(roles.get(0).getRoleName())) {
            list = taskInfoService.getWTaskInfoListByRole("预警认定");

        } else {
            // 根据用户id查询代办任务
            Map mapTask = taskWFService.taskWfUser(user.getUserId() + "");
            Set<String> set = new HashSet<>();
            // 只计算在里面的
            List listAll = taskInfoService.selectAllTaskInfoNo();
            Set<Map.Entry<String, String>> entries = mapTask.entrySet();
            Iterator<Map.Entry<String, String>> iterator = entries.iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> next = iterator.next();
                String key = next.getKey();
                String value = next.getValue();

                if (listAll.contains(key)) {

                    if (WFLink.WFLINK1.contains(value))
                        set.add(key);
                }
            }

            // 查询待办箱
            if (set.size() > 0) list = taskInfoService.getWTaskInfoByList1(set);
        }


        return AjaxResult.success(list);
    }

    /**
     * 预警认定-- 反馈和审批提交入口
     *
     * @return AjaxResult
     */
    @GetMapping("/submitTask")
    @Transactional
    public AjaxResult submitTask(@RequestParam("taskInfoNo") String taskInfoNo,
                                 @RequestParam("riskValue") String riskValue,
                                 @RequestParam("radio") Object radio,
                                 @RequestParam("examinValue") String examinValue) {

        logger.info("----submitTask----: 任务编号：{}，审核意见：{}", taskInfoNo, examinValue);

        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        SysUser user = loginUser.getUser();
        List<SysRole> roles = user.getRoles();

        // 反馈员
        Map<String, Object> map = new HashMap<>();
        int i = 0;
        if (RoleName.ACCOUNT_MANAGER.getInfo().equals(roles.get(0).getRoleName())) {
            map.put(WFRole.WFROLE101.getCode(), user.getUserId()); // 预警认定操作人id
            map.put(WFRole.WFROLE102.getCode(), "7"); // 下一环节的人员组
            // 某个任务，启动流程
            runWFService.startWf(taskInfoNo, map);
            // 执行任务
            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, user.getUserId() + "", map);

            logger.info("----taskName----: {}", taskName);
            // 执行成功后 修改w_task_info 表里的状态 run_status
            if (WFLink.WFLINK101.getInfo().equals(taskName)) {
                i = taskInfoService.updateRunStatusByNo(taskInfoNo,riskValue);
            }
            // insert环节流转
            linkLogService.insertWLinkLog(taskInfoNo, "RD", WFLink.WFLINK101.getInfo(), user.getUserName(),
                    SUBMIT_BUTTON, riskValue, examinValue);

        } else if (RoleName.RETAIL_DEPARTMENT_AUDIT.getInfo().equals(roles.get(0).getRoleName())) {
            // 执行预警认定审批任务
            map.put(WFRole.WFROLE103.getCode(), "8"); // 分行风险检测岗审核 组
            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, user.getUserId() + "", map);

            logger.info("----taskName----: {}", taskName);

            // insert环节流转
            if (WFLink.WFLINK102.getInfo().equals(taskName)) {
                linkLogService.insertWLinkLog(taskInfoNo, DealType.RD.getCode(), WFLink.WFLINK102.getInfo(), user.getUserName(),
                        SUBMIT_BUTTON, riskValue, examinValue);
            }
        } else if (RoleName.RISK_DETECTION_POST_AUDIT.getInfo().equals(roles.get(0).getRoleName())) {
            // 执行预警认定审批任务
            map.put(WFRole.WFROLE104.getCode(), "9"); // 分行监测审核岗审核 组
            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, user.getUserId() + "", map);

            logger.info("----taskName----: {}", taskName);

            // insert环节流转
            if (WFLink.WFLINK103.getInfo().equals(taskName)) {
                linkLogService.insertWLinkLog(taskInfoNo, DealType.RD.getCode(), WFLink.WFLINK103.getInfo(), user.getUserName(),
                        SUBMIT_BUTTON, riskValue, examinValue);
            }
        } else if (RoleName.MONITORING_AUDIT_POST_AUDIT.getInfo().equals(roles.get(0).getRoleName())) {
            map.put(WFRole.WFROLE105.getCode(), "10"); // 分行检测主管审核 组
            // 执行预警认定审批任务
            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, user.getUserId() + "", map);

            logger.info("----taskName----: {}", taskName);

            // insert环节流转
            if (WFLink.WFLINK104.getInfo().equals(taskName)) {
                linkLogService.insertWLinkLog(taskInfoNo, DealType.RD.getCode(), WFLink.WFLINK104.getInfo(), user.getUserName(),
                        SUBMIT_BUTTON, riskValue, examinValue);
            }
        } else if (RoleName.INSPECTION_SUPERVISOR_AUDIT.getInfo().equals(roles.get(0).getRoleName())) {
            map.put(WFRole.WFROLE201.getCode(), "6"); // 客户经理处置跟踪 组
            // 执行预警认定审批任务
            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, user.getUserId() + "", map);

            logger.info("----taskName----: {}", taskName);

            // insert环节流转
            if (WFLink.WFLINK105.getInfo().equals(taskName)) {
                linkLogService.insertWLinkLog(taskInfoNo, DealType.RD.getCode(), WFLink.WFLINK105.getInfo(), user.getUserName(),
                        SUBMIT_BUTTON, riskValue, examinValue);
            }
        }

        return AjaxResult.success("成功提交");
    }

    @GetMapping("/getDetail/{taskInfoNo}")
    public AjaxResult getSignalManualDetail(@PathVariable("taskInfoNo") String taskInfoNo) {

        WTaskInfo taskInfo = new WTaskInfo();

        List<TWarnSignal> tWarnSignals = warnSignalService.selectTWarnSignal(taskInfoNo);
        taskInfo.setWarnSignals(tWarnSignals.size() > 0 ? tWarnSignals : null);
        return AjaxResult.success(taskInfo);
    }


}
