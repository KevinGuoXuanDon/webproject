package com.gxd.service.impl;

import com.gxd.dao.MeDao;
import com.gxd.model.entity.Me;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.gxd.service.MeService;
/**
 * @author xuandongguo
 */
@Service
public class MeServiceImpl implements MeService {

    @Resource
    private MeDao meDao;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return meDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Me record) {
        return meDao.insert(record);
    }

    @Override
    public int insertSelective(Me record) {
        return meDao.insertSelective(record);
    }

    @Override
    public Me selectByPrimaryKey(Long id) {
        return meDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Me record) {
        return meDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Me record) {
        return meDao.updateByPrimaryKey(record);
    }

}
