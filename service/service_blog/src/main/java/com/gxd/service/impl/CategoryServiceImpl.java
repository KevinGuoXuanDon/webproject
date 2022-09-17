package com.gxd.service.impl;

import com.gxd.dao.CategoryDao;
import com.gxd.model.entity.Category;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.gxd.service.CategoryService;
/**
 * @author xuandongguo
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryDao categoryDao;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return categoryDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Category record) {
        return categoryDao.insert(record);
    }

    @Override
    public int insertSelective(Category record) {
        return categoryDao.insertSelective(record);
    }

    @Override
    public Category selectByPrimaryKey(Long id) {
        return categoryDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Category record) {
        return categoryDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Category record) {
        return categoryDao.updateByPrimaryKey(record);
    }

}
