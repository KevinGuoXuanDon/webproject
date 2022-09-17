package com.gxd.service;

import com.gxd.model.entity.OperationLog;

/**
 * @author xuandongguo
 */
public interface OperationLogService {

    int deleteByPrimaryKey(Long id);

    int insert(OperationLog record);

    int insertSelective(OperationLog record);

    OperationLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OperationLog record);

    int updateByPrimaryKey(OperationLog record);

}
