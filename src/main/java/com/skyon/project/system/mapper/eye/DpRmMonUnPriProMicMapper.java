package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.DpRmMonUnPriProMic;
import com.skyon.project.system.domain.eye.DpRmMonUnPriProPre;

import java.util.List;

public interface DpRmMonUnPriProMicMapper {

    // 根据时间查询
    public List<DpRmMonUnPriProMic> selectDpRmMonUnPriProMic(String date);
}
