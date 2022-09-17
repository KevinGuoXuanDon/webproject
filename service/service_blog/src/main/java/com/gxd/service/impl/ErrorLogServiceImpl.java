package com.gxd.service.impl;

import com.gxd.dao.ErrorLogDao;
import com.gxd.model.entity.ErrorLog;
import com.gxd.service.ErrorLogService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
/**
 * @author xuandongguo
 */
@Service
public class ErrorLogServiceImpl implements ErrorLogService {

    @Resource
    private ErrorLogDao errorLogDao;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return errorLogDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ErrorLog record) {
        return errorLogDao.insert(record);
    }

    @Override
    public int insertSelective(ErrorLog record) {
        return errorLogDao.insertSelective(record);
    }

    @Override
    public ErrorLog selectByPrimaryKey(Long id) {
        return errorLogDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ErrorLog record) {
        return errorLogDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ErrorLog record) {
        return errorLogDao.updateByPrimaryKey(record);
    }

}
