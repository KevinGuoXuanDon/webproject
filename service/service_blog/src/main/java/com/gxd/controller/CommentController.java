package com.gxd.controller;

import com.gxd.service.impl.CommentServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (comment)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/comment")
public class CommentController {
    /**
     * 服务对象
     */
    @Resource
    private CommentServiceImpl commentServiceImpl;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
//    @GetMapping("selectOne")
//    public BaseModel<Comment> selectOne(Integer id) {
//        return commentServiceImpl.selectByPrimaryKey(id);
//    }

}
