package com.skyon.common.enums;

/**
 * 环节流转节点备选人
 */
public enum WFRole {

    WFROLE101("WF_ROLE_101","客户经理预警认定角色"),
    WFROLE102("WF_ROLE_102","市场零售部门主管审核_预警认定角色"),
    WFROLE103("WF_ROLE_103","分行风险检测岗审核_预警认定角色"),
    WFROLE104("WF_ROLE_104","分行监测审核岗审核_预警认定角色"),
    WFROLE105("WF_ROLE_105","分行检测主管审核_预警认定角色"),

    WFROLE201("WF_ROLE_201","客户经理处置跟踪角色"),
    WFROLE202("WF_ROLE_202","市场零售部门主管审核_处置跟踪角色"),
    WFROLE203("WF_ROLE_203","分行风险检测岗审核_处置跟踪角色"),
    WFROLE204("WF_ROLE_204","分行监测审核岗审核_处置跟踪角色"),
    WFROLE205("WF_ROLE_205","分行检测主管审核_处置跟踪角色"),

    WFROLE301("WF_ROLE_301","客户经理预警解除角色"),
    WFROLE302("WF_ROLE_302","市场零售部门主管审核_预警解除角色"),
    WFROLE303("WF_ROLE_303","分行风险检测岗审核_预警解除角色"),
    WFROLE304("WF_ROLE_304","分行监测审核岗审核_预警解除角色"),
    WFROLE305("WF_ROLE_305","分行检测主管审核_预警解除角色");


    private final String code;
    private final String info;


    WFRole(String code, String info) {
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
