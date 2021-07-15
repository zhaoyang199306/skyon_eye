package com.skyon.project.system.domain.eye;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.skyon.project.system.domain.ferghana.TReassignTaskDetail;
import org.springframework.data.annotation.Transient;

import java.util.Date;
import java.util.List;

/**
 * 任务改派信息表 t_reassign_task_info
 */
public class TReassignTaskInfo {

    private String reassignTaskNo; // 改派编号

    private String reassignType; // 改派类型

    private String applicant; // 申请人

    @Transient
    private String reassignID; // 改派人id

    private String reassignUser; // 改派人

    private int taskTotal; // 改派任务总数

    private String reassignReason; // 改派原因

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date reassignDate; // 改派日期

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date reassignStartDate; // 改派开始日期

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date reassignEndDate; // 改派结束日期

    private List<TReassignTaskDetail> reassignTaskDetails;

    public String getReassignID() {
        return reassignID;
    }

    public void setReassignID(String reassignID) {
        this.reassignID = reassignID;
    }

    public List<TReassignTaskDetail> getReassignTaskDetails() {
        return reassignTaskDetails;
    }

    public void setReassignTaskDetails(List<TReassignTaskDetail> reassignTaskDetails) {
        this.reassignTaskDetails = reassignTaskDetails;
    }

    public String getReassignTaskNo() {
        return reassignTaskNo;
    }

    public void setReassignTaskNo(String reassignTaskNo) {
        this.reassignTaskNo = reassignTaskNo;
    }

    public String getReassignType() {
        return reassignType;
    }

    public void setReassignType(String reassignType) {
        this.reassignType = reassignType;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getReassignUser() {
        return reassignUser;
    }

    public void setReassignUser(String reassignUser) {
        this.reassignUser = reassignUser;
    }

    public int getTaskTotal() {
        return taskTotal;
    }

    public void setTaskTotal(int taskTotal) {
        this.taskTotal = taskTotal;
    }

    public String getReassignReason() {
        return reassignReason;
    }

    public void setReassignReason(String reassignReason) {
        this.reassignReason = reassignReason;
    }

    public Date getReassignDate() {
        return reassignDate;
    }

    public void setReassignDate(Date reassignDate) {
        this.reassignDate = reassignDate;
    }

    public Date getReassignStartDate() {
        return reassignStartDate;
    }

    public void setReassignStartDate(Date reassignStartDate) {
        this.reassignStartDate = reassignStartDate;
    }

    public Date getReassignEndDate() {
        return reassignEndDate;
    }

    public void setReassignEndDate(Date reassignEndDate) {
        this.reassignEndDate = reassignEndDate;
    }
}
