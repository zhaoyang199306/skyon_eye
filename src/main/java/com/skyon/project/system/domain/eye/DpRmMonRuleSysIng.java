package com.skyon.project.system.domain.eye;

import com.skyon.framework.web.domain.EyeBaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * DP_RM_MON_RULE_SYS_ING
 * 系统运营分析
 */
public class DpRmMonRuleSysIng extends EyeBaseEntity {

    public DpRmMonRuleSysIng(){

    }

    public DpRmMonRuleSysIng(boolean b){
        this.warnCustBal = new BigDecimal(0);
        this.warnCustRate = new BigDecimal(0);
        this.accidCustBal = new BigDecimal(0);
        this.accidCustRate = new BigDecimal(0);
        this.hitCustBal = new BigDecimal(0);
        this.hitCustRate = new BigDecimal(0);
        this.artAffRigRate = new BigDecimal(0);
        this.artAffWrgRate = new BigDecimal(0);
        this.sysAffRigRate = new BigDecimal(0);
        this.sysAffWrgRate = new BigDecimal(0);
        this.narSenRedAsBal = new BigDecimal(0);
        this.broSenRedAsBal = new BigDecimal(0);
        this.misDeteRate = new BigDecimal(0);
        this.misinRate = new BigDecimal(0);
        this.artAffWrgBal = new BigDecimal(0);
        this.sysAffWrgBal = new BigDecimal(0);
        this.misDeteBal = new BigDecimal(0);
        this.misinBal = new BigDecimal(0);
    }


    private String prtNo;  // 产品代码
    private String prtName; // 产品名称
    private String orgCode; // 分行机构代码
    private String analyTime;  // 分析时间
    private int warnCustNum; // 触警客户数
    private BigDecimal warnCustBal;// 触警客户余额
    private BigDecimal warnCustRate; //触警率
    private int accidCustNum; //  出险客户数
    private BigDecimal accidCustBal;// 出险客户余额
    private BigDecimal accidCustRate; // 出险率
    private int hitCustNum;  // 命中客户数
    private BigDecimal hitCustBal; // 命中客户余额
    private BigDecimal hitCustRate; // 命中率

    private int affNum; // 风险认定数
    private int affRiskCustNum; //认定为风险客户数
    private int artAffNum; //人工风险认定数
    private int artAffRigNum; //人工认风险定数准确数
    private BigDecimal artAffRigRate; //人工风险认定准确率
    private int sysAffNum; //系统风险认定数
    private int sysAffRigNum; //系统认风险定数准确数
    private BigDecimal sysAffRigRate; //系统风险认定准确率

    private int artAffWrgNum; //人工认风险定数失误数
    private BigDecimal artAffWrgBal; //人工认风险定数失余额
    private BigDecimal artAffWrgRate; //人工风险认定失误率
    private int sysAffWrgNum; //系统认风险定数失误数
    private BigDecimal sysAffWrgBal; //系统认风险定数失误余额
    private BigDecimal sysAffWrgRate; //系统风险认定失误率


    private BigDecimal narSenRedAsBal; //狭义挽回资产余额
    private BigDecimal broSenRedAsBal; //广义挽回资产余额

    private int misDeteNum; //漏报客户数
    private BigDecimal misDeteBal; //漏报余额
    private BigDecimal misDeteRate; //漏警率
    private int misinNum; //误报客户数
    private BigDecimal misinBal; //误报余额
    private BigDecimal misinRate; //误报率


    private String days; // 返回工具参数
    private String quarter;// 返回工具参数 （季度）


    public BigDecimal getMisDeteBal() {
        return misDeteBal;
    }

    public void setMisDeteBal(BigDecimal misDeteBal) {
        this.misDeteBal = misDeteBal;
    }

    public BigDecimal getMisinBal() {
        return misinBal;
    }

    public void setMisinBal(BigDecimal misinBal) {
        this.misinBal = misinBal;
    }

    public String getDays() {
        return days;
    }

    public BigDecimal getArtAffWrgBal() {
        return artAffWrgBal;
    }

    public void setArtAffWrgBal(BigDecimal artAffWrgBal) {
        this.artAffWrgBal = artAffWrgBal;
    }

    public BigDecimal getSysAffWrgBal() {
        return sysAffWrgBal;
    }

