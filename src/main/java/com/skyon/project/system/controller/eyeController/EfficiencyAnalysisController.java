package com.skyon.project.system.controller.eyeController;

import com.skyon.common.utils.DateUtils;
import com.skyon.framework.web.controller.BaseController;
import com.skyon.framework.web.domain.AjaxResult;
import com.skyon.project.system.domain.eye.EfficiencyAnalysisData;
import com.skyon.project.system.service.EfficiencyAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("efficiencyAnalysis")
public class EfficiencyAnalysisController extends BaseController {

    @Autowired
    private EfficiencyAnalysisService effService;


    @GetMapping("/list/{dateString}")
    public AjaxResult getAllData(@PathVariable String dateString) {
        logger.info("----getAllData---的日期：{}", dateString);
        EfficiencyAnalysisData data = effService.getEfficiencyAnalysisData(dateString);
        return AjaxResult.success(data);
//        try {
//
//
//        } catch (Exception ignored){
//            logger.error(ignored.getMessage());
//            return AjaxResult.error("效能分析查询报错");
//        }

    }


}
