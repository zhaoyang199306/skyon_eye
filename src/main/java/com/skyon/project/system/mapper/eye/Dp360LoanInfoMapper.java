package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.Dp360LoanInfo;

import java.util.List;

public interface Dp360LoanInfoMapper {
    public List<Dp360LoanInfo> selectDp360LoanInfo(String custNo);
}
