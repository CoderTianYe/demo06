package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class DemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
   public void contextLoads() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        for (User user : userList) {
            System.out.println(user);


        }
    }


    @Test
    public void testSelecrById()
        {
            QueryWrapper queryWrapper = new QueryWrapper(new User());
            queryWrapper.like("name","J");

            List<User> users =this.userMapper.selectList(queryWrapper);
            for (User user: users
                 ) {
                System.out.println(user);
            };
        }
        }
