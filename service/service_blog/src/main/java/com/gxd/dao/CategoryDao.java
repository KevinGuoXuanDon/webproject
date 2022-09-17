package com.gxd.dao;

import com.gxd.model.entity.Category;

/**
 * @author xuandongguo
 */
public interface CategoryDao {


    int deleteByPrimaryKey(Long id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

}
