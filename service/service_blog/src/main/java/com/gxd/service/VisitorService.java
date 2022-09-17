package com.gxd.service;

import com.gxd.model.entity.Visitor;

/**
 * @author xuandongguo
 */
public interface VisitorService {

    int deleteByPrimaryKey(Long id);

    int insert(Visitor record);

    int insertSelective(Visitor record);

    Visitor selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Visitor record);

    int updateByPrimaryKey(Visitor record);

}
