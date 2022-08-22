package com.hotmaxx.controller;

import com.hotmaxx.model.vo.InformationVO;
import com.hotmaxx.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    private ShopService shopService;
    @GetMapping("/shopOwner")
    public List<InformationVO> getShopOwnerByShopCode(String shopCode){
        return shopService.getShopOwnerByShopCOde(shopCode);
    }
}
