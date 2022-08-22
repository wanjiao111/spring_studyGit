package com.mybatisTest;

import com.hotmaxx.mapper.EmployeeMapper;
import com.hotmaxx.model.po.EmployeeDemo;
import com.hotmaxx.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MapperTest {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    EmployeeMapper employeeMapper;
    @Test
    public void testInsertMore(){
        List<EmployeeDemo> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            EmployeeDemo employeeDemo = new EmployeeDemo();
            employeeDemo.setName("abc"+i);
            employeeDemo.setMobile("200"+i);
            list.add(employeeDemo);
        }
        boolean b = employeeService.saveBatch(list);
        System.out.println(b);
    }
    @Test
    public void testSelectList(){
        List<EmployeeDemo> list=employeeMapper.selectList(null);
        list.forEach(System.out::println);
    }

}
