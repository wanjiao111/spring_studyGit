package com.hotmaxx.controller;

import com.hotmaxx.model.query.AllianceMarginQuery;
import com.hotmaxx.model.vo.AllianceMarginVO;
import com.hotmaxx.service.HotmaxxAllianceMarginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alliance/margin")
public class HotmaxxAllianceMarginController {
    @Autowired
    HotmaxxAllianceMarginService allianceMarginService;
    @PostMapping("/list")
    public List<AllianceMarginVO> getMarginList(AllianceMarginQuery allianceMarginQuery) {
        return allianceMarginService.getMarginList(allianceMarginQuery);
    }
}
