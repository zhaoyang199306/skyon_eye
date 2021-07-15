package com.skyon.project.system.domain.eye;

import com.skyon.framework.web.domain.EyeBaseEntity;

import java.math.BigDecimal;

/**
 * DT_TY_DP_AP_LIAB_FIN_W
 * 征信历史_负债融资
 */
public class DtTyDpApLiabFinW extends EyeBaseEntity {


    private String reportPeriod; // 报告期
    private Integer acctCnt; // 账户数
    private BigDecimal crdtBal; // 信贷余额

    public String getReportPeriod() {
        return reportPeriod;
    }

    public void setReportPeriod(String reportPeriod) {
        this.reportPeriod = reportPeriod;
    }

    public Integer getAcctCnt() {
        return acctCnt;
    }

    public void setAcctCnt(Integer acctCnt) {
        this.acctCnt = acctCnt;
    }

    public BigDecimal getCrdtBal() {
        return crdtBal;
    }

    public void setCrdtBal(BigDecimal crdtBal) {
        this.crdtBal = crdtBal;
    }
}
