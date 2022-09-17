package com.gxd.dao.impl;

import com.gxd.dao.MeDao;
import com.gxd.mapper.MeMapper;
import com.gxd.model.entity.Me;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author Xuandong Guo
 * @date 11/09/2022
 */
@Repository
public class MeDaoImpl implements MeDao {
    @Resource
    private MeMapper meMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return meMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Me record) {
        return meMapper.insert(record);
    }

    @Override
    public int insertSelective(Me record) {
        return meMapper.insertSelective(record);
    }

    @Override
    public Me selectByPrimaryKey(Long id) {
        return meMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Me record) {
        return meMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Me record) {
        return meMapper.updateByPrimaryKey(record);
    }
}
