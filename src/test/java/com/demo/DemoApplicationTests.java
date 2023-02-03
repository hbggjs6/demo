package com.demo;

import com.demo.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    UserDao userDao;

    @Test
    void contextLoads() {
        System.out.println(userDao.getInformation("汪海波").getName());
        System.out.println(userDao.getInformation("汪海波").getAge());

    }

}
