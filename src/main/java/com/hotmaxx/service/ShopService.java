package com.hotmaxx.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hotmaxx.mapper.ShopMapper;
import com.hotmaxx.model.po.ShopDemo;
import com.hotmaxx.model.vo.InformationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShopService extends ServiceImpl<ShopMapper, ShopDemo> {
    @Autowired
    ShopMapper informationMapper;
    public List<InformationVO> getShopOwnerByShopCOde(String shopCode){
        return informationMapper.getShopOwnerByShopCode(shopCode);


    }
}
