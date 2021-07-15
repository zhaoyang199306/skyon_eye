package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.DpRmMonView;

import java.util.List;

public interface DpRmMonViewMapper {

    // 根据时间查询
    public List<DpRmMonView> selectDpRmMonView(String date);
}
