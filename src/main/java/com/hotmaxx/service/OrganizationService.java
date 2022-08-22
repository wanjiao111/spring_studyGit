package com.hotmaxx.service;

import com.hotmaxx.mapper.OrganizationMapper;
import com.hotmaxx.model.vo.InformationVO;
import com.hotmaxx.model.vo.OrgManagerVO;
import com.hotmaxx.model.vo.ShopOwnnerVO;
import com.hotmaxx.model.vo.OrgResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class OrganizationService {
    @Autowired
    private OrganizationMapper organizationMapper;
    public List getTheEq(){
        return organizationMapper.getTheEq();
    }
//    public List<ShopVO> getShop(){
//        return organizationMapper.getShop("北京二区");
//    }
    public List<OrgManagerVO> getOrgManagerByOrgCode(String orgCode){
        return organizationMapper.getOrgManagerByOrgCode(orgCode);
    }
    public List<ShopOwnnerVO> getShopOwnerByOrgCode(String orgCode){
        return organizationMapper.getShopOwnnerByOrgCode(orgCode);
    }


    public OrgResultVO orgInfo(String orgCode) {

//        List<OrgManagerVO> orgManagerList= organizationMapper.getOrgManagerByOrgCode(orgCode);
////        List<ShopVO> shopList = organizationMapper.getShop("北京二区");
//        List<ShopOwnnerVO> shopOwnnerList= organizationMapper.getShopOwnnerByOrgCode(orgCode);
        List<OrgManagerVO> orgManagerList = organizationMapper.getOrgManagerByOrgCode(orgCode);
        List<ShopOwnnerVO> shopOwnnerList = organizationMapper.getShopOwnnerByOrgCode(orgCode);
        OrgResultVO resultVO = new OrgResultVO();
        resultVO.setOrgManagerVOList(orgManagerList);
//        resultVO.setShopVOList(shopList);
        List<ShopOwnnerVO> collect = shopOwnnerList.stream()
                .filter(new Predicate<ShopOwnnerVO>() {
            @Override
            public boolean test(ShopOwnnerVO shopOwnnerVO) {
                return shopOwnnerVO != null;
            }
        }).collect(Collectors.toList());


        resultVO.setShopOwnnerVOList(collect);
        return resultVO;
    }
    public  List<InformationVO> getHoepByOrgCode(String orgCode){
        return organizationMapper.getHoepByOrgCode(orgCode);
    }




}
