package com.gxd.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.gxd.mapper.ErrorLogMapper;
import com.gxd.dao.ErrorLog;
import com.gxd.service.ErrorLogService;
@Service
public class ErrorLogServiceImpl implements ErrorLogService{

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
