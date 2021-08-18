package com.skyon.common.enums;

/**
 * 任务处理角色名
 */
public enum RoleName {

    ACCOUNT_MANAGER("01","客户经理"),
    RETAIL_DEPARTMENT_AUDIT("02","市场零售部门主管审核"),
    RISK_DETECTION_POST_AUDIT("03","分行风险检测岗审核"),
    MONITORING_AUDIT_POST_AUDIT("04","分行监测审核岗审核"),
    INSPECTION_SUPERVISOR_AUDIT("05","分行检测主管审核");

    private final String code;
    private final String info;


    private RoleName(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
}
