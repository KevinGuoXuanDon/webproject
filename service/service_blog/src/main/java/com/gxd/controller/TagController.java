package com.gxd.controller;

import com.gxd.service.impl.TagServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (tag)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/tag")
public class TagController {
    /**
     * 服务对象
     */
    @Resource
    private TagServiceImpl tagServiceImpl;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
//    @GetMapping("selectOne")
//    public Tag selectOne(Integer id) {
//        return tagServiceImpl.selectByPrimaryKey(id);
//    }

}
