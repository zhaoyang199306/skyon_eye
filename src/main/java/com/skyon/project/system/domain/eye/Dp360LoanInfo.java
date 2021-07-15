package com.skyon.project.system.domain.eye;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.skyon.framework.web.domain.EyeBaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * DP_360_LOAN_INFO
 * 授信贷款信息
 */
public class Dp360LoanInfo extends EyeBaseEntity {

    private String correlation; // 关联关系
    private String loanName; // 贷款名称
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date loanDate; // 贷款日期
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dueDate; // 到期日期
    private BigDecimal loanRate; // 贷款利率
    private BigDecimal loanAmount; // 贷款金额
    private String level5Class; // 五级分类
    private String orgName; // 发放机构
    private BigDecimal loanBal; // 贷款余额
    private String loanStauts; // 贷款状态
    private String ifThisBank; // 本行或他行
    private String etlTime;

    public String getEtlTime() {
        return etlTime;
    }

    public void setEtlTime(String etlTime) {
        this.etlTime = etlTime;
    }

    public String getCorrelation() {
        return correlation;
    }

    public void setCorrelation(String correlation) {
        this.correlation = correlation;
    }

    public String getLoanName() {
        return loanName;
    }

    public void setLoanName(String loanName) {
        this.loanName = loanName;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public BigDecimal getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(BigDecimal loanRate) {
        this.loanRate = loanRate;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLevel5Class() {
        return level5Class;
    }

    public void setLevel5Class(String level5Class) {
        this.level5Class = level5Class;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public BigDecimal getLoanBal() {
        return loanBal;
    }

    public void setLoanBal(BigDecimal loanBal) {
        this.loanBal = loanBal;
    }

    public String getLoanStauts() {
        return loanStauts;
    }

    public void setLoanStauts(String loanStauts) {
        this.loanStauts = loanStauts;
    }

    public String getIfThisBank() {
        return ifThisBank;
    }

    public void setIfThisBank(String ifThisBank) {
        this.ifThisBank = ifThisBank;
    }
}
