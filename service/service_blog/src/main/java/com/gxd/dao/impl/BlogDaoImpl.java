package com.gxd.dao.impl;

import com.gxd.dao.BlogDao;
import com.gxd.mapper.BlogMapper;
import com.gxd.model.entity.Blog;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author Xuandong Guo
 * @date 11/09/2022
 */
@Repository
public class BlogDaoImpl implements BlogDao {
    @Resource
    private BlogMapper blogMapper;


    @Override
    public int deleteByPrimaryKey(Long id) {
        return blogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Blog record) {
        return blogMapper.insert(record);
    }

    @Override
    public int insertSelective(Blog record) {
        return blogMapper.insertSelective(record);
    }

    @Override
    public Blog selectByPrimaryKey(Long id) {
        return blogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Blog record) {
        return blogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Blog record) {
        return blogMapper.updateByPrimaryKey(record);
    }
}
