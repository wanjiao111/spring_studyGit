package com.hotmaxx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hotmaxx.model.po.HotmaxxAllianceBindShopDemo;
import com.hotmaxx.model.query.AllianceShopQuery;
import com.hotmaxx.model.vo.AllianceShopVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HotmaxxAllianceShopMapper extends BaseMapper<HotmaxxAllianceBindShopDemo> {
   List<AllianceShopVO> getShopList(AllianceShopQuery allianceShopQuery);

}
