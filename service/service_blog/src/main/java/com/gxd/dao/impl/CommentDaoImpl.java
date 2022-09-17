package com.gxd.dao.impl;

import com.gxd.dao.CommentDao;
import com.gxd.mapper.CommentMapper;
import com.gxd.model.entity.Comment;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author Xuandong Guo
 * @date 11/09/2022
 */
@Repository
public class CommentDaoImpl implements CommentDao {

    @Resource
    private CommentMapper commentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Comment record) {
        return commentMapper.insert(record);
    }

    @Override
    public int insertSelective(Comment record) {
        return commentMapper.insertSelective(record);
    }

    @Override
    public Comment selectByPrimaryKey(Long id) {
        return commentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Comment record) {
        return commentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Comment record) {
        return commentMapper.updateByPrimaryKey(record);
    }
}
