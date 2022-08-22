package com.hotmaxx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hotmaxx.model.po.ShopDemo;
import com.hotmaxx.model.vo.InformationVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ShopMapper extends BaseMapper <ShopDemo>{

    List<InformationVO> getShopOwnerByShopCode(String shopCode);


}
