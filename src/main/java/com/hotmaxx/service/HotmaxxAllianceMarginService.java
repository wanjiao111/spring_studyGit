package com.hotmaxx.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hotmaxx.mapper.HotmaxxAllianceMarginMapper;
import com.hotmaxx.model.po.HotmaxxAllianceMarginDemo;
import com.hotmaxx.model.query.AllianceMarginQuery;
import com.hotmaxx.model.vo.AllianceMarginVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HotmaxxAllianceMarginService extends ServiceImpl<HotmaxxAllianceMarginMapper, HotmaxxAllianceMarginDemo> {
    @Resource
    HotmaxxAllianceMarginMapper allianceMarginMapper;

    public List<AllianceMarginVO> getMarginList(AllianceMarginQuery allianceMarginQuery) {
        return allianceMarginMapper.getMarginList(allianceMarginQuery);


    }
}
