package com.skyon.project.system.domain.eye;

/**
 * @description 个人客户信息表
 * DP_AP_cust_info
 * @author skyon
 * @date 2021-05-25
 */
public class DpApCustInfo {

    // 法人机构标识
    private String lpOrgNo;

    /**
     * 客户编号
     */
    private String custNo;

    /**
     * 客户名称
     */
    private String custName;

    /**
     * 证件类型
     */
    private String certType;

    /**
     * 证件号码
     */
    private String certNo;

    /**
     * 年龄
     */
    private String age;

    /**
     * 婚姻状况代码
     */
    private String marriageStatusCd;

    /**
     * 我行客户类型代码
     */
    private String cgbCustTypeCd;

    /**
     * 性别代码
     */
    private String genderCd;

    /**
     * 居住地址
     */
    private String resdntAddr;

    /**
     * 民族代码
     */
    private String ethnicCd;

    /**
     * 最高学历代码
     */
    private String higtEduDegreeCd;

    /**
     * 出生日期
     */
    private String birthDt;

    /**
     * 就业状况
     */
    private String employSitu;

    /**
     *  工资单位
     */
    private String salaryCorp;

    /**
     * 单位性质
     */
    private String corpChar;

    /**
     * 行业
     */
    private String indus;

    /**
     * 单位地址
     */
    private String corpAddr;

    /**
     * 单位电话
     */
    private String corpTel;

    /**
     * 职业
     */
    private String career;

    /**
     * 职务
     */
    private String pos;

    /**
     * 职称
     */
    private String title;

    /**
     * 进入该单位年份
     */
    private String enterCorpYear;

    /**
     * 信息更新日期
     */
    private String infoUpdateDt;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * EMAIL
     */
    private String email;

    /**
     * 配偶名称
     */
    private String spouseName;

    /**
     * 配偶证件类型代码
     */
    private String spouseCertTypeCd;

    /**
     * 配偶证件号码
     */
    private String spouseCertNo;

    /**
     * 配偶工作单位名称
     */
    private String spouseWorkUnitName;

    /**
     * 配偶联系地址
     */
    private String spouseContAddr;





    /**
     * 客户经理
     */
    private String custMgr;

    /**
     * 客户经理电话
     */
    private String custMgrTel;

    /**
     * 数据日期
     */
    private String etlDt;

    /**
     * ETL处理时间
     */
    private String etlTimestamp;

    private String monitorType;

    private String branch;

    private String nextBranch;

    /**
     * 逻辑分区--年月日
     */
    private String partYmd;
    //逻辑分区--年月
    private String partYm;

