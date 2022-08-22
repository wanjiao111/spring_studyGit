package com.hotmaxx.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hotmaxx.mapper.BlacklistMapper;
import com.hotmaxx.model.po.BlacklistDemo;
import com.hotmaxx.model.po.EmployeeEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class BlacklistService extends ServiceImpl<BlacklistMapper, BlacklistDemo> {
    @Resource
    private BlacklistMapper blacklistmapper;

    public boolean getByPhone(String phone) {
        LambdaQueryWrapper<BlacklistDemo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(phone != null, BlacklistDemo::getPhone, phone);

        List<BlacklistDemo> list = list(queryWrapper);

        for (int i = 0; i < list.size(); i++) {
            BlacklistDemo blacklistDemo = list.get(i);
            System.out.println(blacklistDemo);
        }

        for (BlacklistDemo blacklistDemo : list) {
            System.out.println(blacklistDemo);
        }

        list.forEach(System.out::println);

//        List<BlacklistDemo> list2=list(queryWrapper);
//        list2.stream().forEach(System.out::println);
//        return list.size()!=0;

        int a = list.size();
        return a != 0;
    }


    public boolean saveDemo(BlacklistDemo blacklistDemo) {
        return save(blacklistDemo);
    }

    public boolean deleteDemo(BlacklistDemo blacklistDemo) {
        QueryWrapper<BlacklistDemo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", blacklistDemo.getName());
        return remove(queryWrapper);
    }

    public boolean getByName(String name) {
        LambdaQueryWrapper<BlacklistDemo> queryWrapper = new   LambdaQueryWrapper<>();
        queryWrapper.eq(BlacklistDemo::getName, name);
        List<BlacklistDemo> list = list(queryWrapper);

        return list.size()!=0;

    }
    public boolean deleteById(String id){
        LambdaQueryWrapper<BlacklistDemo> queryWrapper = new   LambdaQueryWrapper<>();
        queryWrapper.eq(BlacklistDemo::getId,id);

        return remove(queryWrapper );
    }


    public boolean updateByName(BlacklistDemo blacklistDemo) {

        return updateById(blacklistDemo);
    }
    public List<BlacklistDemo> printList(){
        LambdaQueryWrapper<BlacklistDemo> queryWrapper=new LambdaQueryWrapper<>();
        return list(queryWrapper);
    }
}
