package com.gxd.service.impl;

import com.gxd.dao.VisitorDao;
import com.gxd.model.entity.Visitor;
import com.gxd.service.VisitorService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
/**
 * @author xuandongguo
 */
@Service
public class VisitorServiceImpl implements VisitorService {

    @Resource
    private VisitorDao visitorDao;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return visitorDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Visitor record) {
        return visitorDao.insert(record);
    }

    @Override
    public int insertSelective(Visitor record) {
        return visitorDao.insertSelective(record);
    }

    @Override
    public Visitor selectByPrimaryKey(Long id) {
        return visitorDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Visitor record) {
        return visitorDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Visitor record) {
        return visitorDao.updateByPrimaryKey(record);
    }

}
