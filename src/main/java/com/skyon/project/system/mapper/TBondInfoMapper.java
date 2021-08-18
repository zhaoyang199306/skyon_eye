package com.skyon.project.system.mapper;

import com.skyon.project.system.domain.eye.TBondInfo;

import java.util.List;

public interface TBondInfoMapper {


    // 新增
    public int insertTBondInfo(List<TBondInfo> tBondInfo);

    public int selectTBondInfos(String taskInfoNo);

}
