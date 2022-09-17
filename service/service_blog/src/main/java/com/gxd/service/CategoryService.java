package com.gxd.service;

import com.gxd.model.entity.Category;

/**
 * @author xuandongguo
 */
public interface CategoryService {

    int deleteByPrimaryKey(Long id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

}
