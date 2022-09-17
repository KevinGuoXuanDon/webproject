package com.gxd.service.impl;

import com.gxd.dao.OperationLogDao;
import com.gxd.model.entity.OperationLog;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.gxd.service.OperationLogService;
/**
 * @author xuandongguo
 */
@Service
public class OperationLogServiceImpl implements OperationLogService {

    @Resource
    private OperationLogDao operationLogDao;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return operationLogDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OperationLog record) {
        return operationLogDao.insert(record);
    }

    @Override
    public int insertSelective(OperationLog record) {
        return operationLogDao.insertSelective(record);
    }

    @Override
    public OperationLog selectByPrimaryKey(Long id) {
        return operationLogDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OperationLog record) {
        return operationLogDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OperationLog record) {
        return operationLogDao.updateByPrimaryKey(record);
    }

}
