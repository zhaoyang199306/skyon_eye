package com.skyon.project.system.domain.eye;

/**
 *
 * DP_AP_company_INFO
 * 小微企业客户
 */
public class DpApCompanyInfo {
    private String lpOrgNo; // 法人机构标识
    private String custNo; // 客户编号
    private String custName; // 客户名称
    private String foundDt; // 成立日期
    private int rgstCap; // 注册资本
    private String belongBank; // 所属行业
    private String eigenCode; // 中征码
    private String custType; // 客户类型
    private String orgnzCd; // 组织机构代码
    private String rgstAddr; // 注册地址
    private String addr; // 门店地址
    private String legalRep; // 法定代表人
    private String actlCtrler; // 实际控制人
    private String operRange; // 经营范围
    private String belongBrch; // 所属分行
    private String custMgr; // 客户经理
    private String custMgrTel; // 客户经理电话
    private String etlDt; // 数据日期
    private String etlTimestamp; // ETL处理时间
    private String partYmd; // 逻辑分区--年月日
    private String partYm; // 逻辑分区--年月
    private String monitorType; // 逻辑分区--年月


    @Override
    public String toString() {
        return "DpApCompanyInfo{" +
                "lpOrgNo='" + lpOrgNo + '\'' +
                ", custNo='" + custNo + '\'' +
                ", custName='" + custName + '\'' +
                ", foundDt='" + foundDt + '\'' +
                ", rgstCap=" + rgstCap +
                ", belongBank='" + belongBank + '\'' +
                ", eigenCode='" + eigenCode + '\'' +
                ", custType='" + custType + '\'' +
                ", orgnzCd='" + orgnzCd + '\'' +
                ", rgstAddr='" + rgstAddr + '\'' +
                ", addr='" + addr + '\'' +
                ", legalRep='" + legalRep + '\'' +
                ", actlCtrler='" + actlCtrler + '\'' +
                ", operRange='" + operRange + '\'' +
                ", belongBrch='" + belongBrch + '\'' +
                ", custMgr='" + custMgr + '\'' +
                ", custMgrTel='" + custMgrTel + '\'' +
                ", etlDt='" + etlDt + '\'' +
                ", etlTimestamp='" + etlTimestamp + '\'' +
                ", partYmd='" + partYmd + '\'' +
                ", partYm='" + partYm + '\'' +
                '}';
    }

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }

    public String getLpOrgNo() {
        return lpOrgNo;
    }

    public void setLpOrgNo(String lpOrgNo) {
        this.lpOrgNo = lpOrgNo;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getFoundDt() {
        return foundDt;
    }

    public void setFoundDt(String foundDt) {
        this.foundDt = foundDt;
    }

    public int getRgstCap() {
        return rgstCap;
    }

    public void setRgstCap(int rgstCap) {
        this.rgstCap = rgstCap;
    }

    public String getBelongBank() {
        return belongBank;
    }

    public void setBelongBank(String belongBank) {
        this.belongBank = belongBank;
    }

    public String getEigenCode() {
        return eigenCode;
    }

    public void setEigenCode(String eigenCode) {
        this.eigenCode = eigenCode;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public String getOrgnzCd() {
        return orgnzCd;
    }

    public void setOrgnzCd(String orgnzCd) {
        this.orgnzCd = orgnzCd;
    }

    public String getRgstAddr() {
        return rgstAddr;
    }

    public void setRgstAddr(String rgstAddr) {
        this.rgstAddr = rgstAddr;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getLegalRep() {
        return legalRep;
    }

    public void setLegalRep(String legalRep) {
        this.legalRep = legalRep;
    }

    public String getActlCtrler() {
        return actlCtrler;
    }

    public void setActlCtrler(String actlCtrler) {
        this.actlCtrler = actlCtrler;
    }

    public String getOperRange() {
        return operRange;
    }

    public void setOperRange(String operRange) {
        this.operRange = operRange;
    }

    public String getBelongBrch() {
        return belongBrch;
    }

    public void setBelongBrch(String belongBrch) {
        this.belongBrch = belongBrch;
    }

    public String getCustMgr() {
        return custMgr;
    }

    public void setCustMgr(String custMgr) {
        this.custMgr = custMgr;
    }

    public String getCustMgrTel() {
        return custMgrTel;
    }

    public void setCustMgrTel(String custMgrTel) {
        this.custMgrTel = custMgrTel;
    }

    public String getEtlDt() {
        return etlDt;
    }

    public void setEtlDt(String etlDt) {
        this.etlDt = etlDt;
    }

    public String getEtlTimestamp() {
        return etlTimestamp;
    }

    public void setEtlTimestamp(String etlTimestamp) {
        this.etlTimestamp = etlTimestamp;
    }

    public String getPartYmd() {
        return partYmd;
    }

    public void setPartYmd(String partYmd) {
        this.partYmd = partYmd;
    }

    public String getPartYm() {
        return partYm;
    }

    public void setPartYm(String partYm) {
        this.partYm = partYm;
    }
}
