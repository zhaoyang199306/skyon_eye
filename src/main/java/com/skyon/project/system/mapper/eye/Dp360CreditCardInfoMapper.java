package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.Dp360CreditCardInfo;
import com.skyon.project.system.domain.eye.Dp360LoanInfo;

import java.util.List;

public interface Dp360CreditCardInfoMapper {
    public List<Dp360CreditCardInfo> selectDp360CreditCardInfo(String custNo);
}
