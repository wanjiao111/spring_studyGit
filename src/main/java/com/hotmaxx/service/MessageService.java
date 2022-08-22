package com.hotmaxx.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hotmaxx.mapper.MessageMapper;
import com.hotmaxx.model.po.MessageDemo;
import com.hotmaxx.model.query.MessageByIdOrCodeQuery;
import com.hotmaxx.model.vo.MessageVO;
import com.hotmaxx.model.vo.ShopCountVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class MessageService extends ServiceImpl <MessageMapper,MessageDemo>{
    @Autowired
    private MessageMapper messageMapper;
    public List<MessageVO> getMessageByIdOrCode( MessageByIdOrCodeQuery messageByIdOrCodeQuery){
        LambdaQueryWrapper<MessageDemo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Objects.nonNull(messageByIdOrCodeQuery.getShopId()),MessageDemo::getShopId,messageByIdOrCodeQuery.getShopId());
        queryWrapper.eq(Objects.nonNull(messageByIdOrCodeQuery.getShopCode()),MessageDemo::getShopCode,messageByIdOrCodeQuery.getShopCode());
        List<MessageDemo> list=list(queryWrapper);
        List<MessageVO> collect = list.stream().map(e -> {
            MessageVO messageVO = new MessageVO();
//            messageVO.setArea(e.getArea());
//            messageVO.setCity(e.getCity());
//            messageVO.setMobile(e.getMobile());
//            messageVO.setOpeningTime(e.getOpeningTime());
//            messageVO.setShopCode(e.getShopCode());
//            messageVO.setShopName(e.getShopName());
//            messageVO.setProvince(e.getProvince());
//            messageVO.setOrgStructure(e.getOrgStructure());
//            messageVO.setShopOwner(e.getShopOwner());
//            messageVO.setStates(e.getStates());
//            messageVO.setCity(e.getCity());
//            messageVO.setShopProperty(e.getShopProperty());
//            messageVO.setShopType(e.getShopType());
            BeanUtils.copyProperties(e, messageVO);
            return messageVO;

        }).collect(Collectors.toList());
        return collect;

    }
    public List<MessageVO>  getMessage(){
        LambdaQueryWrapper<MessageDemo> queryWrapper = new LambdaQueryWrapper<>();
        List<MessageDemo> list=list(queryWrapper);
        List<MessageVO> collect = list.stream().map(e -> {
            MessageVO messageVO = new MessageVO();
            messageVO.setArea(e.getArea());
            messageVO.setCity(e.getCity());
            messageVO.setMobile(e.getMobile());
            messageVO.setOpeningTime(e.getOpeningTime());
            messageVO.setShopCode(e.getShopCode());
            messageVO.setShopName(e.getShopName());
            messageVO.setProvince(e.getProvince());
            messageVO.setOrgStructure(e.getOrgStructure());
            messageVO.setShopOwner(e.getShopOwner());
            messageVO.setStates(e.getStates());
            messageVO.setCity(e.getCity());
            messageVO.setShopProperty(e.getShopProperty());
            messageVO.setShopType(e.getShopType());

            return messageVO;


        }).collect(Collectors.toList());
        return collect;
    }
    public ShopCountVO getShopCount(){
        LambdaQueryWrapper<MessageDemo> queryWrapper = new LambdaQueryWrapper<>();
        List<MessageDemo> list=list(queryWrapper);
        long allCount = list.stream().count();
        long inBusiness =list.stream().filter(e -> e.getStates().equals("在营")).count();
        long closeShop = list.stream().filter(e -> e.getStates().equals("闭店")).count();
        long tempCloseShop = list.stream().filter(e -> e.getStates().equals("临时闭店")).count();
        long waitOpen = list.stream().filter(e -> e.getStates().equals("待开业")).count();
        long postPone = list.stream().filter(e -> e.getStates().equals("延期")).count();
        long waitSign = list.stream().filter(e -> e.getStates().equals("待正式签约")).count();
        long waitConfirm = list.stream().filter(e -> e.getStates().equals("待定")).count();
        ShopCountVO shopCountVO = new ShopCountVO();
        shopCountVO.setAllCount(allCount);
        shopCountVO.setInBusiness(inBusiness);
        shopCountVO.setCloseShop(closeShop);
        shopCountVO.setTempCloseShop(tempCloseShop);
        shopCountVO.setWaitOpen(waitOpen);
        shopCountVO.setPostPone(postPone);
        shopCountVO.setWaitSign(waitSign);
        shopCountVO.setWaitConfirm(waitConfirm);
        return shopCountVO;
     }
     public List<MessageDemo> getList(){
         LambdaQueryWrapper<MessageDemo> queryWrapper = new LambdaQueryWrapper<>();
         List<MessageDemo> list=list(queryWrapper);
         return list;
     }

}
