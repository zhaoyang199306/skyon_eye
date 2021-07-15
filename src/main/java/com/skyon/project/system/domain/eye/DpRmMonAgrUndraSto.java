package com.skyon.project.system.domain.eye;

import com.skyon.framework.web.domain.EyeBaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * DP_RM_MON_AGR_UNDRA_STO
 * 已批未提、存量授信客户情况
 */
public class DpRmMonAgrUndraSto extends EyeBaseEntity {

    private String orgCode; // 所属分行代码
    private Date analyTime; // 分析时间
    private int agrUndraRiskCustNum; // 已批未提风险客户数
    private BigDecimal agrUndraRiskCustBal; // 已批未提风险客户数贷款余额
    private int stoRiskCustNum; // 存量授信风险客户数
    private BigDecimal stoRiskCustBal; // 存量授信风险客户数贷款余额

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

    public int getAgrUndraRiskCustNum() {
        return agrUndraRiskCustNum;
    }

    public void setAgrUndraRiskCustNum(int agrUndraRiskCustNum) {
        this.agrUndraRiskCustNum = agrUndraRiskCustNum;
    }

    public BigDecimal getAgrUndraRiskCustBal() {
        return agrUndraRiskCustBal;
    }

    public void setAgrUndraRiskCustBal(BigDecimal agrUndraRiskCustBal) {
        this.agrUndraRiskCustBal = agrUndraRiskCustBal;
    }

    public int getStoRiskCustNum() {
        return stoRiskCustNum;
    }

    public void setStoRiskCustNum(int stoRiskCustNum) {
        this.stoRiskCustNum = stoRiskCustNum;
    }

    public BigDecimal getStoRiskCustBal() {
        return stoRiskCustBal;
    }

    public void setStoRiskCustBal(BigDecimal stoRiskCustBal) {
        this.stoRiskCustBal = stoRiskCustBal;
    }
}
