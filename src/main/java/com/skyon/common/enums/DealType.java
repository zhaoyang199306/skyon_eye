package com.skyon.common.enums;

/**
 *  任务处理类型枚举
 */
public enum DealType {

    RD("RD","预警认定"),
    GZ("GZ","跟踪处置"),
    JC("JC","任务解除");

    private final String code;
    private final String info;

    DealType(String code, String info) {
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
