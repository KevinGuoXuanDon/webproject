package com.gxd.dao;

import com.gxd.model.entity.Tag;

/**
 * @author xuandongguo
 */
public interface TagDao {


    int deleteByPrimaryKey(Long id);

    int insert(Tag record);

    int insertSelective(Tag record);

    Tag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tag record);

    int updateByPrimaryKey(Tag record);

}
