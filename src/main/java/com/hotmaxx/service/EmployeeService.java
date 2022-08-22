package com.hotmaxx.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hotmaxx.mapper.EmployeeMapper;
import com.hotmaxx.model.po.EmployeeDemo;
import com.hotmaxx.model.vo.EmployeeDemoVO;
import com.hotmaxx.model.vo.InformationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService extends ServiceImpl<EmployeeMapper , EmployeeDemo> {


    @Autowired
    private EmployeeMapper employeeMapper;
    private EmployeeDemo employeeDemo;

    public List<EmployeeDemo> getByPhone(String phone) {

//        1. QueryWrapper查询
        LambdaQueryWrapper<EmployeeDemo> queryWrapper = new LambdaQueryWrapper<>();

        queryWrapper.eq(phone != null, EmployeeDemo::getMobile, phone);


        List<EmployeeDemo> list = list(queryWrapper);
        return list;
    }


//    public List<EmployeeDemo> getByPhoneSQL(String phone) {
//        return employeeMapper.getByPhoneSQL(phone);
//    }

    public boolean updateByTest(EmployeeDemo employeeDemo) {
        return updateById(employeeDemo);
    }
//    public boolean updateById(EmployeeDemo employeeDemo) {
//        return true;
//    }
    public List<EmployeeDemo> getVaild(){

        return employeeMapper.getByPostName();

    }
    public List<EmployeeDemoVO> getThePhone(){
        return employeeMapper.getThePhone();
    }
    public Object getTheManager(){

//
//        String result = employeeMapper.getTheManagerMap();
//
//        System.out.println(result);
        return employeeMapper.getTheManagerMap();

    }
    public List geteployee(String mobile){
        LambdaQueryWrapper<EmployeeDemo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(EmployeeDemo::getMobile,mobile);
        List<EmployeeDemo> list=list(queryWrapper);
        return list;
    }
    public List<InformationVO> getHsrByShopCode(String shopCode){
        return employeeMapper.getHsrByShopCode(shopCode);
    }
}
