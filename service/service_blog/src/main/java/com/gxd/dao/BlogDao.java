package com.gxd.dao;

import com.gxd.model.entity.Blog;

/**
 * @author xuandongguo
 */
public interface BlogDao {


    int deleteByPrimaryKey(Long id);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);

}
