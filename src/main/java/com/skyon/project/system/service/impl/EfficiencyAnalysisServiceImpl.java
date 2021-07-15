package com.skyon.project.system.service.impl;

import com.skyon.common.utils.DateUtils;
import com.skyon.common.utils.StringUtils;
import com.skyon.project.system.domain.eye.*;
import com.skyon.project.system.mapper.eye.*;
import com.skyon.project.system.service.EfficiencyAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EfficiencyAnalysisServiceImpl implements EfficiencyAnalysisService {

    @Autowired
    private DpRmMonViewMapper dpRmMonViewMapper; // 总体概览
    @Autowired
    private DpRmMonUnPriProMapper dpRmMonUnPriProMapper; // 非自营产品情况
    @Autowired
    private DpRmMonUnPriProTotalMapper dpRmMonUnPriProTotalMapper; // 自营产品风险客户情况统计
    @Autowired
    private DpRmMonUnPriProPreMapper dpRmMonUnPriProPreMapper; // 自营产品风险客户情况_个人
    @Autowired
    private DpRmMonUnPriProMicMapper dpRmMonUnPriProMicMapper; // 自营产品风险客户情况_小微
    @Autowired
    private DpRmMonAgrUndraStoMapper dpRmMonAgrUndraStoMapper; // 已批未提、存量授信客户情况
    @Autowired
    private DpRmMonTaskOveMapper dpRmMonTaskOveMapper; // 任务超期情况

    //---
    @Autowired
    private DpRmMonRuleSysIngMapper dpRmMonRuleSysIngMapper; // 系统运营分析    DP_RM_MON_RULE_SYS_ING


    // 查询效能分析全数据
    @Override
    public EfficiencyAnalysisData getEfficiencyAnalysisData(String dateString) {
        String ymDate = DateUtils.getYMDate(dateString);

        EfficiencyAnalysisData data = new EfficiencyAnalysisData();
        // 总体概览
        List<DpRmMonView> dpRmMonViews = dpRmMonViewMapper.selectDpRmMonView(ymDate);
        data.setDpRmMonViews(dpRmMonViews.size() == 0 ? null : dpRmMonViews);

        // 非自营产品情况
        List<DpRmMonUnPriPro> dpRmMonUnPriPros = dpRmMonUnPriProMapper.selectDpRmMonUnPriPro(ymDate);
        data.setDpRmMonUnPriPros(dpRmMonUnPriPros.size() == 0 ? null : dpRmMonUnPriPros);
        //
        List<DpRmMonUnPriProTotal> totals = dpRmMonUnPriProTotalMapper.selectDpRmMonUnPriProTotal(ymDate);
        data.setDpRmMonUnPriProTotals(totals.size() == 0 ? null : totals);

        // 自营产品风险客户情况_个人
        List<DpRmMonUnPriProPre> dpRmMonUnPriProPres = dpRmMonUnPriProPreMapper.selectDpRmMonUnPriProPre(ymDate);
        data.setDpRmMonUnPriProPres(dpRmMonUnPriProPres.size() == 0 ? null : dpRmMonUnPriProPres);

        // 自营产品风险客户情况_小微
        List<DpRmMonUnPriProMic> dpRmMonUnPriProMics = dpRmMonUnPriProMicMapper.selectDpRmMonUnPriProMic(ymDate);
        data.setDpRmMonUnPriProMics(dpRmMonUnPriProMics.size() == 0 ? null : dpRmMonUnPriProMics);

        // 已批未提、存量授信客户情况
        List<DpRmMonAgrUndraSto> dpRmMonAgrUndraStos = dpRmMonAgrUndraStoMapper.selectDpRmMonAgrUndraSto(ymDate);
        data.setDpRmMonAgrUndraStos(dpRmMonAgrUndraStos.size() == 0 ? null : dpRmMonAgrUndraStos);

        // 任务超期情况
        List<DpRmMonTaskOve> dpRmMonTaskOves = dpRmMonTaskOveMapper.selectDpRmMonTaskOve(ymDate);
        data.setDpRmMonTaskOves(dpRmMonTaskOves.size() == 0 ? null : dpRmMonTaskOves);


        // 系统运营分析总体概览
        List<DpRmMonRuleSysIng> sum = dpRmMonRuleSysIngMapper.selectDpRmMonRuleSysIngSum(ymDate.replaceAll("-", ""));
        int sumMonth = getSumMonth(dateString);
        List<DpRmMonRuleSysIng> dpRmMonRuleSysIngs = dpRmMonRuleSysIngMapper.selectDpRmMonRuleSysIngQuarter(ymDate, sumMonth);
        if (sumMonth == 10) {
            sum.add(countDpRmMonRuleSysIng(dpRmMonRuleSysIngs.get(7), dpRmMonRuleSysIngs.get(8), dpRmMonRuleSysIngs.get(9)));
            sum.add(countDpRmMonRuleSysIng(dpRmMonRuleSysIngs.get(4), dpRmMonRuleSysIngs.get(5), dpRmMonRuleSysIngs.get(6)));
            sum.add(countDpRmMonRuleSysIng(dpRmMonRuleSysIngs.get(1), dpRmMonRuleSysIngs.get(2), dpRmMonRuleSysIngs.get(3)));
            sum.add(dpRmMonRuleSysIngs.get(0));
        } else if (sumMonth == 11) {
            sum.add(countDpRmMonRuleSysIng(dpRmMonRuleSysIngs.get(8), dpRmMonRuleSysIngs.get(9), dpRmMonRuleSysIngs.get(10)));
            sum.add(countDpRmMonRuleSysIng(dpRmMonRuleSysIngs.get(5), dpRmMonRuleSysIngs.get(6), dpRmMonRuleSysIngs.get(7)));
            sum.add(countDpRmMonRuleSysIng(dpRmMonRuleSysIngs.get(2), dpRmMonRuleSysIngs.get(3), dpRmMonRuleSysIngs.get(4)));
            sum.add(countDpRmMonRuleSysIng(dpRmMonRuleSysIngs.get(0), dpRmMonRuleSysIngs.get(1)));
        } else if (sumMonth == 12) {
            sum.add(countDpRmMonRuleSysIng(dpRmMonRuleSysIngs.get(9), dpRmMonRuleSysIngs.get(10), dpRmMonRuleSysIngs.get(11)));
            sum.add(countDpRmMonRuleSysIng(dpRmMonRuleSysIngs.get(6), dpRmMonRuleSysIngs.get(7), dpRmMonRuleSysIngs.get(8)));
            sum.add(countDpRmMonRuleSysIng(dpRmMonRuleSysIngs.get(3), dpRmMonRuleSysIngs.get(4), dpRmMonRuleSysIngs.get(5)));
            sum.add(countDpRmMonRuleSysIng(dpRmMonRuleSysIngs.get(0), dpRmMonRuleSysIngs.get(1), dpRmMonRuleSysIngs.get(2)));
        }
        data.setDpRmMonRuleSysIng(sum);

        // 预警余额统计
        List<DpRmMonRuleSysIng> bals = dpRmMonRuleSysIngMapper.selectDpRmMonRuleSysIngBal(ymDate.replaceAll("-", ""));
        data.setBals(bals.size() == 0 ? null : bals);


        return data;
    }

    /**
     * 把同一个季度的三个月份的属性加起来
     *
     * @param ings 同一季度的
     * @return
     */
    private DpRmMonRuleSysIng countDpRmMonRuleSysIng(DpRmMonRuleSysIng... ings) {
        DpRmMonRuleSysIng ing = new DpRmMonRuleSysIng(true);
        for (int i = 0; i < ings.length; i++) {
            DpRmMonRuleSysIng ing1 = ings[i];
            ing.setWarnCustNum(ing.getWarnCustNum() + ing1.getWarnCustNum());
            ing.setWarnCustBal(ing.getWarnCustBal().add(ing1.getWarnCustBal()));
            ing.setWarnCustRate(ing.getWarnCustRate().add(ing1.getWarnCustRate()));
            ing.setAccidCustNum(ing.getAccidCustNum() + ing1.getAccidCustNum());
            ing.setAccidCustBal(ing.getAccidCustBal().add(ing1.getAccidCustBal()));
            ing.setAccidCustRate(ing.getAccidCustRate().add(ing1.getAccidCustRate()));
            ing.setHitCustNum(ing.getWarnCustNum() + ing1.getHitCustNum());
            ing.setHitCustBal(ing.getHitCustBal().add(ing1.getHitCustBal()));
            ing.setHitCustRate(ing.getHitCustRate().add(ing1.getHitCustRate()));

            ing.setAffNum(ing.getAffNum() + ing1.getAffNum());
            ing.setAffRiskCustNum(ing.getAffRiskCustNum() + ing1.getAffRiskCustNum());
            ing.setArtAffNum(ing.getArtAffNum() + ing1.getArtAffNum());
            ing.setArtAffRigNum(ing.getArtAffRigNum() + ing1.getArtAffRigNum());
            ing.setArtAffRigRate(ing.getArtAffRigRate().add(ing1.getArtAffRigRate()));
            ing.setSysAffNum(ing.getSysAffNum() + ing1.getSysAffNum());
            ing.setSysAffRigNum(ing.getSysAffRigNum() + ing1.getSysAffRigNum());
            ing.setSysAffRigRate(ing.getSysAffRigRate().add(ing1.getSysAffRigRate()));

            ing.setArtAffWrgNum(ing.getArtAffWrgNum() + ing1.getArtAffWrgNum());
            ing.setArtAffWrgBal(ing.getArtAffWrgBal().add(ing1.getArtAffWrgBal()));
            ing.setArtAffWrgRate(ing.getArtAffWrgRate().add(ing1.getArtAffWrgRate()));
            ing.setSysAffWrgNum(ing.getSysAffWrgNum() + ing1.getSysAffWrgNum());
            ing.setSysAffWrgBal(ing.getSysAffWrgBal().add(ing1.getSysAffWrgBal()));
            ing.setSysAffWrgRate(ing.getSysAffWrgRate().add(ing1.getSysAffWrgRate()));

            ing.setMisDeteNum(ing.getMisDeteNum() + ing1.getMisDeteNum());
            ing.setMisDeteBal(ing.getMisDeteBal().add(ing1.getMisDeteBal()));
            ing.setMisDeteRate(ing.getMisDeteRate().add(ing1.getMisDeteRate()));
            ing.setMisinNum(ing.getMisinNum() + ing1.getMisinNum());
            ing.setMisinBal(ing.getMisinBal().add(ing1.getMisinBal()));
            ing.setMisinRate(ing.getMisinRate().add(ing1.getMisinRate()));

        }
        return ing;
    }

    /**
     * @param dateString 页面时间参数  ： 2021-07  -> 10月
     * @return 返回该时间往前查找4个季度，共多少月
     */
    private int getSumMonth(String dateString) {
        Date date = new Date(dateString);
        int month = date.getMonth() + 1;
        if (month % 3 == 1) {
            return 10;
        } else if (month % 3 == 2) {
            return 11;
        } else if (month % 3 == 0) {
            return 12;
        }
        return 0;

    }


}
