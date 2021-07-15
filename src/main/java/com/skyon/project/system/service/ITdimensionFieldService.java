package com.skyon.project.system.service;

import com.skyon.project.system.domain.ferghana.TDimensionTable;
import com.skyon.project.system.domain.ferghana.TVariableCenter;

public interface ITdimensionFieldService {

    // 新增数据
    public void insertDimensionField(TDimensionTable table);

    // 删除数据
    public void deleteTDimensionField(String[] tableNames);

    // 修改字段 为 已经使用
    public  void updateFiledIsUsed(TVariableCenter tVariableCenter);
}
