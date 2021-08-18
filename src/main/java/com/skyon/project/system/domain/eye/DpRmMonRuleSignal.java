package com.skyon.project.system.domain.eye;

import com.skyon.framework.web.domain.EyeBaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * DP_RM_MON_RULE_SIGNAL
 * 信号维度分析
 */
public class DpRmMonRuleSignal extends EyeBaseEntity {

    private String prtNo; // 产品代码
    private String prtName; // 产品名称
    private String orgCode; // 分行机构代码
    private String analyTime; // 分析时间
    private String ruleId; // 规则编号
    private String ruleName; // 规则名称
    private String ruleClass; // 规则维度
    private String accidCustRate; // 规则等级
    private int hitCustNum; // 触发数量
    private BigDecimal hitCustBal; // 规则覆盖率
    private BigDecimal hitCustRate; // 1个月后规则转化率
    private BigDecimal affNum; // 2个月后规则转化率
    private BigDecimal affRiskCustNum; // 3个月后规则转化率
    private BigDecimal artAffNum; // 6个月后规则转化率
    private BigDecimal artAffRigNum; // 12个月后规则转化率
    private BigDecimal aveConversion; // 平均转化率

    public BigDecimal getAveConversion() {
        return aveConversion;
    }

    public void setAveConversion(BigDecimal aveConversion) {
        this.aveConversion = aveConversion;
    }

    public String getPrtNo() {
        return prtNo;
    }

    public void setPrtNo(String prtNo) {
        this.prtNo = prtNo;
    }

    public String getPrtName() {
        return prtName;
    }

    public void setPrtName(String prtName) {
        this.prtName = prtName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getAnalyTime() {
        return analyTime;
    }

    public void setAnalyTime(String analyTime) {
        this.analyTime = analyTime;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleClass() {
        return ruleClass;
    }

    public void setRuleClass(String ruleClass) {
        this.ruleClass = ruleClass;
    }

    public String getAccidCustRate() {
        return accidCustRate;
    }

    public void setAccidCustRate(String accidCustRate) {
        this.accidCustRate = accidCustRate;
    }

    public int getHitCustNum() {
        return hitCustNum;
    }

    public void setHitCustNum(int hitCustNum) {
        this.hitCustNum = hitCustNum;
    }

    public BigDecimal getHitCustBal() {
        return hitCustBal;
    }

    public void setHitCustBal(BigDecimal hitCustBal) {
        this.hitCustBal = hitCustBal;
    }

    public BigDecimal getHitCustRate() {
        return hitCustRate;
    }

    public void setHitCustRate(BigDecimal hitCustRate) {
        this.hitCustRate = hitCustRate;
    }

    public BigDecimal getAffNum() {
        return affNum;
    }

    public void setAffNum(BigDecimal affNum) {
        this.affNum = affNum;
    }

    public BigDecimal getAffRiskCustNum() {
        return affRiskCustNum;
    }

    public void setAffRiskCustNum(BigDecimal affRiskCustNum) {
        this.affRiskCustNum = affRiskCustNum;
    }

    public BigDecimal getArtAffNum() {
        return artAffNum;
    }

    public void setArtAffNum(BigDecimal artAffNum) {
        this.artAffNum = artAffNum;
    }

    public BigDecimal getArtAffRigNum() {
        return artAffRigNum;
    }

    public void setArtAffRigNum(BigDecimal artAffRigNum) {
        this.artAffRigNum = artAffRigNum;
    }
}
