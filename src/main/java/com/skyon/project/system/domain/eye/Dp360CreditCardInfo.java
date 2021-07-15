package com.skyon.project.system.domain.eye;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.skyon.framework.web.domain.EyeBaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * DP_360_CREDIT_CARD_INFO
 * 信用卡信息
 */
public class Dp360CreditCardInfo extends EyeBaseEntity {

    private String correlation; //关联关系
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date openCardDate; //开卡日期
    private String cardNo; //卡号
    private BigDecimal totalAmount; //总额度
    private BigDecimal tmpAmount; //临时额度
    private BigDecimal currentAvailQuota; //当前可用额度
    private BigDecimal installmentAmount; //分期付款额度
    private BigDecimal wdrawalOdraftAmount; //取款透支额度
    private BigDecimal accountBal; //账户余额
    private BigDecimal overdueAmount; //逾期金额
    private String openCardOrg; //开卡机构
    private String ifThisBank; //本行或他行

    public String getCorrelation() {
        return correlation;
    }

    public void setCorrelation(String correlation) {
        this.correlation = correlation;
    }

    public Date getOpenCardDate() {
        return openCardDate;
    }

    public void setOpenCardDate(Date openCardDate) {
        this.openCardDate = openCardDate;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTmpAmount() {
        return tmpAmount;
    }

    public void setTmpAmount(BigDecimal tmpAmount) {
        this.tmpAmount = tmpAmount;
    }

    public BigDecimal getCurrentAvailQuota() {
        return currentAvailQuota;
    }

    public void setCurrentAvailQuota(BigDecimal currentAvailQuota) {
        this.currentAvailQuota = currentAvailQuota;
    }

    public BigDecimal getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(BigDecimal installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public BigDecimal getWdrawalOdraftAmount() {
        return wdrawalOdraftAmount;
    }

    public void setWdrawalOdraftAmount(BigDecimal wdrawalOdraftAmount) {
        this.wdrawalOdraftAmount = wdrawalOdraftAmount;
    }

    public BigDecimal getAccountBal() {
        return accountBal;
    }

    public void setAccountBal(BigDecimal accountBal) {
        this.accountBal = accountBal;
    }

    public BigDecimal getOverdueAmount() {
        return overdueAmount;
    }

    public void setOverdueAmount(BigDecimal overdueAmount) {
        this.overdueAmount = overdueAmount;
    }

    public String getOpenCardOrg() {
        return openCardOrg;
    }

    public void setOpenCardOrg(String openCardOrg) {
        this.openCardOrg = openCardOrg;
    }

    public String getIfThisBank() {
        return ifThisBank;
    }

    public void setIfThisBank(String ifThisBank) {
        this.ifThisBank = ifThisBank;
    }
}
