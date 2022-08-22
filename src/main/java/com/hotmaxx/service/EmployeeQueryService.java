package com.hotmaxx.service;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hotmaxx.mapper.EmployeeQueryMapper;
import com.hotmaxx.model.query.EmployeeQuery;
import com.hotmaxx.model.vo.EmployeeQueryVO;
import com.hotmaxx.model.po.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class   EmployeeQueryService extends ServiceImpl<EmployeeQueryMapper, EmployeeEntity> {
    @Autowired
    private EmployeeQueryMapper employeeQueryMapper;

    public List<EmployeeQueryVO> query(EmployeeQuery employeequery) {
        LambdaQueryWrapper<EmployeeEntity> queryWrapper = new LambdaQueryWrapper<EmployeeEntity>();
        queryWrapper.eq(StrUtil.isNotBlank(employeequery.getEmployeeId()), EmployeeEntity::getEmployeeId, employeequery.getEmployeeId());
        queryWrapper.eq(EmployeeEntity::getMobile, employeequery.getMobile());


//
//        Page<EmployeeEntity> employeeEntityPage = employee  eQueryMapper.selectPage(new Page<>(employeequery.getCurrentPage(), employeequery.getPageSize()), queryWrapper);
//
//        // 拿到查询内容
//        List<EmployeeEntity> records = employeeEntityPage.getRecords();
//
//        // 实体转换成vo
//        List<EmployeeQueryVO> voList = new ArrayList<>();
//        for (EmployeeEntity record : records) {
//            EmployeeQueryVO vo = new EmployeeQueryVO();
//            BeanUtil.copyProperties(record, vo);
//
//            voList.add(vo);

        List<EmployeeEntity> list = list(queryWrapper);
//        List<EmployeeQueryVO> result=new ArrayList<>();
//        for(EmployeeEntity e:list){
//            EmployeeQueryVO vo=new EmployeeQueryVO();
//            vo.setMobile(e.getMobile());
//            vo.setEmployeeId(e.getEmployeeId());
//            result.add(vo);
//        }
//

        List<EmployeeQueryVO> collect = list.stream().map(e -> {
            EmployeeQueryVO vo = new EmployeeQueryVO();
            vo.setEmployeeId(e.getEmployeeId());
            vo.setMobile(e.getMobile());
            vo.setPosition(e.getPosition());
            vo.setRegion(e.getRegion());
            vo.setStates(e.getStates());
            return vo;
        }).collect(Collectors.toList());

        return collect;

    }


//        return new Pageable<>((int) employeeEntityPage.getCurrent(), (int) employeeEntityPage.getSize(), employeeEntityPage.getTotal(), voList);
}

