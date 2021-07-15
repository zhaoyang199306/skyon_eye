package com.skyon.project.system.domain.eye;

/**
 * DP_360_CUST_INFO
 * 客户信息表
 */
public class DP360CustInfo {

    private String custNo; // 客户编号

    private String custName; // 客户名称

    private String certNo; // 证件号码

    private String age; //年龄

    private String maritalStatus; // 婚姻状况

    private String custType; // 客户类型

    private String sex; // 性别(代码) M:男 F:女

    private String addr; //  居住地址

    private String birday; //  出生日期

    private String national; // 民族

    private String highestEducation; // 最高学历

    private String certType; // 证件类型

    private String employmentStatus; // 就业状况

    private String workUnits; // 工作单位

    private String unitOfNature; // 单位性质

    private String industry; // 行业

    private String unitAddress; // 单位地址

    private String unitPhone; // 单位电话

    private String professional; // 职业

    private String position; // 职务

    private String title; // 职称

    private String enterYearOfUnit; // 进入该单位年份

    private String infoUpdateDate; // 信息更新日期

    private String contactNumber; //   联系电话

    private String email; // EMAIL

    private String spouseName; // 配偶名称

    private String spouseCertType; // 配偶证件类型

    private String spouseCertNo; // 配偶证件号码

    private String spouseWorkUnits; // 配偶工作单位

    private String spouseContactNumber; // 配偶联系电话

    private String subBranch; // 所属支行

    private String branch; // 所属分行

    private String custManager; // 客户经理

    private String custManagerPhone; // 客户经理电话

    private String monitorType; // 监测主体类型

    private String setUpDate; // 成立日期

    private String registeredAssets; // 注册资本

    private String industryInvolved; // 所属行业

    private String signature; // 中征码

    private String organizationCode; // 组织机构代码

    private String registeredAddress; // 注册地址

    private String storeAddress; // 门店地址

    private String legalRepresentative; // 法定代表人

    private String actualController; // 实际控制人

    private String businessScope; // 经营范围

    @Override
    public String toString() {
        return "DP360CustInfo{" +
                "custNo='" + custNo + '\'' +
                ", custName='" + custName + '\'' +
                ", certNo='" + certNo + '\'' +
                ", age='" + age + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", custType='" + custType + '\'' +
                ", sex='" + sex + '\'' +
                ", addr='" + addr + '\'' +
                ", birday='" + birday + '\'' +
                ", national='" + national + '\'' +
                ", highestEducation='" + highestEducation + '\'' +
                ", certType='" + certType + '\'' +
                ", employmentStatus='" + employmentStatus + '\'' +
                ", workUnits='" + workUnits + '\'' +
                ", unitOfNature='" + unitOfNature + '\'' +
                ", industry='" + industry + '\'' +
                ", unitAddress='" + unitAddress + '\'' +
                ", unitPhone='" + unitPhone + '\'' +
                ", professional='" + professional + '\'' +
                ", position='" + position + '\'' +
                ", title='" + title + '\'' +
                ", enterYearOfUnit='" + enterYearOfUnit + '\'' +
                ", infoUpdateDate='" + infoUpdateDate + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                ", spouseName='" + spouseName + '\'' +
                ", spouseCertType='" + spouseCertType + '\'' +
                ", spouseCertNo='" + spouseCertNo + '\'' +
                ", spouseWorkUnits='" + spouseWorkUnits + '\'' +
                ", spouseContactNumber='" + spouseContactNumber + '\'' +
                ", subBranch='" + subBranch + '\'' +
                ", branch='" + branch + '\'' +
                ", custManager='" + custManager + '\'' +
                ", custManagerPhone='" + custManagerPhone + '\'' +
                ", monitorType='" + monitorType + '\'' +
                ", setUpDate='" + setUpDate + '\'' +
                ", registeredAssets='" + registeredAssets + '\'' +
                ", industryInvolved='" + industryInvolved + '\'' +
                ", signature='" + signature + '\'' +
                ", organizationCode='" + organizationCode + '\'' +
                ", registeredAddress='" + registeredAddress + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", legalRepresentative='" + legalRepresentative + '\'' +
                ", actualController='" + actualController + '\'' +
                ", businessScope='" + businessScope + '\'' +
                '}';
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

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getBirday() {
        return birday;
    }

    public void setBirday(String birday) {
        this.birday = birday;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getWorkUnits() {
        return workUnits;
    }

    public void setWorkUnits(String workUnits) {
        this.workUnits = workUnits;
    }

    public String getUnitOfNature() {
        return unitOfNature;
    }

    public void setUnitOfNature(String unitOfNature) {
        this.unitOfNature = unitOfNature;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getUnitAddress() {
        return unitAddress;
    }

    public void setUnitAddress(String unitAddress) {
        this.unitAddress = unitAddress;
    }

    public String getUnitPhone() {
        return unitPhone;
    }

    public void setUnitPhone(String unitPhone) {
        this.unitPhone = unitPhone;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEnterYearOfUnit() {
        return enterYearOfUnit;
    }

    public void setEnterYearOfUnit(String enterYearOfUnit) {
        this.enterYearOfUnit = enterYearOfUnit;
    }

    public String getInfoUpdateDate() {
        return infoUpdateDate;
    }

    public void setInfoUpdateDate(String infoUpdateDate) {
        this.infoUpdateDate = infoUpdateDate;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
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

    public String getSpouseCertType() {
        return spouseCertType;
    }

    public void setSpouseCertType(String spouseCertType) {
        this.spouseCertType = spouseCertType;
    }

    public String getSpouseCertNo() {
        return spouseCertNo;
    }

    public void setSpouseCertNo(String spouseCertNo) {
        this.spouseCertNo = spouseCertNo;
    }

    public String getSpouseWorkUnits() {
        return spouseWorkUnits;
    }

    public void setSpouseWorkUnits(String spouseWorkUnits) {
        this.spouseWorkUnits = spouseWorkUnits;
    }

    public String getSpouseContactNumber() {
        return spouseContactNumber;
    }

    public void setSpouseContactNumber(String spouseContactNumber) {
        this.spouseContactNumber = spouseContactNumber;
    }

    public String getSubBranch() {
        return subBranch;
    }

    public void setSubBranch(String subBranch) {
        this.subBranch = subBranch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCustManager() {
        return custManager;
    }

    public void setCustManager(String custManager) {
        this.custManager = custManager;
    }

    public String getCustManagerPhone() {
        return custManagerPhone;
    }

    public void setCustManagerPhone(String custManagerPhone) {
        this.custManagerPhone = custManagerPhone;
    }

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }

    public String getSetUpDate() {
        return setUpDate;
    }

    public void setSetUpDate(String setUpDate) {
        this.setUpDate = setUpDate;
    }

    public String getRegisteredAssets() {
        return registeredAssets;
    }

    public void setRegisteredAssets(String registeredAssets) {
        this.registeredAssets = registeredAssets;
    }

    public String getIndustryInvolved() {
        return industryInvolved;
    }

    public void setIndustryInvolved(String industryInvolved) {
        this.industryInvolved = industryInvolved;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    public String getActualController() {
        return actualController;
    }

    public void setActualController(String actualController) {
        this.actualController = actualController;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }
}
