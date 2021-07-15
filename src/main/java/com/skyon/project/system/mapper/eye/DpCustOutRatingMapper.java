package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.DpCustOutRating;

import java.util.List;

public interface DpCustOutRatingMapper {
    public List<DpCustOutRating> selectDpCustOutRating(String custNo);
}
