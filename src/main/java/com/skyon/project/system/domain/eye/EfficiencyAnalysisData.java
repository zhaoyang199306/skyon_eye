package com.skyon.project.system.domain.eye;

import java.util.List;

/**
 * 效能分析总实体
 */
public class EfficiencyAnalysisData {

//    -----------------------预警情况概览-----------------------------

    private List<DpRmMonView> dpRmMonViews; // 总体概览  DP_RM_MON_VIEW

    private List<DpRmMonUnPriPro> dpRmMonUnPriPros; // 非自营产品情况  DP_RM_MON_UN_PRI_PRO

    private List<DpRmMonUnPriProTotal> dpRmMonUnPriProTotals; // 非自营产品情况统计

    private List<DpRmMonUnPriProPre> dpRmMonUnPriProPres; // 自营产品风险客户情况_个人  DP_RM_MON_UN_PRI_PRO_PRE

    private List<DpRmMonUnPriProMic> dpRmMonUnPriProMics; // 自营产品风险客户情况_小微   DP_RM_MON_UN_PRI_PRO_MIC

    private List<DpRmMonAgrUndraSto> dpRmMonAgrUndraStos; // 已批未提、存量授信客户情况   DP_RM_MON_AGR_UNDRA_STO

    private List<DpRmMonTaskOve> dpRmMonTaskOves; // 任务超期情况   DP_RM_MON_TASK_OVE


//    -----------------------系统运行分析-----------------------------

    private List<DpRmMonRuleSysIng> dpRmMonRuleSysIng; // 系统运营分析    DP_RM_MON_RULE_SYS_ING

    private List<DpRmMonRuleSysIng> bals; // 系统运营分析    DP_RM_MON_RULE_SYS_ING



//    -----------------------信号维度分析-----------------------------
    private List<List<DpRmMonRuleSignal>> dpRmMonRuleSignals; // DP_RM_MON_RULE_SIGNAL



//    -----------------------get/set-----------------------------


    public List<List<DpRmMonRuleSignal>> getDpRmMonRuleSignals() {
        return dpRmMonRuleSignals;
    }

    public void setDpRmMonRuleSignals(List<List<DpRmMonRuleSignal>> dpRmMonRuleSignals) {
        this.dpRmMonRuleSignals = dpRmMonRuleSignals;
    }

    public List<DpRmMonRuleSysIng> getBals() {
        return bals;
    }

    public void setBals(List<DpRmMonRuleSysIng> bals) {
        this.bals = bals;
    }

    public List<DpRmMonRuleSysIng> getDpRmMonRuleSysIng() {
        return dpRmMonRuleSysIng;
    }

    public void setDpRmMonRuleSysIng(List<DpRmMonRuleSysIng> dpRmMonRuleSysIng) {
        this.dpRmMonRuleSysIng = dpRmMonRuleSysIng;
    }

    public List<DpRmMonTaskOve> getDpRmMonTaskOves() {
        return dpRmMonTaskOves;
    }

    public void setDpRmMonTaskOves(List<DpRmMonTaskOve> dpRmMonTaskOves) {
        this.dpRmMonTaskOves = dpRmMonTaskOves;
    }

    public List<DpRmMonAgrUndraSto> getDpRmMonAgrUndraStos() {
        return dpRmMonAgrUndraStos;
    }

    public void setDpRmMonAgrUndraStos(List<DpRmMonAgrUndraSto> dpRmMonAgrUndraStos) {
        this.dpRmMonAgrUndraStos = dpRmMonAgrUndraStos;
    }

    public List<DpRmMonUnPriProTotal> getDpRmMonUnPriProTotals() {
        return dpRmMonUnPriProTotals;
    }

    public void setDpRmMonUnPriProTotals(List<DpRmMonUnPriProTotal> dpRmMonUnPriProTotals) {
        this.dpRmMonUnPriProTotals = dpRmMonUnPriProTotals;
    }

    public List<DpRmMonView> getDpRmMonViews() {
        return dpRmMonViews;
    }

    public void setDpRmMonViews(List<DpRmMonView> dpRmMonViews) {
        this.dpRmMonViews = dpRmMonViews;
    }

    public List<DpRmMonUnPriPro> getDpRmMonUnPriPros() {
        return dpRmMonUnPriPros;
    }

    public void setDpRmMonUnPriPros(List<DpRmMonUnPriPro> dpRmMonUnPriPros) {
        this.dpRmMonUnPriPros = dpRmMonUnPriPros;
    }

    public List<DpRmMonUnPriProPre> getDpRmMonUnPriProPres() {
        return dpRmMonUnPriProPres;
    }

    public void setDpRmMonUnPriProPres(List<DpRmMonUnPriProPre> dpRmMonUnPriProPres) {
        this.dpRmMonUnPriProPres = dpRmMonUnPriProPres;
    }

    public List<DpRmMonUnPriProMic> getDpRmMonUnPriProMics() {
        return dpRmMonUnPriProMics;
    }

    public void setDpRmMonUnPriProMics(List<DpRmMonUnPriProMic> dpRmMonUnPriProMics) {
        this.dpRmMonUnPriProMics = dpRmMonUnPriProMics;
    }
}
