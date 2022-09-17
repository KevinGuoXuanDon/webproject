package com.gxd.controller;

import com.gxd.model.entity.Blog;
import com.gxd.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private BlogService blogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Blog selectOne(Long id) {
        return blogService.selectByPrimaryKey(id);
    }

}
