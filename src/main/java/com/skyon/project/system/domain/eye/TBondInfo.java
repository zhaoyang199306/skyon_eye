package com.skyon.project.system.domain.eye;

import com.skyon.project.system.domain.ferghana.DpApTaskInfo;

/**
 * 债券信息类 T_Bond_Info
 */
public class TBondInfo {

    private Long bondInfoID; // 主键

    private String taskInfoNo; // 预警基本信息对象 关联id

    private String bondName; // 债券名称

    private String bondGroupName; // 投组名称

    private String bondGroupType; // 投组类型

    private String bondEndDate; // 投组名债券到期日称

    private String balance; // 余额(万元)

    private DpApTaskInfo dpApTaskInfo; // 预警基本信息对象

    public DpApTaskInfo getDpApTaskInfo() {
        return dpApTaskInfo;
    }

    public void setDpApTaskInfo(DpApTaskInfo dpApTaskInfo) {
        this.dpApTaskInfo = dpApTaskInfo;
    }

    public String getTaskInfoNo() {
        return taskInfoNo;
    }

    public void setTaskInfoNo(String taskInfoNo) {
        this.taskInfoNo = taskInfoNo;
    }

    public Long getBondInfoID() {
        return bondInfoID;
    }

    public void setBondInfoID(Long bondInfoID) {
        this.bondInfoID = bondInfoID;
    }

    public String getBondName() {
        return bondName;
    }

    public void setBondName(String bondName) {
        this.bondName = bondName;
    }

    public String getBondGroupName() {
        return bondGroupName;
    }

    public void setBondGroupName(String bondGroupName) {
        this.bondGroupName = bondGroupName;
    }

    public String getBondGroupType() {
        return bondGroupType;
    }

    public void setBondGroupType(String bondGroupType) {
        this.bondGroupType = bondGroupType;
    }

    public String getBondEndDate() {
        return bondEndDate;
    }

    public void setBondEndDate(String bondEndDate) {
        this.bondEndDate = bondEndDate;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
