package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.DpRmMonAgrUndraSto;
import com.skyon.project.system.domain.eye.DpRmMonUnPriProMic;

import java.util.List;

public interface DpRmMonAgrUndraStoMapper {

    // 根据时间查询
    public List<DpRmMonAgrUndraSto> selectDpRmMonAgrUndraSto(String date);
}
