package com.gxd.controller;

import com.gxd.service.VisitorService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (visitor)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/visitor")
public class VisitorController {
    /**
     * 服务对象
     */
    @Resource
    private VisitorService visitorService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
//    @GetMapping("selectOne")
//    public Visitor selectOne(Integer id) {
//        return visitorService.selectByPrimaryKey(id);
//    }

}
