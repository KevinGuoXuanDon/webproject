package com.gxd.dao.impl;

import com.gxd.dao.ErrorLogDao;
import com.gxd.mapper.ErrorLogMapper;
import com.gxd.model.entity.ErrorLog;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author Xuandong Guo
 * @date 11/09/2022
 */
@Repository
public class ErrorLogDaoImpl implements ErrorLogDao {
    @Resource
    private ErrorLogMapper errorLogMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return errorLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ErrorLog record) {
        return errorLogMapper.insert(record);
    }

    @Override
    public int insertSelective(ErrorLog record) {
        return errorLogMapper.insertSelective(record);
    }

    @Override
    public ErrorLog selectByPrimaryKey(Long id) {
        return errorLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ErrorLog record) {
        return errorLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ErrorLog record) {
        return errorLogMapper.updateByPrimaryKey(record);
    }
}
