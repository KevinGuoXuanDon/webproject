package com.gxd.service.impl;

import com.gxd.dao.CommentDao;
import com.gxd.model.entity.Comment;
import com.gxd.service.CommentService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentDao commentDao;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commentDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Comment record) {
        return commentDao.insert(record);
    }

    @Override
    public int insertSelective(Comment record) {
        return commentDao.insertSelective(record);
    }

    @Override
    public Comment selectByPrimaryKey(Long id) {
        return commentDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Comment record) {
        return commentDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Comment record) {
        return commentDao.updateByPrimaryKey(record);
    }

}
