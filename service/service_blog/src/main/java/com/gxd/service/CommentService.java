package com.gxd.service;

import com.gxd.model.entity.Comment;

/**
 * @author xuandongguo
 */
public interface CommentService {

    int deleteByPrimaryKey(Long id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

}
