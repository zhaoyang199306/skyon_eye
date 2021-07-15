package com.skyon.project.system.domain.eye;

import com.skyon.framework.web.domain.EyeBaseEntity;

import java.math.BigDecimal;

/**
 * DT_TY_DP_AP_PUBLIC_REC_A
 * 征信_公共记录
 */
public class DtTyDpApPublicRecA extends EyeBaseEntity {

    private BigDecimal accumTaxArreaRecCnt; // 累计欠税记录数
    private BigDecimal accumTaxArreaAmt; // 累计欠税金额
    private BigDecimal accumCivilJudgeCnt; // 累计民事判决数
    private BigDecimal accumCivilJudgeAmt; // 累计民事判决金额
    private BigDecimal accumEnforcCnt; // 累计强制执行数
    private BigDecimal accumEnforcAmt; // 累计强制执行金额
    private BigDecimal accumAdminPenalCnt; // 累计行政处罚数
    private BigDecimal accumAdminPenalAmt; // 累计行政处罚金额
    private String currProviFundPayStatus; // 当前公积金缴费状态

    public BigDecimal getAccumTaxArreaRecCnt() {
        return accumTaxArreaRecCnt;
    }

    public void setAccumTaxArreaRecCnt(BigDecimal accumTaxArreaRecCnt) {
        this.accumTaxArreaRecCnt = accumTaxArreaRecCnt;
    }

    public BigDecimal getAccumTaxArreaAmt() {
        return accumTaxArreaAmt;
    }

    public void setAccumTaxArreaAmt(BigDecimal accumTaxArreaAmt) {
        this.accumTaxArreaAmt = accumTaxArreaAmt;
    }

    public BigDecimal getAccumCivilJudgeCnt() {
        return accumCivilJudgeCnt;
    }

    public void setAccumCivilJudgeCnt(BigDecimal accumCivilJudgeCnt) {
        this.accumCivilJudgeCnt = accumCivilJudgeCnt;
    }

    public BigDecimal getAccumCivilJudgeAmt() {
        return accumCivilJudgeAmt;
    }

    public void setAccumCivilJudgeAmt(BigDecimal accumCivilJudgeAmt) {
        this.accumCivilJudgeAmt = accumCivilJudgeAmt;
    }

    public BigDecimal getAccumEnforcCnt() {
        return accumEnforcCnt;
    }

    public void setAccumEnforcCnt(BigDecimal accumEnforcCnt) {
        this.accumEnforcCnt = accumEnforcCnt;
    }

    public BigDecimal getAccumEnforcAmt() {
        return accumEnforcAmt;
    }

    public void setAccumEnforcAmt(BigDecimal accumEnforcAmt) {
        this.accumEnforcAmt = accumEnforcAmt;
    }

    public BigDecimal getAccumAdminPenalCnt() {
        return accumAdminPenalCnt;
    }

    public void setAccumAdminPenalCnt(BigDecimal accumAdminPenalCnt) {
        this.accumAdminPenalCnt = accumAdminPenalCnt;
    }

    public BigDecimal getAccumAdminPenalAmt() {
        return accumAdminPenalAmt;
    }

    public void setAccumAdminPenalAmt(BigDecimal accumAdminPenalAmt) {
        this.accumAdminPenalAmt = accumAdminPenalAmt;
    }

    public String getCurrProviFundPayStatus() {
        return currProviFundPayStatus;
    }

    public void setCurrProviFundPayStatus(String currProviFundPayStatus) {
        this.currProviFundPayStatus = currProviFundPayStatus;
    }
}
