package com.gxd.dao;

import com.gxd.model.entity.OperationLog;

/**
 * @author xuandongguo
 */
public interface OperationLogDao {


    int deleteByPrimaryKey(Long id);

    int insert(OperationLog record);

    int insertSelective(OperationLog record);

    OperationLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OperationLog record);

    int updateByPrimaryKey(OperationLog record);

}