    public void setSysAffWrgBal(BigDecimal sysAffWrgBal) {
        this.sysAffWrgBal = sysAffWrgBal;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
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

    public int getWarnCustNum() {
        return warnCustNum;
    }

    public void setWarnCustNum(int warnCustNum) {
        this.warnCustNum = warnCustNum;
    }

    public BigDecimal getWarnCustBal() {
        return warnCustBal;
    }

    public void setWarnCustBal(BigDecimal warnCustBal) {
        this.warnCustBal = warnCustBal;
    }

    public BigDecimal getWarnCustRate() {
        return warnCustRate;
    }

    public void setWarnCustRate(BigDecimal warnCustRate) {
        this.warnCustRate = warnCustRate;
    }

    public int getAccidCustNum() {
        return accidCustNum;
    }

    public void setAccidCustNum(int accidCustNum) {
        this.accidCustNum = accidCustNum;
    }

    public BigDecimal getAccidCustBal() {
        return accidCustBal;
    }

    public void setAccidCustBal(BigDecimal accidCustBal) {
        this.accidCustBal = accidCustBal;
    }

    public BigDecimal getAccidCustRate() {
        return accidCustRate;
    }

    public void setAccidCustRate(BigDecimal accidCustRate) {
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

    public int getAffNum() {
        return affNum;
    }

    public void setAffNum(int affNum) {
        this.affNum = affNum;
    }

    public int getAffRiskCustNum() {
        return affRiskCustNum;
    }

    public void setAffRiskCustNum(int affRiskCustNum) {
        this.affRiskCustNum = affRiskCustNum;
    }

    public int getArtAffNum() {
        return artAffNum;
    }

    public void setArtAffNum(int artAffNum) {
        this.artAffNum = artAffNum;
    }

    public int getArtAffRigNum() {
        return artAffRigNum;
    }

    public void setArtAffRigNum(int artAffRigNum) {
        this.artAffRigNum = artAffRigNum;
    }

    public BigDecimal getArtAffRigRate() {
        return artAffRigRate;
    }

    public void setArtAffRigRate(BigDecimal artAffRigRate) {
        this.artAffRigRate = artAffRigRate;
    }

    public int getArtAffWrgNum() {
        return artAffWrgNum;
    }

    public void setArtAffWrgNum(int artAffWrgNum) {
        this.artAffWrgNum = artAffWrgNum;
    }

    public BigDecimal getArtAffWrgRate() {
        return artAffWrgRate;
    }

    public void setArtAffWrgRate(BigDecimal artAffWrgRate) {
        this.artAffWrgRate = artAffWrgRate;
    }

    public int getSysAffNum() {
        return sysAffNum;
    }

    public void setSysAffNum(int sysAffNum) {
        this.sysAffNum = sysAffNum;
    }

    public int getSysAffRigNum() {
        return sysAffRigNum;
    }

    public void setSysAffRigNum(int sysAffRigNum) {
        this.sysAffRigNum = sysAffRigNum;
    }

    public BigDecimal getSysAffRigRate() {
        return sysAffRigRate;
    }

    public void setSysAffRigRate(BigDecimal sysAffRigRate) {
        this.sysAffRigRate = sysAffRigRate;
    }

    public int getSysAffWrgNum() {
        return sysAffWrgNum;
    }

    public void setSysAffWrgNum(int sysAffWrgNum) {
        this.sysAffWrgNum = sysAffWrgNum;
    }

    public BigDecimal getSysAffWrgRate() {
        return sysAffWrgRate;
    }

    public void setSysAffWrgRate(BigDecimal sysAffWrgRate) {
        this.sysAffWrgRate = sysAffWrgRate;
    }

    public BigDecimal getNarSenRedAsBal() {
        return narSenRedAsBal;
    }

    public void setNarSenRedAsBal(BigDecimal narSenRedAsBal) {
        this.narSenRedAsBal = narSenRedAsBal;
    }

    public BigDecimal getBroSenRedAsBal() {
        return broSenRedAsBal;
    }

    public void setBroSenRedAsBal(BigDecimal broSenRedAsBal) {
        this.broSenRedAsBal = broSenRedAsBal;
    }

    public int getMisDeteNum() {
        return misDeteNum;
    }

    public void setMisDeteNum(int misDeteNum) {
        this.misDeteNum = misDeteNum;
    }

    public BigDecimal getMisDeteRate() {
        return misDeteRate;
    }

    public void setMisDeteRate(BigDecimal misDeteRate) {
        this.misDeteRate = misDeteRate;
    }

    public int getMisinNum() {
        return misinNum;
    }

    public void setMisinNum(int misinNum) {
        this.misinNum = misinNum;
    }

    public BigDecimal getMisinRate() {
        return misinRate;
    }

    public void setMisinRate(BigDecimal misinRate) {
        this.misinRate = misinRate;
    }
}
