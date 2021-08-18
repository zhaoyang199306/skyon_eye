package com.skyon.project.system.controller.eyeController;

import com.skyon.framework.web.controller.BaseController;
import com.skyon.framework.web.domain.AjaxResult;
import com.skyon.project.system.domain.ferghana.DpApTaskInfo;
import com.skyon.project.system.service.SignalManualSevice;
import com.skyon.project.system.service.WTaskInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 人工信号录入类
 */
@RestController
@RequestMapping("/signalManual")
public class SignalManualController extends BaseController {

    @Autowired
    private SignalManualSevice signalManualSevice;

    @Autowired
    private WTaskInfoService taskInfoService;


    //    保存form
    @PostMapping("/submitForm")
    @Transactional
    public AjaxResult submitForm(@RequestBody DpApTaskInfo dpApTaskInfo) {

        System.out.println("--signalManual/submitForm");
        dpApTaskInfo.setIsManualInput("1");
        int i = taskInfoService.insertWTaskInfo(dpApTaskInfo);
        if (i > 0) {
            return AjaxResult.success("成功新增人工信号");
        }
        return AjaxResult.error("新增人工信号失败");
    }


    @GetMapping("/list")
    public AjaxResult getSignalManualList(Object object) {
//        startPage();
        List manuallist = signalManualSevice.getSignalManualList();
        return AjaxResult.success(manuallist);
    }

    @GetMapping("/getDetail/{custNo}")
    public AjaxResult getSignalManualDetail(@PathVariable("custNo") String custNo) {

        List list = new ArrayList();

        DpApTaskInfo taskInfo = signalManualSevice.getWTaskInfoListManualByCustNo(custNo);

        return AjaxResult.success(list);
    }



}
