package com.hotmaxx.controller;

import com.hotmaxx.model.po.HotmaxxAllianceBusinessDemo;
import com.hotmaxx.service.HotmaxxAllianceBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alliance/business")
public class HotmaxxAllianceBusinessController {
    @Autowired
    HotmaxxAllianceBusinessService allianceBusinessService;
    @PostMapping("/list")
    public List<HotmaxxAllianceBusinessDemo> list(String nameCode){
    return allianceBusinessService.list(nameCode);
    }

}
