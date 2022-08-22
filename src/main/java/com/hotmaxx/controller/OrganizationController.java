package com.hotmaxx.controller;


import com.hotmaxx.model.vo.InformationVO;
import com.hotmaxx.model.vo.OrgResultVO;
import com.hotmaxx.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/organization")
public class OrganizationController {
    @Autowired
    private OrganizationService organizationService;
    @GetMapping("/Eq")
    public List  getEq(){
      return   organizationService.getTheEq();
    }
//    @GetMapping("/getShop")
//    public List  getShop(){
//        return   organizationService.getShop();
//    }
    @GetMapping("/getOrgManager")
    public List  getEmployee(String orgCode){
        return   organizationService.getOrgManagerByOrgCode(orgCode);
    }

    @GetMapping("/getShopOwnner")
    public List  getManager(String orgCode){
        return   organizationService.getShopOwnerByOrgCode(orgCode);
    }


    @GetMapping("/getOrgInfo")
    public OrgResultVO getOrgInfo(String orgCode) {
        return organizationService.orgInfo(orgCode);
    }
    @GetMapping("/Hoep")
    public List<InformationVO> getHoepByOrgCode(String orgCode){
        return organizationService.getHoepByOrgCode(orgCode);
    }
}

