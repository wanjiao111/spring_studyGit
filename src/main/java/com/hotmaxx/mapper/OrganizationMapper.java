package com.hotmaxx.mapper;

import com.hotmaxx.model.vo.InformationVO;
import com.hotmaxx.model.vo.OrgManagerVO;
import com.hotmaxx.model.vo.ShopVO;
import com.hotmaxx.model.vo.ShopOwnnerVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrganizationMapper {
    List<ShopVO> getTheEq();
    List<ShopVO> getShop(String orgName);
    List<OrgManagerVO> getOrgManagerByOrgCode(String orgCode);
    List<ShopOwnnerVO> getShopOwnnerByOrgCode(String orgCode);
    List<InformationVO> getHoepByOrgCode(String orgCode);
}

