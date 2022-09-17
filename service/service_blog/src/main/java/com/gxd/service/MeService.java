package com.gxd.service;

import com.gxd.model.entity.Me;

/**
 * @author xuandongguo
 */
public interface MeService {

    int deleteByPrimaryKey(Long id);

    int insert(Me record);

    int insertSelective(Me record);

    Me selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Me record);

    int updateByPrimaryKey(Me record);

}