    @Override
    public String toString() {
        return "DpApCustInfo{" +
                "lpOrgNo='" + lpOrgNo + '\'' +
                ", custNo='" + custNo + '\'' +
                ", custName='" + custName + '\'' +
                ", certType='" + certType + '\'' +
                ", certNo='" + certNo + '\'' +
                ", age='" + age + '\'' +
                ", marriageStatusCd='" + marriageStatusCd + '\'' +
                ", cgbCustTypeCd='" + cgbCustTypeCd + '\'' +
                ", genderCd='" + genderCd + '\'' +
                ", resdntAddr='" + resdntAddr + '\'' +
                ", ethnicCd='" + ethnicCd + '\'' +
                ", higtEduDegreeCd='" + higtEduDegreeCd + '\'' +
                ", birthDt='" + birthDt + '\'' +
                ", employSitu='" + employSitu + '\'' +
                ", salaryCorp='" + salaryCorp + '\'' +
                ", corpChar='" + corpChar + '\'' +
                ", indus='" + indus + '\'' +
                ", corpAddr='" + corpAddr + '\'' +
                ", corpTel='" + corpTel + '\'' +
                ", career='" + career + '\'' +
                ", pos='" + pos + '\'' +
                ", title='" + title + '\'' +
                ", enterCorpYear='" + enterCorpYear + '\'' +
                ", infoUpdateDt='" + infoUpdateDt + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", spouseName='" + spouseName + '\'' +
                ", spouseCertTypeCd='" + spouseCertTypeCd + '\'' +
                ", spouseCertNo='" + spouseCertNo + '\'' +
                ", spouseWorkUnitName='" + spouseWorkUnitName + '\'' +
                ", spouseContAddr='" + spouseContAddr + '\'' +
                ", custMgr='" + custMgr + '\'' +
                ", custMgrTel='" + custMgrTel + '\'' +
                ", etlDt='" + etlDt + '\'' +
                ", etlTimestamp='" + etlTimestamp + '\'' +
                ", partYmd='" + partYmd + '\'' +
                ", partYm='" + partYm + '\'' +
                '}';
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getNextBranch() {
        return nextBranch;
    }

    public void setNextBranch(String nextBranch) {
        this.nextBranch = nextBranch;
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

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMarriageStatusCd() {
        return marriageStatusCd;
    }

    public void setMarriageStatusCd(String marriageStatusCd) {
        this.marriageStatusCd = marriageStatusCd;
    }

    public String getCgbCustTypeCd() {
        return cgbCustTypeCd;
    }

    public void setCgbCustTypeCd(String cgbCustTypeCd) {
        this.cgbCustTypeCd = cgbCustTypeCd;
    }

    public String getGenderCd() {
        return genderCd;
    }

    public void setGenderCd(String genderCd) {
        this.genderCd = genderCd;
    }

    public String getResdntAddr() {
        return resdntAddr;
    }

    public void setResdntAddr(String resdntAddr) {
        this.resdntAddr = resdntAddr;
    }

    public String getEthnicCd() {
        return ethnicCd;
    }

    public void setEthnicCd(String ethnicCd) {
        this.ethnicCd = ethnicCd;
    }

    public String getHigtEduDegreeCd() {
        return higtEduDegreeCd;
    }

    public void setHigtEduDegreeCd(String higtEduDegreeCd) {
        this.higtEduDegreeCd = higtEduDegreeCd;
    }

    public String getBirthDt() {
        return birthDt;
    }

    public void setBirthDt(String birthDt) {
        this.birthDt = birthDt;
    }

    public String getEmploySitu() {
        return employSitu;
    }

    public void setEmploySitu(String employSitu) {
        this.employSitu = employSitu;
    }

    public String getSalaryCorp() {
        return salaryCorp;
    }

    public void setSalaryCorp(String salaryCorp) {
        this.salaryCorp = salaryCorp;
    }

    public String getCorpChar() {
        return corpChar;
    }

    public void setCorpChar(String corpChar) {
        this.corpChar = corpChar;
    }

    public String getIndus() {
        return indus;
    }

    public void setIndus(String indus) {
        this.indus = indus;
    }

    public String getCorpAddr() {
        return corpAddr;
    }

    public void setCorpAddr(String corpAddr) {
        this.corpAddr = corpAddr;
    }

    public String getCorpTel() {
        return corpTel;
    }

    public void setCorpTel(String corpTel) {
        this.corpTel = corpTel;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEnterCorpYear() {
        return enterCorpYear;
    }

    public void setEnterCorpYear(String enterCorpYear) {
        this.enterCorpYear = enterCorpYear;
    }

    public String getInfoUpdateDt() {
        return infoUpdateDt;
    }

    public void setInfoUpdateDt(String infoUpdateDt) {
        this.infoUpdateDt = infoUpdateDt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getSpouseCertTypeCd() {
        return spouseCertTypeCd;
    }

    public void setSpouseCertTypeCd(String spouseCertTypeCd) {
        this.spouseCertTypeCd = spouseCertTypeCd;
    }

    public String getSpouseCertNo() {
        return spouseCertNo;
    }

    public void setSpouseCertNo(String spouseCertNo) {
        this.spouseCertNo = spouseCertNo;
    }

    public String getSpouseWorkUnitName() {
        return spouseWorkUnitName;
    }

    public void setSpouseWorkUnitName(String spouseWorkUnitName) {
        this.spouseWorkUnitName = spouseWorkUnitName;
    }

    public String getSpouseContAddr() {
        return spouseContAddr;
    }

    public void setSpouseContAddr(String spouseContAddr) {
        this.spouseContAddr = spouseContAddr;
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
