package com.gxd.controller;
import com.gxd.dao.Category;
import com.gxd.service.impl.CategoryServiceImplImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* (category)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/category")
public class CategoryController {
/**
* 服务对象
*/
@Resource
private CategoryServiceImpl categoryServiceImpl;

/**
* 通过主键查询单条数据
*
* @param id 主键
* @return 单条数据
*/
@GetMapping("selectOne")
public Category selectOne(Integer id) {
return categoryServiceImpl.selectByPrimaryKey(id);
}

}
