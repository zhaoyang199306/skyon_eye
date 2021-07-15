package com.skyon.project.system.domain.eye;

import com.skyon.framework.web.domain.EyeBaseEntity;

import java.math.BigDecimal;

/**
 * DT_TY_DP_AP_LIAB_MATURE_SITU_W
 * 征信_负债到期情况
 */
public class DtTyDpApLiabMatureSituW extends EyeBaseEntity {

    private Integer thYearIntMatureCnt; // 当年内到期笔数
    private BigDecimal thYearMatureAmt; // 当年到期金额
    private BigDecimal thYearMaxAmt; // 当年最大的一笔金额
    private Integer after1YearIntMatureCnt; // 未来1年内到期笔数
    private BigDecimal after1YearMatureAmt; // 未来1年到期金额
    private BigDecimal after1YearMaxAmt; // 未来1年最大的一笔金额
    private Integer afterY2IntMatureCnt;// 未来2年内到期笔数
    private BigDecimal afterY2MatureAmt; // 未来2年到期金额
    private BigDecimal afterY2MaxAmt; // 未来2年最大的一笔金额


    public Integer getThYearIntMatureCnt() {
        return thYearIntMatureCnt;
    }

    public void setThYearIntMatureCnt(Integer thYearIntMatureCnt) {
        this.thYearIntMatureCnt = thYearIntMatureCnt;
    }

    public BigDecimal getThYearMatureAmt() {
        return thYearMatureAmt;
    }

    public void setThYearMatureAmt(BigDecimal thYearMatureAmt) {
        this.thYearMatureAmt = thYearMatureAmt;
    }

    public BigDecimal getThYearMaxAmt() {
        return thYearMaxAmt;
    }

    public void setThYearMaxAmt(BigDecimal thYearMaxAmt) {
        this.thYearMaxAmt = thYearMaxAmt;
    }

    public Integer getAfter1YearIntMatureCnt() {
        return after1YearIntMatureCnt;
    }

    public void setAfter1YearIntMatureCnt(Integer after1YearIntMatureCnt) {
        this.after1YearIntMatureCnt = after1YearIntMatureCnt;
    }

    public BigDecimal getAfter1YearMatureAmt() {
        return after1YearMatureAmt;
    }

    public void setAfter1YearMatureAmt(BigDecimal after1YearMatureAmt) {
        this.after1YearMatureAmt = after1YearMatureAmt;
    }

    public BigDecimal getAfter1YearMaxAmt() {
        return after1YearMaxAmt;
    }

    public void setAfter1YearMaxAmt(BigDecimal after1YearMaxAmt) {
        this.after1YearMaxAmt = after1YearMaxAmt;
    }

    public Integer getAfterY2IntMatureCnt() {
        return afterY2IntMatureCnt;
    }

    public void setAfterY2IntMatureCnt(Integer afterY2IntMatureCnt) {
        this.afterY2IntMatureCnt = afterY2IntMatureCnt;
    }

    public BigDecimal getAfterY2MatureAmt() {
        return afterY2MatureAmt;
    }

    public void setAfterY2MatureAmt(BigDecimal afterY2MatureAmt) {
        this.afterY2MatureAmt = afterY2MatureAmt;
    }

    public BigDecimal getAfterY2MaxAmt() {
        return afterY2MaxAmt;
    }

    public void setAfterY2MaxAmt(BigDecimal afterY2MaxAmt) {
        this.afterY2MaxAmt = afterY2MaxAmt;
    }
}
