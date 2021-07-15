package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.DpRmMonAgrUndraSto;
import com.skyon.project.system.domain.eye.DpRmMonTaskOve;

import java.util.List;

public interface DpRmMonTaskOveMapper {

    // 根据时间查询
    public List<DpRmMonTaskOve> selectDpRmMonTaskOve(String date);
}
