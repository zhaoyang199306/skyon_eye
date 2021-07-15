package com.skyon.project.system.domain.eye;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.skyon.framework.web.domain.EyeBaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * DP_360_GUARANTEE_INFO
 * 担保信息
 */
public class Dp360GuaranteeInfo extends EyeBaseEntity {

    private String guarantor; // '担保人'
    private String correlation; // '关联关系'
    private String guarantLoanName; // '担保贷款名称'
    private String guaranteedPerson; // '被担保人'
    private BigDecimal guarantAmount; // '担保金额'
    private String guarantWay; // '担保方式'
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date guarantDate; // '担保贷款日期'
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date guarantDueDate; // '担保贷款到期日'
    private BigDecimal guarantLoanBal; // '担保贷款余额'
    private String guarantLoanLevel5Class; // '担保贷款五级分类'
    private String guarantLoanOrg; // '担保贷款发放机构'
    private String ifThisBank; // '本行或他行'

    public String getGuarantor() {
        return guarantor;
    }

    public void setGuarantor(String guarantor) {
        this.guarantor = guarantor;
    }

    public String getCorrelation() {
        return correlation;
    }

    public void setCorrelation(String correlation) {
        this.correlation = correlation;
    }

    public String getGuarantLoanName() {
        return guarantLoanName;
    }

    public void setGuarantLoanName(String guarantLoanName) {
        this.guarantLoanName = guarantLoanName;
    }

    public String getGuaranteedPerson() {
        return guaranteedPerson;
    }

    public void setGuaranteedPerson(String guaranteedPerson) {
        this.guaranteedPerson = guaranteedPerson;
    }

    public BigDecimal getGuarantAmount() {
        return guarantAmount;
    }

    public void setGuarantAmount(BigDecimal guarantAmount) {
        this.guarantAmount = guarantAmount;
    }

    public String getGuarantWay() {
        return guarantWay;
    }

    public void setGuarantWay(String guarantWay) {
        this.guarantWay = guarantWay;
    }

    public Date getGuarantDate() {
        return guarantDate;
    }

    public void setGuarantDate(Date guarantDate) {
        this.guarantDate = guarantDate;
    }

    public Date getGuarantDueDate() {
        return guarantDueDate;
    }

    public void setGuarantDueDate(Date guarantDueDate) {
        this.guarantDueDate = guarantDueDate;
    }

    public BigDecimal getGuarantLoanBal() {
        return guarantLoanBal;
    }

    public void setGuarantLoanBal(BigDecimal guarantLoanBal) {
        this.guarantLoanBal = guarantLoanBal;
    }

    public String getGuarantLoanLevel5Class() {
        return guarantLoanLevel5Class;
    }

    public void setGuarantLoanLevel5Class(String guarantLoanLevel5Class) {
        this.guarantLoanLevel5Class = guarantLoanLevel5Class;
    }

    public String getGuarantLoanOrg() {
        return guarantLoanOrg;
    }

    public void setGuarantLoanOrg(String guarantLoanOrg) {
        this.guarantLoanOrg = guarantLoanOrg;
    }

    public String getIfThisBank() {
        return ifThisBank;
    }

    public void setIfThisBank(String ifThisBank) {
        this.ifThisBank = ifThisBank;
    }
}
