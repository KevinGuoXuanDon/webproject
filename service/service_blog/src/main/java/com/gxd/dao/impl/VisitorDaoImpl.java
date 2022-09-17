package com.gxd.dao.impl;

import com.gxd.dao.VisitorDao;
import com.gxd.mapper.VisitorMapper;
import com.gxd.model.entity.Visitor;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author Xuandong Guo
 * @date 11/09/2022
 */
@Repository
public class VisitorDaoImpl implements VisitorDao {

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
