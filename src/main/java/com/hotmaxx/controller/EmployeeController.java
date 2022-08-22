package com.hotmaxx.controller;

import com.hotmaxx.model.po.EmployeeDemo;
import com.hotmaxx.model.vo.EmployeeDemoVO;
import com.hotmaxx.model.vo.InformationVO;
import com.hotmaxx.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/list")
    public List<EmployeeDemo> sayHello1() {

        List<EmployeeDemo> list = employeeService.list();

        return list;
    }   



    @GetMapping("/getByPhone")
    public List<EmployeeDemo> getByPhone(String phone) {
        return employeeService.getByPhone(phone);
    }


    /**
     * 文档注释
     * @return
     */
    @PostMapping("/save")
    public String sayHello2() {
        return "hello";
    }

    @GetMapping("/update")
    public Boolean updateById(EmployeeDemo employeeDemo) {
        employeeDemo.setId(1L);
        employeeDemo.setName("張三");
        employeeDemo.setMobile("12321321321321");
        employeeDemo.setName("112222");
        employeeDemo.setPostName("1232131");
        return employeeService.updateByTest(employeeDemo);
    }

    @GetMapping("/validlist")
    public List<EmployeeDemo> getValid() {
        return  employeeService.getVaild();

    }
    @GetMapping("/thephonelist")
    public List<EmployeeDemoVO> getThePhone() {
        return  employeeService.getThePhone();

    }
    @GetMapping("/themanager")
    public List getTheManager() {
        return (List) employeeService.getTheManager();

    }
    @GetMapping("/hsr")
    public List<InformationVO> getHsrByShopCode(String shopCode){
        return  employeeService.getHsrByShopCode(shopCode);
    }






}

