package com.gxd.service.impl;

import com.gxd.dao.TagDao;
import com.gxd.model.entity.Tag;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.gxd.service.TagService;
/**
 * @author xuandongguo
 */
@Service
public class TagServiceImpl implements TagService {

    @Resource
    private TagDao tagDao;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tagDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Tag record) {
        return tagDao.insert(record);
    }

    @Override
    public int insertSelective(Tag record) {
        return tagDao.insertSelective(record);
    }

    @Override
    public Tag selectByPrimaryKey(Long id) {
        return tagDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Tag record) {
        return tagDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Tag record) {
        return tagDao.updateByPrimaryKey(record);
    }

}
