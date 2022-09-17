package com.gxd.dao.impl;

import com.gxd.dao.OperationLogDao;
import com.gxd.mapper.OperationLogMapper;
import com.gxd.model.entity.OperationLog;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author Xuandong Guo
 * @date 11/09/2022
 */
@Repository
public class OperationLogDaoImpl implements OperationLogDao {
    @Resource
    private OperationLogMapper operationLogMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return operationLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OperationLog record) {
        return operationLogMapper.insert(record);
    }

    @Override
    public int insertSelective(OperationLog record) {
        return operationLogMapper.insertSelective(record);
    }

    @Override
    public OperationLog selectByPrimaryKey(Long id) {
        return operationLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OperationLog record) {
        return operationLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OperationLog record) {
        return operationLogMapper.updateByPrimaryKey(record);
    }
}
