package com.gxd.dao;

import com.gxd.model.entity.Comment;

/**
 * @author xuandongguo
 */
public interface CommentDao {


    int deleteByPrimaryKey(Long id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

}
