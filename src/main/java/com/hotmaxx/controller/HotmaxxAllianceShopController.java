package com.hotmaxx.controller;

import com.hotmaxx.model.query.AllianceShopQuery;
import com.hotmaxx.model.vo.AllianceShopVO;
import com.hotmaxx.service.HotmaxxAllianceShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alliance/bind/shop")
public class HotmaxxAllianceShopController {
    @Autowired
    HotmaxxAllianceShopService allianceShopService;
    @PostMapping("/list")
    public List<AllianceShopVO> getShopList(@RequestBody AllianceShopQuery allianceShopQuery){
        return allianceShopService.getShopList(allianceShopQuery);
    }
}
