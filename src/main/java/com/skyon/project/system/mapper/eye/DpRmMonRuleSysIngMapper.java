package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.DpRmMonRuleSysIng;
import com.skyon.project.system.domain.eye.DpRmMonTaskOve;

import java.util.Date;
import java.util.List;

public interface DpRmMonRuleSysIngMapper {

    // 根据时间查询 sum
    public List<DpRmMonRuleSysIng> selectDpRmMonRuleSysIngSum(String date);

    // 根据时间查询 Quarter
    public List<DpRmMonRuleSysIng> selectDpRmMonRuleSysIngQuarter(String date, int mouths);

    // 根据时间查询 预警余额统计
    public List<DpRmMonRuleSysIng> selectDpRmMonRuleSysIngBal(String date);
}
