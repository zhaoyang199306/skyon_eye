package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.DpRmMonRuleSignal;
import com.skyon.project.system.domain.eye.DpRmMonTaskOve;

import java.util.List;

public interface DpRmMonRuleSignalMapper {

    // 根据时间查询
    public List<DpRmMonRuleSignal> selectDpRmMonRuleSignal(String date,String dateStr,String warnLevel);
}
