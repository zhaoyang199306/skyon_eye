package com.skyon.framework.web.domain;

import java.io.Serializable;
import java.util.Date;

public class EyeBaseEntity implements Serializable {

    // 法人机构标识
    private String lpOrgNo;
    // 客户编号
    private String custNo;
    // 客户名称
    private String custName;

    // 数据日期
    private Date etlDt;
    // ETL处理时间
    private String etlTimestamp;

    // 逻辑分区--年月日
    private String partYmd;
    // 逻辑分区--年月
    private String partYm;

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

    public Date getEtlDt() {
        return etlDt;
    }

    public void setEtlDt(Date etlDt) {
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
