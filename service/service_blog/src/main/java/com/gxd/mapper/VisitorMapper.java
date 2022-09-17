package com.gxd.mapper;

import com.gxd.model.entity.Visitor;

/**
 * @author xuandongguo
 */
public interface VisitorMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Visitor record);

    int insertSelective(Visitor record);

    Visitor selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Visitor record);

    int updateByPrimaryKey(Visitor record);
}