package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.Dp360GuaranteeInfo;

import java.util.List;

public interface Dp360GuaranteeInfoMapper {
    public List<Dp360GuaranteeInfo> selectDp360GuaranteeInfo(String custNo);
}
