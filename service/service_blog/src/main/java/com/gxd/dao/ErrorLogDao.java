package com.gxd.dao;

import com.gxd.model.entity.ErrorLog;

/**
 * @author xuandongguo
 */
public interface ErrorLogDao {


    int deleteByPrimaryKey(Long id);

    int insert(ErrorLog record);

    int insertSelective(ErrorLog record);

    ErrorLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ErrorLog record);

    int updateByPrimaryKey(ErrorLog record);

}
