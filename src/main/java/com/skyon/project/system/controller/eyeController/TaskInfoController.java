package com.skyon.project.system.controller.eyeController;

import com.alibaba.fastjson.JSON;
import com.jcraft.jsch.HASH;
import com.skyon.common.enums.DealType;
import com.skyon.common.enums.RoleName;
import com.skyon.common.enums.WFLink;
import com.skyon.common.enums.WFRole;
import com.skyon.common.utils.ServletUtils;
import com.skyon.common.utils.spring.SpringUtils;
import com.skyon.framework.manager.factory.WfDealRoleRegisterFactory;
import com.skyon.framework.security.LoginUser;
import com.skyon.framework.security.service.TokenService;
import com.skyon.framework.web.controller.BaseController;
import com.skyon.framework.web.domain.AjaxResult;
import com.skyon.project.system.domain.SysRole;
import com.skyon.project.system.domain.SysUser;
import com.skyon.project.system.domain.eye.DpApWarningSign;
import com.skyon.project.system.domain.eye.TaskInfoSubmitPojo;
import com.skyon.project.system.domain.ferghana.DpApTaskInfo;
import com.skyon.project.system.service.*;
import com.skyon.project.system.service.activiti.RunWFService;
import com.skyon.project.system.service.activiti.TaskWFService;
import com.skyon.project.system.service.impl.SysDictDataServiceImpl;
import com.skyon.project.system.service.wf.TaskSubmitService;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.net.*;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Stream;

@RestController
@RequestMapping("/taskInfo")
public class TaskInfoController extends BaseController {

    public static final String SUBMIT_BUTTON = "??????";

    public static final String EARLY_WARN_COGNIZANCE = "????????????";

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
        List<DpApTaskInfo> list = new ArrayList<>();

        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());


        SysUser user = loginUser.getUser();
        List<SysRole> roles = user.getRoles();

        if (RoleName.ACCOUNT_MANAGER.getInfo().equals(roles.get(0).getRoleName())) { // ?????? ?????? ??????  ??????
            // ?????? ???????????? ????????????  ????????? ??? ?????????
            list = taskInfoService.getWTaskInfoListByRole(EARLY_WARN_COGNIZANCE);

        } else {
            // ????????????id??????????????????
            Map mapTask = taskWFService.taskWfUser(String.valueOf(user.getUserId()));
            Set<String> set = new HashSet<>();
            // ?????????????????????
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

            // ???????????????
            if (set.size() > 0) list = taskInfoService.getWTaskInfoByList1(set);
        }


        return AjaxResult.success(list);
    }

    /**
     * ????????????-- ???????????????????????????
     *
     * @return AjaxResult
     * @RequestParam("taskInfoNo") String taskInfoNo,
     * @RequestParam("riskControlMeasures") String riskControlMeasures,
     * @RequestParam("radio") Object radio,
     * @RequestParam("examinValue") String examinValue,
     * @RequestParam("personalRiskLevel") String personalRiskLevel,
     * @RequestParam("checkResult") String checkResult,
     * DpApWarningSign warnSignalList
     */

    @PostMapping("/submitTask")
    @Transactional
    public AjaxResult submitTask(@RequestBody TaskInfoSubmitPojo pojo) throws IOException {

        List<DpApWarningSign> warnSignalList = pojo.getWarnSignalList();
        String checkResult = pojo.getCheckResult();
        String examinValue = pojo.getExaminValue();
        String personalRiskLevel = pojo.getPersonalRiskLevel();
        String riskControlMeasures = JSON.toJSONString(pojo.getRiskControlMeasures());
        String taskInfoNo = pojo.getTaskInfoNo();
        Object radio = pojo.getRadio();

        logger.info("----submitTask----: ???????????????{}??????????????????{}", taskInfoNo, examinValue);

        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        SysUser user = loginUser.getUser();
        List<SysRole> roles = user.getRoles();

        // ?????????
        Map<String, Object> map = new HashMap<>();
        int i = 0;

        /**
         * if(????????????){
         *      ??????
         * } eles if(??????????????????????????????){
         *      ??????
         * } else{
         *
         * }
         */

        TaskSubmitService service = WfDealRoleRegisterFactory.getService(roles.get(0).getRoleName());
        service.taskSubmitMethod(pojo);

        if (RoleName.ACCOUNT_MANAGER.getInfo().equals(roles.get(0).getRoleName())) {

        } else if (RoleName.RETAIL_DEPARTMENT_AUDIT.getInfo().equals(roles.get(0).getRoleName())) {

        } else if (RoleName.RISK_DETECTION_POST_AUDIT.getInfo().equals(roles.get(0).getRoleName())) {
            // ??????????????????????????????
            map.put(WFRole.WFROLE104.getCode(), "9"); // ??????????????????????????? ???
            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, String.valueOf(user.getUserId()), map);

            logger.info("----taskName----: {}", taskName);

            // insert????????????
            if (WFLink.WFLINK103.getInfo().equals(taskName)) {
                linkLogService.insertWLinkLog(taskInfoNo, DealType.RD.getCode(), WFLink.WFLINK103.getInfo(), user.getUserName(),
                        SUBMIT_BUTTON, riskControlMeasures, examinValue);
            }
        } else if (RoleName.MONITORING_AUDIT_POST_AUDIT.getInfo().equals(roles.get(0).getRoleName())) {
            map.put(WFRole.WFROLE105.getCode(), "10"); // ???????????????????????? ???
            // ??????????????????????????????
            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, String.valueOf(user.getUserId()), map);

            logger.info("----taskName----: {}", taskName);

            // insert????????????
            if (WFLink.WFLINK104.getInfo().equals(taskName)) {
                linkLogService.insertWLinkLog(taskInfoNo, DealType.RD.getCode(), WFLink.WFLINK104.getInfo(), user.getUserName(),
                        SUBMIT_BUTTON, riskControlMeasures, examinValue);
            }
        } else if (RoleName.INSPECTION_SUPERVISOR_AUDIT.getInfo().equals(roles.get(0).getRoleName())) {
            map.put(WFRole.WFROLE201.getCode(), "6"); // ???????????????????????? ???
            // ??????????????????????????????
            String taskName = taskWFService.exeTaskByTaskInfoNo(taskInfoNo, String.valueOf(user.getUserId()), map);

            logger.info("----taskName----: {}", taskName);

            // insert????????????
            if (WFLink.WFLINK105.getInfo().equals(taskName)) {
                linkLogService.insertWLinkLog(taskInfoNo, DealType.RD.getCode(), WFLink.WFLINK105.getInfo(), user.getUserName(),
                        SUBMIT_BUTTON, riskControlMeasures, examinValue);
            }
        }

        return AjaxResult.success("????????????");
    }

    /**
     * ????????????????????????????????????
     * @param taskInfoNo ????????????
     * @return
     */
    @GetMapping("/getDetail/{taskInfoNo}")
    public AjaxResult getSignalManualDetail(@PathVariable("taskInfoNo") String taskInfoNo) {

        DpApTaskInfo dpApTaskInfo = taskInfoService.selectDpApTaskInfoByTaskInfoNo(taskInfoNo);

        return AjaxResult.success(dpApTaskInfo);
    }


}
