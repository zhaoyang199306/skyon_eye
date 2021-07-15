package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.DpRmMonUnPriPro;
import com.skyon.project.system.domain.eye.DpRmMonView;

import java.util.List;

public interface DpRmMonUnPriProMapper {

    // 根据时间查询
    public List<DpRmMonUnPriPro> selectDpRmMonUnPriPro(String date);
}
