package com.skyon.project.system.domain.eye;

import com.skyon.framework.web.domain.EyeBaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * DP_RM_MON_UN_PRI_PRO_PRE
 * 自营产品风险客户情况-个人
 */
public class DpRmMonUnPriProBase extends EyeBaseEntity {

    private String orgCode; // 所属分行代码
    private Date analyTime; // 分析时间
    private int unPriProRedRiskNum; // 自营类产品红色风险信号客户数
    private BigDecimal unPriProRedRiskCustNum; // 自营类产品红色风险信号客户贷款余额
    private int unPriProOraRiskNum; // 自营类产品橙色风险信号客户数
    private BigDecimal unPriProOraRiskCustNum; // 自营类产品橙色风险信号客户贷款余额
    private int unPriProYelRiskNum; // 自营类产品黄色风险信号客户数
    private BigDecimal unPriProYelRiskCustNum; // 自营类产品黄色风险信号客户贷款余额

    private int totalNum; //小计客户数
    private BigDecimal totalBal; //小计客户数

    public BigDecimal getTotalBal() {
        return this.unPriProRedRiskCustNum.add(this.unPriProOraRiskCustNum).add(this.unPriProYelRiskCustNum);
    }

    public void setTotalBal(BigDecimal totalBal) {
        this.totalBal = totalBal;
    }

    public int getTotalNum() {
        return this.unPriProRedRiskNum + this.unPriProOraRiskNum + this.unPriProYelRiskNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
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

    public int getUnPriProRedRiskNum() {
        return unPriProRedRiskNum;
    }

    public void setUnPriProRedRiskNum(int unPriProRedRiskNum) {
        this.unPriProRedRiskNum = unPriProRedRiskNum;
    }

    public BigDecimal getUnPriProRedRiskCustNum() {
        return unPriProRedRiskCustNum;
    }

    public void setUnPriProRedRiskCustNum(BigDecimal unPriProRedRiskCustNum) {
        this.unPriProRedRiskCustNum = unPriProRedRiskCustNum;
    }

    public int getUnPriProOraRiskNum() {
        return unPriProOraRiskNum;
    }

    public void setUnPriProOraRiskNum(int unPriProOraRiskNum) {
        this.unPriProOraRiskNum = unPriProOraRiskNum;
    }

    public BigDecimal getUnPriProOraRiskCustNum() {
        return unPriProOraRiskCustNum;
    }

    public void setUnPriProOraRiskCustNum(BigDecimal unPriProOraRiskCustNum) {
        this.unPriProOraRiskCustNum = unPriProOraRiskCustNum;
    }

    public int getUnPriProYelRiskNum() {
        return unPriProYelRiskNum;
    }

    public void setUnPriProYelRiskNum(int unPriProYelRiskNum) {
        this.unPriProYelRiskNum = unPriProYelRiskNum;
    }

    public BigDecimal getUnPriProYelRiskCustNum() {
        return unPriProYelRiskCustNum;
    }

    public void setUnPriProYelRiskCustNum(BigDecimal unPriProYelRiskCustNum) {
        this.unPriProYelRiskCustNum = unPriProYelRiskCustNum;
    }
}
