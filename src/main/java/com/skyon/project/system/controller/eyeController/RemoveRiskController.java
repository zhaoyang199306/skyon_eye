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
import com.skyon.project.system.service.WLinkLogService;
import com.skyon.project.system.service.WTaskInfoService;
import com.skyon.project.system.service.activiti.RunWFService;
import com.skyon.project.system.service.activiti.TaskWFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/removeRisk")
public class RemoveRiskController extends BaseController {

    public static final String SUBMIT_BUTTON = "提交";

    @Autowired
    private RunWFService runWFService;
    @Autowired
    private TaskWFService taskWFService;
    @Autowired
    private TokenService tokenService;
    @Autowired
    private WTaskInfoService taskInfoService;
    @Autowired
    private WLinkLogService linkLogService;

    /**
     * 预警认定-- 反馈和审批提交入口
     *
     * @return AjaxResult
     */
    @GetMapping("/submitRemove")
    @Transactional
    public AjaxResult submitRemove(@RequestParam("taskInfoNo") String taskInfoNo
            , @RequestParam("examineValue") String examineValue) {

        logger.info("----submitTask----: 任务编号：{}，审核意见：{}", taskInfoNo, examineValue);
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        SysUser user = loginUser.getUser();
        List<SysRole> roles = user.getRoles();

        // 解除预警
        Map<String, String> map = new HashMap<>();

        if (RoleName.ACCOUNT_MANAGER.getInfo().equals(roles.get(0).getRoleName())) {
            map.put(WFRole.WFROLE302.getCode(), "7"); // 市场零售部门主管审核 组

            // 执行任务
            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, user.getUserId() + "", map);
            logger.info("----taskName----: {}", taskName);

            // insert环节流转
            if (WFLink.WFLINK301.getInfo().equals(taskName)) {
                linkLogService.insertWLinkLog(taskInfoNo, DealType.JC.getCode(), WFLink.WFLINK301.getInfo(), user.getUserName(),
                        SUBMIT_BUTTON, "", examineValue);
            }

        } else if (RoleName.RETAIL_DEPARTMENT_AUDIT.getInfo().equals(roles.get(0).getRoleName())) {
            map.put(WFRole.WFROLE303.getCode(), "8"); // 分行风险检测岗审核 组

            // 执行任务
            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, user.getUserId() + "", map);
            logger.info("----taskName----: {}", taskName);

            // insert环节流转
            if (WFLink.WFLINK302.getInfo().equals(taskName)) {
                linkLogService.insertWLinkLog(taskInfoNo, DealType.JC.getCode(), WFLink.WFLINK302.getInfo(), user.getUserName(),
                        SUBMIT_BUTTON, "", examineValue);
            }
        } else if (RoleName.RISK_DETECTION_POST_AUDIT.getInfo().equals(roles.get(0).getRoleName())) {
            map.put(WFRole.WFROLE304.getCode(), "9"); // 分行监测审核岗审核 组

            // 执行任务
            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, user.getUserId() + "", map);
            logger.info("----taskName----: {}", taskName);

            // insert环节流转
            if (WFLink.WFLINK303.getInfo().equals(taskName)) {
                linkLogService.insertWLinkLog(taskInfoNo, DealType.JC.getCode(), WFLink.WFLINK303.getInfo(), user.getUserName(),
                        SUBMIT_BUTTON, "", examineValue);
            }
        } else if (RoleName.MONITORING_AUDIT_POST_AUDIT.getInfo().equals(roles.get(0).getRoleName())) {
            map.put(WFRole.WFROLE305.getCode(), "10"); // 分行检测主管审核 组

            // 执行任务
            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, user.getUserId() + "", map);
            logger.info("----taskName----: {}", taskName);

            // insert环节流转
            if (WFLink.WFLINK304.getInfo().equals(taskName)) {
                linkLogService.insertWLinkLog(taskInfoNo, DealType.JC.getCode(), WFLink.WFLINK304.getInfo(), user.getUserName(),
                        SUBMIT_BUTTON, "", examineValue);
            }
        } else if (RoleName.INSPECTION_SUPERVISOR_AUDIT.getInfo().equals(roles.get(0).getRoleName())) {

            // 执行任务
            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, user.getUserId() + "", map);
            logger.info("----taskName----: {}", taskName);

            // insert环节流转
            if (WFLink.WFLINK305.getInfo().equals(taskName)) {
                linkLogService.insertWLinkLog(taskInfoNo, DealType.JC.getCode(), WFLink.WFLINK305.getInfo(), user.getUserName(),
                        SUBMIT_BUTTON, "", examineValue);
            }
        }

