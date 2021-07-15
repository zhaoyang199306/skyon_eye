package com.skyon.project.system.domain.eye;

import com.skyon.framework.web.domain.EyeBaseEntity;

import java.math.BigDecimal;

/**
 * DT_CUST_FINANCE_INFO_W
 * 我行融资情况
 */
public class DtCustFinanceInfoW extends EyeBaseEntity {

    private BigDecimal cfaeAmt; // 北金所余额
    private BigDecimal totalSum; // 融资总额
    private BigDecimal lonBal; // 表内贷款余额
    private BigDecimal creditCardAmt; // 信用卡余额
    private BigDecimal txBal; // 表外余额
    private BigDecimal contTotalAmt; // 类信贷余额

    public BigDecimal getCfaeAmt() {
        return cfaeAmt;
    }

    public void setCfaeAmt(BigDecimal cfaeAmt) {
        this.cfaeAmt = cfaeAmt;
    }

    public BigDecimal getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(BigDecimal totalSum) {
        this.totalSum = totalSum;
    }

    public BigDecimal getLonBal() {
        return lonBal;
    }

    public void setLonBal(BigDecimal lonBal) {
        this.lonBal = lonBal;
    }

    public BigDecimal getCreditCardAmt() {
        return creditCardAmt;
    }

    public void setCreditCardAmt(BigDecimal creditCardAmt) {
        this.creditCardAmt = creditCardAmt;
    }

    public BigDecimal getTxBal() {
        return txBal;
    }

    public void setTxBal(BigDecimal txBal) {
        this.txBal = txBal;
    }

    public BigDecimal getContTotalAmt() {
        return contTotalAmt;
    }

    public void setContTotalAmt(BigDecimal contTotalAmt) {
        this.contTotalAmt = contTotalAmt;
    }
}
