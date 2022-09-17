package com.gxd.controller;

import com.gxd.common.CommonResult;
import com.gxd.model.entity.Category;
import com.gxd.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (category)表控制层
 *
 * @author xuandongguo
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    /**
     * 服务对象
     */
    @Autowired
    private CategoryService categoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CommonResult<Category> selectOne(Long id) {
        return CommonResult.success(categoryService.selectByPrimaryKey(id));
    }

}
