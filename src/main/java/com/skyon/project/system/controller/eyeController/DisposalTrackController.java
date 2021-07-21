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
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/disposalTrack")
public class DisposalTrackController extends BaseController {

    public static final String SUBMIT_BUTTON = "提交";

    @Autowired
    private TaskWFService taskWFService;
    @Autowired
    private TokenService tokenService;
    @Autowired
    private WTaskInfoService taskInfoService;
    @Autowired
    private WLinkLogService linkLogService;
    @Autowired
    private RunWFService runWFService;
    @Autowired
    private WTaskInfoService wTaskInfoService;

    /**
     * 预警认定-- 反馈和审批提交入口
     *
     * @return AjaxResult
     */
    @GetMapping("/submitTrack")
    @Transactional
    public AjaxResult submitTrack(@RequestParam("taskInfoNo") String taskInfoNo,
                                  @RequestParam("examinValue") String examinValue) {

        logger.info("----submitTrack----: 任务编号：{}，审核意见：{}", taskInfoNo, examinValue);

        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        SysUser user = loginUser.getUser();
        List<SysRole> roles = user.getRoles();

        // 反馈员
        Map<String,String> map = new HashMap<>();
        if (RoleName.ACCOUNT_MANAGER.getInfo().equals(roles.get(0).getRoleName())) {
            map.put(WFRole.WFROLE202.getCode(), "7"); // 市场零售部门主管审核 组

            // 执行任务
            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, user.getUserId() + "", map);
            logger.info("----taskName----: {}", taskName);

            // insert环节流转
            if (WFLink.WFLINK201.getInfo().equals(taskName)){
                linkLogService.insertWLinkLog(taskInfoNo, DealType.GZ.getCode(), WFLink.WFLINK201.getInfo(), user.getUserName(),
                        SUBMIT_BUTTON, "", examinValue);
            } else if ("".equals(taskName)){
                map.put("wf", "2"); // wf 走流程2
                map.put(WFRole.WFROLE201.getCode(), "6"); // 客户经理处置跟踪 组
                // 某个任务，启动流程
                runWFService.startWf(taskInfoNo, map);
                // 执行任务
                taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, user.getUserId() + "", map);

                if (WFLink.WFLINK201.getInfo().equals(taskName)){
                    linkLogService.insertWLinkLog(taskInfoNo, DealType.GZ.getCode(), WFLink.WFLINK201.getInfo(), user.getUserName(),
                            SUBMIT_BUTTON, "", examinValue);
                    wTaskInfoService.updateRunStatusByNoAndTrack(taskInfoNo);
                }

            }

        } else if (RoleName.RETAIL_DEPARTMENT_AUDIT.getInfo().equals(roles.get(0).getRoleName())) {
            map.put(WFRole.WFROLE203.getCode(), "8"); // 分行风险检测岗审核 组

            // 执行任务
            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, user.getUserId() + "", map);
            logger.info("----taskName----: {}", taskName);

            // insert环节流转
            if (WFLink.WFLINK202.getInfo().equals(taskName)){
                linkLogService.insertWLinkLog(taskInfoNo, DealType.GZ.getCode(), WFLink.WFLINK202.getInfo(), user.getUserName(),
                        SUBMIT_BUTTON, "", examinValue);
            }
        } else if (RoleName.RISK_DETECTION_POST_AUDIT.getInfo().equals(roles.get(0).getRoleName())) {
            map.put(WFRole.WFROLE204.getCode(), "9"); // 分行监测审核岗审核 组

            // 执行任务
            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, user.getUserId() + "", map);
            logger.info("----taskName----: {}", taskName);

            // insert环节流转
            if (WFLink.WFLINK203.getInfo().equals(taskName)){
                linkLogService.insertWLinkLog(taskInfoNo, DealType.GZ.getCode(), WFLink.WFLINK203.getInfo(), user.getUserName(),
                        SUBMIT_BUTTON, "", examinValue);
            }
        } else if (RoleName.MONITORING_AUDIT_POST_AUDIT.getInfo().equals(roles.get(0).getRoleName())) {
            map.put(WFRole.WFROLE205.getCode(), "10"); // 分行检测主管审核 组

            // 执行任务
            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, user.getUserId() + "", map);
            logger.info("----taskName----: {}", taskName);

            // insert环节流转
            if (WFLink.WFLINK204.getInfo().equals(taskName)){
                linkLogService.insertWLinkLog(taskInfoNo, DealType.GZ.getCode(), WFLink.WFLINK204.getInfo(), user.getUserName(),
                        SUBMIT_BUTTON, "", examinValue);
            }
        } else if (RoleName.INSPECTION_SUPERVISOR_AUDIT.getInfo().equals(roles.get(0).getRoleName())) {
            map.put(WFRole.WFROLE301.getCode(), "6"); // 客户经理 组

            // 执行任务
            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, user.getUserId() + "", map);
            logger.info("----taskName----: {}", taskName);

            // insert环节流转
            if (WFLink.WFLINK205.getInfo().equals(taskName)){
                linkLogService.insertWLinkLog(taskInfoNo, DealType.GZ.getCode(), WFLink.WFLINK205.getInfo(), user.getUserName(),
                        SUBMIT_BUTTON, "", examinValue);
            }
        }

        return AjaxResult.success("成功提交");
    }


    @GetMapping("/list")
    public AjaxResult getSignalManualList(Object object) {
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
                if (WFLink.WFLINK2.contains(value)){
                    set.add(key);
                }
            }
        }

        // 非自营的
        Set proprietarys = taskInfoService.selectIsProprietary();
        // 自营的
        Set noProprietary = taskInfoService.selectIsNoProprietary();
        set.addAll(proprietarys);
        set.addAll(noProprietary);
        // 查询待办箱
        if (set.size() > 0) list = taskInfoService.getWTaskInfoByList1(set);




        return AjaxResult.success(list);
    }

    @GetMapping("/getDetail/{taskInfoNo}")
    public AjaxResult getSignalManualDetail(String taskInfoNo) {
        List list = new ArrayList();
        //   授信信息
        List listOne = new ArrayList();
        Map map = new HashMap();
        map.put("CUST_NAME", "黄官鸥建设发展集团有限公司");
        map.put("ADMIN_BRANCH_NAME", "北京分行");
        map.put("TYPE", "");
        map.put("CONTRACT_NO", "1202202007088661");
        map.put("DUE_DATE", "2021-07-09");
        map.put("CREDIT_BALANCE", "20000");
        map.put("GUARANTEE_METHOD", "");
        listOne.add(map);
        list.add(listOne);

        //   人工预警信息
        List litstwo = new ArrayList();
        Map maptwo = new HashMap();
        maptwo.put("waringValue", "风险信息描述 欺诈");
        list.add(maptwo);

        //   风险提示单设置
        List litsThree = new ArrayList();
        Map maptThreeo = new HashMap();
        maptThreeo.put("radio", "1");
        maptThreeo.put("riskValue", "风险提示单 欺诈");
        litsThree.add(maptThreeo);
        list.add(litsThree);

        //   审核意见
        List litsFour = new ArrayList();
        Map maptFour = new HashMap();
        maptFour.put("radioExamine", "2");
        maptFour.put("examineValue", "不同意");
        litsFour.add(maptFour);
        list.add(litsFour);


        return AjaxResult.success(list);
    }


}
