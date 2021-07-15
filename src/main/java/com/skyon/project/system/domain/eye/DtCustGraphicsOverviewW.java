package com.skyon.project.system.domain.eye;

import com.skyon.framework.web.domain.EyeBaseEntity;

import java.math.BigDecimal;

/**
 * DT_CUST_GRAPHICS_OVERVIEW_W
 * 融资明细
 */
public class DtCustGraphicsOverviewW extends EyeBaseEntity {

    private String cgbLonName; // 本行贷款名称
    private BigDecimal cgbLonAmt; //本行贷款金额
    private BigDecimal cgbLonBal; //本行贷款金额
    private BigDecimal cgbCrdtCardAmt; //本行信用卡金额
    private BigDecimal cgbCrdtCardBal; //本行信用卡余额
    private BigDecimal cgbFGuarAmt; //本行对外担保金额
    private BigDecimal cgbFGuarBal; //本行对外担保余额
    private String obankLonName; //他行贷款名称
    private BigDecimal obankLonAmt; //他行贷款金额
    private BigDecimal obankLonBal; //他行贷款余额
    private BigDecimal obankCrdtCardAmt; //他行信用卡金额
    private BigDecimal obankCrdtCardBal; //他行信用卡余额
    private BigDecimal obankFGuarAmt; //他行对外担保金额
    private BigDecimal obankFGuarBal; //他行对外担保余额
    private String incidRela; //关联关系
    private String relaPersonName; //关联人名称

    public String getCgbLonName() {
        return cgbLonName;
    }

    public void setCgbLonName(String cgbLonName) {
        this.cgbLonName = cgbLonName;
    }

    public BigDecimal getCgbLonAmt() {
        return cgbLonAmt;
    }

    public void setCgbLonAmt(BigDecimal cgbLonAmt) {
        this.cgbLonAmt = cgbLonAmt;
    }

    public BigDecimal getCgbLonBal() {
        return cgbLonBal;
    }

    public void setCgbLonBal(BigDecimal cgbLonBal) {
        this.cgbLonBal = cgbLonBal;
    }

    public BigDecimal getCgbCrdtCardAmt() {
        return cgbCrdtCardAmt;
    }

    public void setCgbCrdtCardAmt(BigDecimal cgbCrdtCardAmt) {
        this.cgbCrdtCardAmt = cgbCrdtCardAmt;
    }

    public BigDecimal getCgbCrdtCardBal() {
        return cgbCrdtCardBal;
    }

    public void setCgbCrdtCardBal(BigDecimal cgbCrdtCardBal) {
        this.cgbCrdtCardBal = cgbCrdtCardBal;
    }

    public BigDecimal getCgbFGuarAmt() {
        return cgbFGuarAmt;
    }

    public void setCgbFGuarAmt(BigDecimal cgbFGuarAmt) {
        this.cgbFGuarAmt = cgbFGuarAmt;
    }

    public BigDecimal getCgbFGuarBal() {
        return cgbFGuarBal;
    }

    public void setCgbFGuarBal(BigDecimal cgbFGuarBal) {
        this.cgbFGuarBal = cgbFGuarBal;
    }

    public String getObankLonName() {
        return obankLonName;
    }

    public void setObankLonName(String obankLonName) {
        this.obankLonName = obankLonName;
    }

    public BigDecimal getObankLonAmt() {
        return obankLonAmt;
    }

    public void setObankLonAmt(BigDecimal obankLonAmt) {
        this.obankLonAmt = obankLonAmt;
    }

    public BigDecimal getObankLonBal() {
        return obankLonBal;
    }

    public void setObankLonBal(BigDecimal obankLonBal) {
        this.obankLonBal = obankLonBal;
    }

    public BigDecimal getObankCrdtCardAmt() {
        return obankCrdtCardAmt;
    }

    public void setObankCrdtCardAmt(BigDecimal obankCrdtCardAmt) {
        this.obankCrdtCardAmt = obankCrdtCardAmt;
    }

    public BigDecimal getObankCrdtCardBal() {
        return obankCrdtCardBal;
    }

    public void setObankCrdtCardBal(BigDecimal obankCrdtCardBal) {
        this.obankCrdtCardBal = obankCrdtCardBal;
    }

    public BigDecimal getObankFGuarAmt() {
        return obankFGuarAmt;
    }

    public void setObankFGuarAmt(BigDecimal obankFGuarAmt) {
        this.obankFGuarAmt = obankFGuarAmt;
    }

    public BigDecimal getObankFGuarBal() {
        return obankFGuarBal;
    }

    public void setObankFGuarBal(BigDecimal obankFGuarBal) {
        this.obankFGuarBal = obankFGuarBal;
    }

    public String getIncidRela() {
        return incidRela;
    }

    public void setIncidRela(String incidRela) {
        this.incidRela = incidRela;
    }

    public String getRelaPersonName() {
        return relaPersonName;
    }

    public void setRelaPersonName(String relaPersonName) {
        this.relaPersonName = relaPersonName;
    }
}
