package com.gxd.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.gxd.mapper.VisitorMapper;
import com.gxd.dao.Visitor;
import com.gxd.service.VisitorService;
@Service
public class VisitorServiceImpl implements VisitorService{

    @Resource
    private VisitorMapper visitorMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return visitorMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Visitor record) {
        return visitorMapper.insert(record);
    }

    @Override
    public int insertSelective(Visitor record) {
        return visitorMapper.insertSelective(record);
    }

    @Override
    public Visitor selectByPrimaryKey(Long id) {
        return visitorMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Visitor record) {
        return visitorMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Visitor record) {
        return visitorMapper.updateByPrimaryKey(record);
    }

}
