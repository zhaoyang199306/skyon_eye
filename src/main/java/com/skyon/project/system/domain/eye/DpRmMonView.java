package com.skyon.project.system.domain.eye;

import com.skyon.framework.web.domain.EyeBaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * DP_RM_MON_VIEW
 * 总体概览
 */
public class DpRmMonView extends EyeBaseEntity {

    private String orgCode; // 分行机构代码
    private Date analyTime; // 分析时间
    private int priProRiskNum; // 自营类产品风险信号数
    private int unPriProRiskNum; // 非自营类产品风险信号数
    private int priProWarnCustNum; // 自营类产品触警客户数
    private int unPriProWarnCustNum; // 非自营类产品触警客户数
    private BigDecimal priProRiskCustBal; // 自营类产品风险客户贷款余额
    private BigDecimal unPriProRiskCustBal; // 非自营类产品风险客户贷款余额
    private BigDecimal priProWarnCustBal; // 自营类产品风险客户贷款余额
    private BigDecimal unPriProWarnCustBal; // 非自营类产品风险客户贷款余额
    private int priProRiskCustNum; // 自营类产品风险客户贷款客户数
    private int unPriProRiskCustNum;// 非自营类产品风险客户贷款客户数

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public Date getAnalyTime() {
        return analyTime;
    }

    public void setAnalyTime(Date analyTime) {
        this.analyTime = analyTime;
    }

    public int getPriProRiskNum() {
        return priProRiskNum;
    }

    public void setPriProRiskNum(int priProRiskNum) {
        this.priProRiskNum = priProRiskNum;
    }

    public int getUnPriProRiskNum() {
        return unPriProRiskNum;
    }

    public void setUnPriProRiskNum(int unPriProRiskNum) {
        this.unPriProRiskNum = unPriProRiskNum;
    }

    public int getPriProWarnCustNum() {
        return priProWarnCustNum;
    }

    public void setPriProWarnCustNum(int priProWarnCustNum) {
        this.priProWarnCustNum = priProWarnCustNum;
    }

    public int getUnPriProWarnCustNum() {
        return unPriProWarnCustNum;
    }

    public void setUnPriProWarnCustNum(int unPriProWarnCustNum) {
        this.unPriProWarnCustNum = unPriProWarnCustNum;
    }

    public BigDecimal getPriProRiskCustBal() {
        return priProRiskCustBal;
    }

    public void setPriProRiskCustBal(BigDecimal priProRiskCustBal) {
        this.priProRiskCustBal = priProRiskCustBal;
    }

    public BigDecimal getUnPriProRiskCustBal() {
        return unPriProRiskCustBal;
    }

    public void setUnPriProRiskCustBal(BigDecimal unPriProRiskCustBal) {
        this.unPriProRiskCustBal = unPriProRiskCustBal;
    }

    public BigDecimal getPriProWarnCustBal() {
        return priProWarnCustBal;
    }

    public void setPriProWarnCustBal(BigDecimal priProWarnCustBal) {
        this.priProWarnCustBal = priProWarnCustBal;
    }

    public BigDecimal getUnPriProWarnCustBal() {
        return unPriProWarnCustBal;
    }

    public void setUnPriProWarnCustBal(BigDecimal unPriProWarnCustBal) {
        this.unPriProWarnCustBal = unPriProWarnCustBal;
    }

    public int getPriProRiskCustNum() {
        return priProRiskCustNum;
    }

    public void setPriProRiskCustNum(int priProRiskCustNum) {
        this.priProRiskCustNum = priProRiskCustNum;
    }

    public int getUnPriProRiskCustNum() {
        return unPriProRiskCustNum;
    }

    public void setUnPriProRiskCustNum(int unPriProRiskCustNum) {
        this.unPriProRiskCustNum = unPriProRiskCustNum;
    }
}
