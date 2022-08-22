package com.hotmaxx.model.vo;

import lombok.Data;

import java.util.List;

@Data
public class OrgResultVO {

    private String orgCode;

    private String orgName;


    private List<OrgManagerVO> orgManagerVOList;

    private List<ShopOwnnerVO> shopOwnnerVOList;

//    private List<ShopVO> shopVOList;


}
