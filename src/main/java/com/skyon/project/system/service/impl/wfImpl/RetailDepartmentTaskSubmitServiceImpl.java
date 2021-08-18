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

import java.util.HashMap;
import java.util.Map;

/**
 * 市场零售部门主管
 * 任务的流转 -- 提交
 */
@Service(value = "retailDepartmentTaskSubmitServiceImpl")
public class RetailDepartmentTaskSubmitServiceImpl implements TaskSubmitService, InitializingBean {

    private static final Logger logger =  LoggerFactory.getLogger(ManagerTaskSubmitServiceImpl.class);

    public static final String SUBMIT_BUTTON = "提交";

    @Autowired
    private TaskWFService taskWFService;
    @Autowired
    private WLinkLogService linkLogService;
    @Autowired
    private TokenService tokenService;

    @Override
    public void taskSubmitMethod(TaskInfoSubmitPojo task) {
        Map<String, Object> map = new HashMap<>();
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        SysUser user = loginUser.getUser();

        // 执行预警认定审批任务
        map.put(WFRole.WFROLE104.getCode(), "9"); // 分行监测审核岗审核 组

        // 根据任务编号 - taskInfoNo 执行任务
        String taskName = taskWFService.exeTaskByTaskInfoNo(task.getTaskInfoNo(),
                String.valueOf(user.getUserId()), map);

        logger.info("----taskName----: {}", taskName);

        // insert环节流转
        if (WFLink.WFLINK103.getInfo().equals(taskName)) {
            linkLogService.insertWLinkLog(task.getTaskInfoNo(),
                    DealType.RD.getCode(),
                    WFLink.WFLINK103.getInfo(),
                    user.getUserName(),
                    SUBMIT_BUTTON,
                    JSON.toJSONString(task.getRiskControlMeasures()),
                    task.getExaminValue());
        }
        logger.info("市场零售部门主管 提交");
    }

    /**
     * Bean 初始化时，把该Bean注册进   流程的工厂类 - WfDealRoleRegisterFactory
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        WfDealRoleRegisterFactory.register(RoleName.RETAIL_DEPARTMENT_AUDIT.getInfo(),this);
    }
}
