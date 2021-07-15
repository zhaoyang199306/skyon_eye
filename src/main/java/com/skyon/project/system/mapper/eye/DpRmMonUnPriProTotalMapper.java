package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.DpRmMonUnPriProPre;
import com.skyon.project.system.domain.eye.DpRmMonUnPriProTotal;

import java.util.List;

public interface DpRmMonUnPriProTotalMapper {

    // 根据时间查询
    public List<DpRmMonUnPriProTotal> selectDpRmMonUnPriProTotal(String date);
}
