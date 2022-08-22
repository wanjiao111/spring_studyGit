package com.hotmaxx.spring5.test;

import com.hotmaxx.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void testAdd(){
//        1.加载配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//        2.获取配置对象
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.update();
    }
}
