package com.gxd.controller;
import com.gxd.dao.Blog;
import com.gxd.service.impl.BlogServiceImplImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* (blog)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/blog")
public class BlogController {
/**
* 服务对象
*/
@Resource
private BlogServiceImpl blogServiceImpl;

/**
* 通过主键查询单条数据
*
* @param id 主键
* @return 单条数据
*/
@GetMapping("selectOne")
public Blog selectOne(Integer id) {
return blogServiceImpl.selectByPrimaryKey(id);
}

}