//        if ("解除申请".equals(roles.get(0).getRoleName())) {
//            map.put("userid", user.getUserId()); // 预警认定反馈员id
//            map.put("role", "03"); // 预警认定反馈员id
//            map.put("trackuserid", "4"); // 市场零售部门主管审核   人员id
//            // 某个任务，启动流程
//            runWFService.startWf(taskInfoNo, map);
//            // 执行任务
//            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, user.getUserId() + "", map);
//            System.out.println("----taskName----" + taskName);
//            // 执行成功后 修改w_task_info 表里的状态 run_status
//
//            if ("客户经理申请".equals(taskName)) { // 第一个节点名
//                i = taskInfoService.updateRunStatusByNo(taskInfoNo);
//            }
//            // insert环节流转
//            linkLogService.insertWLinkLog(taskInfoNo, "JC", "客户经理申请", user.getUserName(),
//                    "提交", "", examineValue);
//
//        } else if ("市场零售部门主管审核".equals(roles.get(0).getRoleName())) {
//            // 执行预警认定审批任务
//            map.put("trackuserid", user.getUserId()); // 市场零售部门主管审核员  id
//            map.put("tracktwogroup","8"); // 分行风险检测岗审核 组
//            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, user.getUserId() + "", map);
//
//            System.out.println("----taskName----" + taskName);
//            // 任务跟踪反馈分配人
//            taskWFService.claimAssigneeByTaskInfoNo(taskInfoNo, "5");
//            // insert环节流转
//            if ("市场零售部门主管审核".equals(taskName)) {
//                linkLogService.insertWLinkLog(taskInfoNo, "JC", "市场零售部门主管审核", user.getUserName(),
//                        "提交", "", examineValue);
//            }
//        } else if ("分行风险检测岗审核".equals(roles.get(0).getRoleName())) {
//            // 执行预警认定审批任务
//            map.put("removeonegroup","9"); // 跟踪审批员组 id
//            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, user.getUserId() + "", map);
//
//            System.out.println("----taskName----" + taskName);
//            // insert环节流转
//            if ("分行风险检测岗审核".equals(taskName)) {
//                linkLogService.insertWLinkLog(taskInfoNo, "JC", "分行风险检测岗审核", user.getUserName(),
//                        "提交", "", examineValue);
//            }
//        } else if ("分行监测审核岗审核".equals(roles.get(0).getRoleName())) {
//            // 执行预警认定审批任务
//            map.put("test_director","10"); // 跟踪审批员组 id
//            map.put("role","03"); // 跟踪审批员组 id
//            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, user.getUserId() + "", map);
//
//            System.out.println("----taskName----" + taskName);
//            // insert环节流转
//            if ("分行监测审核岗审核".equals(taskName)) {
//                linkLogService.insertWLinkLog(taskInfoNo, "JC", "分行监测审核岗审核", user.getUserName(),
//                        "提交", "", examineValue);
//            }
//        } else if ("分行检测主管审核".equals(roles.get(0).getRoleName())) {
//            // 执行预警认定审批任务
//            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, user.getUserId() + "", map);
//
//            System.out.println("----taskName----" + taskName);
//            // insert环节流转
//            if ("分行检测主管审核".equals(taskName)) {
//                linkLogService.insertWLinkLog(taskInfoNo, "JC", "分行检测主管审核", user.getUserName(),
//                        "提交", "", examineValue);
//            }
//        }

        return AjaxResult.success("成功提交");
    }


    @GetMapping("/list")
    public AjaxResult getRemoveRiskList(Object object) {

        List list = new ArrayList();

        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        SysUser user = loginUser.getUser();

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
                if (WFLink.WFLINK3.contains(value)) {
                    set.add(key);
                }
            }
        }

        // 查询待办箱
        if (set.size() > 0) list = taskInfoService.getWTaskInfoByList1(set);

//        List list = new ArrayList();
//
//        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
//        SysUser user = loginUser.getUser();
//        List<SysRole> roles = user.getRoles();
//
//
//        if ("预警认定".equals(roles.get(0).getRoleName()) || "跟踪反馈".equals(roles.get(0).getRoleName()) || "解除申请".equals(roles.get(0).getRoleName())) {
//            list = taskInfoService.getWTaskInfoListByRole("解除申请");
//
//        }else if ("市场零售部门主管审核".equals(roles.get(0).getRoleName()) || "分行风险检测岗审核".equals(roles.get(0).getRoleName()) || "分行监测审核岗审核".equals(roles.get(0).getRoleName())) {
//            // 根据用户id查询代办任务
//            List listNo = taskWFService.taskWfUser(user.getUserId() + "");
//            // 查询待办箱
//            if (listNo.size() > 0) list = taskInfoService.getWTaskInfoByList3(listNo);

//        }
//
//        List list = new ArrayList();
//
//        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
//        SysUser user = loginUser.getUser();
//
//        // 根据用户id查询代办任务 id
//        List listNO = taskWFService.taskWfUser(user.getUserId() + "");
//        // 查询待办箱
//        if (listNO.size() > 0) list = taskInfoService.getWTaskInfoByList(listNO);

        return AjaxResult.success(list);
    }

    @GetMapping("/getDetail/{taskInfoNo}")
    public AjaxResult getRemoveRiskDetail(String taskInfoNo) {
        List list = new ArrayList();
        //   授信信息
        List listOne = new ArrayList();
        Map map = new HashMap();
        map.put("q", "JC20210224001");
        map.put("w", "客户经理");
        map.put("e", "萧杰");
        map.put("r", "提交");
        map.put("t", "2021-02-24 13:16:13");
        map.put("y", "qq");
        Map map2 = new HashMap();
        map2.put("q", "JC20210224001");
        map2.put("w", "支行主管");
        map2.put("e", "袁酷");
        map2.put("r", "提交");
        map2.put("t", "2021-02-24 13:19:13");
        map2.put("y", "ww");
        listOne.add(map2);
        Map map3 = new HashMap();
        map3.put("q", "JC20210224001");
        map3.put("w", "分行风险检查岗");
        map3.put("e", "徐伟");
        map3.put("r", "提交");
        map3.put("t", "2021-02-24 13:21q:13");
        map3.put("y", "ee");
        listOne.add(map3);
        list.add(listOne);


        return AjaxResult.success(list);
    }

    public static void main(String[] args) {

        System.out.println(Math.round(11.5));
        System.out.println(Math.round(11.4));
        System.out.println(Math.round(11.6));

        System.out.println(Math.round(-11.5));
        System.out.println(Math.round(-11.4));
        System.out.println(Math.round(-11.6));
    }


}
