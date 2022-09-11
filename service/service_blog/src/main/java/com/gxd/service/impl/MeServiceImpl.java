package com.gxd.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.gxd.mapper.MeMapper;
import com.gxd.dao.Me;
import com.gxd.service.MeService;
@Service
public class MeServiceImpl implements MeService{

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
