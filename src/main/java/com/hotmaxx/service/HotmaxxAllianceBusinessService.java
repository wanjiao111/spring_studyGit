package com.hotmaxx.service;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hotmaxx.mapper.HotmaxxAllianceBusinessMapper;
import com.hotmaxx.model.po.HotmaxxAllianceBusinessDemo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HotmaxxAllianceBusinessService extends ServiceImpl<HotmaxxAllianceBusinessMapper, HotmaxxAllianceBusinessDemo> {
    @Resource
    HotmaxxAllianceBusinessMapper allianceBusinessMapper;

    public List<HotmaxxAllianceBusinessDemo> list(String nameCode) {
        LambdaQueryWrapper<HotmaxxAllianceBusinessDemo> queryWrapper = new LambdaQueryWrapper<>();
        if (StrUtil.isNotBlank(nameCode)) {
            queryWrapper.and(wrapper -> wrapper.like(HotmaxxAllianceBusinessDemo::getName, nameCode).or().like(HotmaxxAllianceBusinessDemo::getCode, nameCode));

        }
        List<HotmaxxAllianceBusinessDemo> list=list(queryWrapper);
        return  list;
    }
}
