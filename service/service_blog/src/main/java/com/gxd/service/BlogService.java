package com.gxd.service;

import com.gxd.dao.Blog;
public interface BlogService{


    int deleteByPrimaryKey(Long id);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);

}
