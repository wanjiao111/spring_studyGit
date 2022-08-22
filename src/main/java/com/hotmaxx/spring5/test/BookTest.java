package com.hotmaxx.spring5.test;

import com.hotmaxx.spring5.Orders;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {
    public static void main(String[] args) {
        orderTest();
    }
    public static  void orderTest() {
        //1.加载配置文件
        ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
        //2.获取配置创建的对象
        Orders orders = con.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.orderTest();

    }
}
