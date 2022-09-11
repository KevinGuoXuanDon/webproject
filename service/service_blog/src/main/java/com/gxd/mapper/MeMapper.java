package com.gxd.mapper;

import com.gxd.dao.Me;

public interface MeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Me record);

    int insertSelective(Me record);

    Me selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Me record);

    int updateByPrimaryKey(Me record);
}