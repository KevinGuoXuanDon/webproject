package com.gxd.service.impl;

import com.gxd.dao.BlogDao;
import com.gxd.service.BlogService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.gxd.model.entity.Blog;
/**
 * @author xuandongguo
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Resource
    private BlogDao blogDao;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return blogDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Blog record) {
        return blogDao.insert(record);
    }

    @Override
    public int insertSelective(Blog record) {
        return blogDao.insertSelective(record);
    }

    @Override
    public Blog selectByPrimaryKey(Long id) {
        return blogDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Blog record) {
        return blogDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Blog record) {
        return blogDao.updateByPrimaryKey(record);
    }

}
