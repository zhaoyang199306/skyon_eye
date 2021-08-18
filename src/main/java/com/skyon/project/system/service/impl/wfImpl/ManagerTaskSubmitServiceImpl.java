package com.skyon.project.system.service.impl.wfImpl;

import com.alibaba.fastjson.JSON;
import com.skyon.common.enums.DealType;
import com.skyon.common.enums.RoleName;
import com.skyon.common.enums.WFLink;
import com.skyon.common.enums.WFRole;
import com.skyon.common.utils.ServletUtils;
import com.skyon.framework.manager.factory.WfDealRoleRegisterFactory;
import com.skyon.framework.security.LoginUser;
import com.skyon.framework.security.service.TokenService;
import com.skyon.project.system.domain.SysUser;
import com.skyon.project.system.domain.eye.DpApWarningSign;
import com.skyon.project.system.domain.eye.TaskInfoSubmitPojo;
import com.skyon.project.system.service.TWarnSignalService;
import com.skyon.project.system.service.WLinkLogService;
import com.skyon.project.system.service.WTaskInfoService;
import com.skyon.project.system.service.activiti.RunWFService;
import com.skyon.project.system.service.activiti.TaskWFService;
import com.skyon.project.system.service.wf.TaskSubmitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 客户经理
 * 任务的流转 -- 提交
 */
@Service(value = "managerTaskSubmitServiceImpl")
public class ManagerTaskSubmitServiceImpl implements TaskSubmitService, InitializingBean {

    private static final Logger logger = LoggerFactory.getLogger(ManagerTaskSubmitServiceImpl.class);

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
    private TWarnSignalService warnSignalService;
    @Autowired
    private WLinkLogService linkLogService;


    /**
     * 客户经理执行任务  第一次执行  开启流程
     *
     * @param task 参数
     */
    @Override
    @Transactional
    public void taskSubmitMethod(TaskInfoSubmitPojo task) {

        Map<String, Object> map = new HashMap<>();
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        SysUser user = loginUser.getUser();

        map.put(WFRole.WFROLE101.getCode(), user.getUserId()); // 预警认定操作人id
        map.put(WFRole.WFROLE102.getCode(), "7"); // 下一环节的人员组
        map.put("wf", "1"); // wf 走流程1
        // 某个任务，启动流程
        runWFService.startWf(task.getTaskInfoNo(), map);
        // 执行任务
        String taskName = taskWFService.exeTaskByTaskInfoNo(task.getTaskInfoNo(),
                String.valueOf(user.getUserId()), map);

        logger.info("----taskName----: {}", taskName);
//             执行成功后 修改DP_AP_task_info 表里的状态 run_status
        if (WFLink.WFLINK101.getInfo().equals(taskName)) {
            int i = taskInfoService.updateRunStatusByNo(task.getTaskInfoNo(),
                    JSON.toJSONString(task.getRiskControlMeasures()),
                    task.getPersonalRiskLevel(),
                    task.getCheckResult());
            // 修改预警信号列表 的 认定状态
            List<DpApWarningSign> warnSignalList = task.getWarnSignalList();
            if (warnSignalList != null && warnSignalList.size() > 0)
                warnSignalService.updateDpApWarningSign(warnSignalList);
        }

        // insert环节流转
        linkLogService.insertWLinkLog(task.getTaskInfoNo(),
                DealType.RD.getInfo(),
                WFLink.WFLINK101.getInfo(),
                user.getUserName(),
                SUBMIT_BUTTON,
                JSON.toJSONString(task.getRiskControlMeasures()),
                task.getExaminValue());

        logger.info("客户经理 提交");
    }

    /**
     * Bean 初始化时，把该Bean注册进   流程的工厂类 - WfDealRoleRegisterFactory
     *
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        WfDealRoleRegisterFactory.register(RoleName.ACCOUNT_MANAGER.getInfo(), this);
    }
}
