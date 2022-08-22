package com.hotmaxx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hotmaxx.model.po.HotmaxxAllianceMarginDemo;
import com.hotmaxx.model.query.AllianceMarginQuery;
import com.hotmaxx.model.vo.AllianceMarginVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HotmaxxAllianceMarginMapper extends BaseMapper<HotmaxxAllianceMarginDemo> {
    List<AllianceMarginVO> getMarginList(AllianceMarginQuery allianceMarginQuery);

}
