package com.gxd.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.gxd.mapper.OperationLogMapper;
import com.gxd.dao.OperationLog;
import com.gxd.service.OperationLogService;
@Service
public class OperationLogServiceImpl implements OperationLogService{

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
