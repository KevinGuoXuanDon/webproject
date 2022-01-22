package com.gxd.webproject;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gxd.webproject.dao.impl.UserDaoImpl;
import com.gxd.webproject.mapper.TestMapper;
import com.gxd.webproject.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class WebprojectApplicationTests {
    //自动装配，把mapper注入到当前类来使用,但是它是个interface，没有具体实现，会报"找不到UserMapper对象"，但是可以运行。
    //如果要，如何解决？ 在UserMapper上加注解，申明对象，可以用component，service或者repository
    @Autowired
    private UserDaoImpl usersMapper;

    @Autowired
    private TestMapper mapper;
    //查询User表的测试
    @Test
    void find() {
      User users= usersMapper.selectByPrimaryKey(1L);
      System.out.println(users);
    }
    //插入测试
    @Test
    void test(){
        User user = new User();
        user.setAge(30);
        user.setEmail("");
        user.setName("K");
        //如果不写id，则mybatis_plus会随机生成id
        int insert = usersMapper.insert(user);
        System.out.println(insert);
    }
    //乐观锁测试
    @Test
    void testOptismicLock(){
        User user = usersMapper.selectByPrimaryKey(1L);
        user.setAge(100);
        usersMapper.updateByPrimaryKey(user);
    }
    //分页查询
    @Test
    void getByBatchIds(){
        Page<User> page = new Page<>();
        //把所有数据封装到Page里
        mapper.selectPage(page,null);
        System.out.println(page.getCurrent());
    }
    //条件查询测试
    @Test
    void testBaseMapper(){
        //但是使用wrapper查询似乎无法使用索引？
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //通过QueryWrapper查询条件时
        //gt,ge,le,lt  > >= < <=
        wrapper.ge("age",30);
        //eq,ne  == !=
        wrapper.eq("id",1);
        //between 包含边界
        wrapper.between("age",10,30);
        //like
        //orderByDesc 降序
        wrapper.orderByDesc("id");
        //last  拼接语句在sql最后
        wrapper.last("limit 1");
        //指定查询列
        wrapper.select("id","name");
    }
}
