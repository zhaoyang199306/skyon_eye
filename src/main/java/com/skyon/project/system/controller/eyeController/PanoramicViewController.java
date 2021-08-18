package com.skyon.project.system.controller.eyeController;

import com.skyon.framework.web.controller.BaseController;
import com.skyon.framework.web.domain.AjaxResult;
import com.skyon.project.system.domain.PanoramicRiskViewTotal;
import com.skyon.project.system.domain.ferghana.DpApTaskInfo;
import com.skyon.project.system.service.PanoramicViewService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j
@RequestMapping("/panoramicView")
public class PanoramicViewController extends BaseController {

    @Autowired
    private PanoramicViewService panoramicViewService;

    @GetMapping("/list")
    public AjaxResult getList(DpApTaskInfo dpApTaskInfo) {
        startPage();
        List list = panoramicViewService.selectPanoramicViewList();
        return AjaxResult.success(list);
    }

    /**
     * 根据客户号查询详细信息
     *
     * @param custNo 客户号
     * @return
     */
    @GetMapping("/detail")
    public AjaxResult getDetailInfo(@RequestParam("custNo") String custNo,
                                    @RequestParam("custType") String custType) {
        logger.info("----getDetailInfo参数  custNo:{} ----custType:{}", custNo, custType);
        Object domin = panoramicViewService.getCustInfoByNo(custNo, custType);
        return AjaxResult.success(domin);
    }

    @GetMapping("/riskView/{custNo}")
    public AjaxResult getRiskViewInfo(@PathVariable String custNo){
        logger.info("------------getRiskViewInfo  参数：custNo：{}",custNo);
        PanoramicRiskViewTotal total = panoramicViewService.getPanoramicRiskViewTotalByNo(custNo);
        return AjaxResult.success(total);
    }

    /**
     * 查询征信信息系
     * @param custNo 客户号
     * @param custType 客户类型
     * @return
     */
    @GetMapping("/getCredit")
    public AjaxResult getCredit(@RequestParam("custNo") String custNo,
                                @RequestParam("custType") String custType){
        logger.info("----getCredit 参数  custNo:{} ----custType:{}", custNo, custType);
        PanoramicRiskViewTotal creditTotal = panoramicViewService.getPanoramicCreditTotalByNo(custNo);
        return AjaxResult.success(creditTotal);
    }

    /**
     * 查询关联图谱
     * @param custNo 客户号
     * @param custType 客户类型
     * @return
     */
    @GetMapping("/getRelation")
    public AjaxResult getRelation(@RequestParam("custNo") String custNo,
                                @RequestParam("custType") String custType){
        logger.info("----getRelation 参数  custNo:{} ----custType:{}", custNo, custType);
        PanoramicRiskViewTotal relationMap = panoramicViewService.getPanoramicRelationMapByNo(custNo);
        return AjaxResult.success(relationMap);
    }

    /**
     * 查询全融资图
     * @param custNo 客户号
     * @param custType 客户类型
     * @return
     */
    @GetMapping("/getFinacing")
    public AjaxResult getFinacing(@RequestParam("custNo") String custNo,
                                  @RequestParam("custType") String custType){
        logger.info("----getFinacing 参数  custNo:{} ----custType:{}", custNo, custType);
        PanoramicRiskViewTotal finacing = panoramicViewService.getPanoramicFinacingByNo(custNo);
        return AjaxResult.success(finacing);
    }

}
