package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.DpRmMonUnPriProPre;
import com.skyon.project.system.domain.eye.DpRmMonView;

import java.util.List;

public interface DpRmMonUnPriProPreMapper {

    // 根据时间查询
    public List<DpRmMonUnPriProPre> selectDpRmMonUnPriProPre(String date);
}
