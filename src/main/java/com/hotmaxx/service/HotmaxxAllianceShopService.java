package com.hotmaxx.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hotmaxx.mapper.HotmaxxAllianceShopMapper;
import com.hotmaxx.model.po.HotmaxxAllianceBindShopDemo;
import com.hotmaxx.model.query.AllianceShopQuery;
import com.hotmaxx.model.vo.AllianceShopVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HotmaxxAllianceShopService extends ServiceImpl<HotmaxxAllianceShopMapper, HotmaxxAllianceBindShopDemo> {
//    @Resource
//    HotmaxxAllianceShopMapper allianceShopMapper;
    public List<AllianceShopVO> getShopList(AllianceShopQuery allianceShopQuery){
        return baseMapper.getShopList(allianceShopQuery);
    }

}
