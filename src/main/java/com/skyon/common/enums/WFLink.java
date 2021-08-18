package com.skyon.common.enums;

import java.util.Arrays;
import java.util.List;

/**
 * 流转节点
 */
public enum WFLink {

    WFLINK101("WF_LINK_101", "客户经理预警认定"),
    WFLINK102("WF_LINK_102", "市场零售部门主管审核_预警认定"),
    WFLINK103("WF_LINK_103", "分行风险检测岗审核_预警认定"),
    WFLINK104("WF_LINK_104", "分行监测审核岗审核_预警认定"),
    WFLINK105("WF_LINK_105", "分行检测主管审核_预警认定"),

    WFLINK201("WF_LINK_201", "客户经理处置跟踪"),
    WFLINK202("WF_LINK_202", "市场零售部门主管审核_处置跟踪"),
    WFLINK203("WF_LINK_203", "分行风险检测岗审核_处置跟踪"),
    WFLINK204("WF_LINK_204", "分行监测审核岗审核_处置跟踪"),
    WFLINK205("WF_LINK_205", "分行检测主管审核_处置跟踪"),

    WFLINK301("WF_LINK_301", "客户经理预警解除"),
    WFLINK302("WF_LINK_302", "市场零售部门主管审核_预警解除"),
    WFLINK303("WF_LINK_303", "分行风险检测岗审核_预警解除"),
    WFLINK304("WF_LINK_304", "分行监测审核岗审核_预警解除"),
    WFLINK305("WF_LINK_305", "分行检测主管审核_预警解除");

    private final String code;
    private final String info;

    // 预警认定环节集合
    public static final List WFLINK1 = Arrays.asList(WFLINK101.getInfo(), WFLINK102.getInfo(),
            WFLINK103.getInfo(), WFLINK104.getInfo(), WFLINK105.getInfo());

    // 处置跟踪环节集合
    public static final List WFLINK2 = Arrays.asList(WFLINK201.getInfo(), WFLINK202.getInfo(),
            WFLINK203.getInfo(), WFLINK204.getInfo(), WFLINK205.getInfo());

    // 预警解除环节集合
    public static final List WFLINK3 = Arrays.asList(WFLINK301.getInfo(), WFLINK302.getInfo(),
            WFLINK303.getInfo(), WFLINK304.getInfo(), WFLINK305.getInfo());


    private WFLink(String code, String info) {
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
