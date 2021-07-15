package com.skyon.project.system.domain.eye;

import com.skyon.framework.web.domain.EyeBaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * DP_RM_MON_VIEW
 * 总体概览
 */
public class DpRmMonUnPriPro extends EyeBaseEntity {

    private String proCode; // 产品代码
    private String proName; // 产品名称
    private String orgCode;// 所属分行代码
    private Date analyTime; // 分析时间
    private int unPriProRiskNum; // 非自营类产品风险信号数
    private int unPriProWarnCustNum; // 非自营类产品触警客户数
    private BigDecimal unPriProWarnCustBal; // 非自营类产品触警客户贷款余额
    private int unPriProRiskCustNum; // 非自营类产品风险客户数
    private BigDecimal unPriProRiskCustBal; // 非自营类产品风险客户贷款余额

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

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

    public int getUnPriProRiskNum() {
        return unPriProRiskNum;
    }

    public void setUnPriProRiskNum(int unPriProRiskNum) {
        this.unPriProRiskNum = unPriProRiskNum;
    }

    public int getUnPriProWarnCustNum() {
        return unPriProWarnCustNum;
    }

    public void setUnPriProWarnCustNum(int unPriProWarnCustNum) {
        this.unPriProWarnCustNum = unPriProWarnCustNum;
    }

    public BigDecimal getUnPriProWarnCustBal() {
        return unPriProWarnCustBal;
    }

    public void setUnPriProWarnCustBal(BigDecimal unPriProWarnCustBal) {
        this.unPriProWarnCustBal = unPriProWarnCustBal;
    }

    public int getUnPriProRiskCustNum() {
        return unPriProRiskCustNum;
    }

    public void setUnPriProRiskCustNum(int unPriProRiskCustNum) {
        this.unPriProRiskCustNum = unPriProRiskCustNum;
    }

    public BigDecimal getUnPriProRiskCustBal() {
        return unPriProRiskCustBal;
    }

    public void setUnPriProRiskCustBal(BigDecimal unPriProRiskCustBal) {
        this.unPriProRiskCustBal = unPriProRiskCustBal;
    }
}
