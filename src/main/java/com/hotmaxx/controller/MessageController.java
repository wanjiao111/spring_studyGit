package com.hotmaxx.controller;
import com.hotmaxx.model.po.MessageDemo;
import com.hotmaxx.model.query.MessageByIdOrCodeQuery;
import com.hotmaxx.model.vo.MessageVO;
import com.hotmaxx.model.vo.ShopCountVO;
import com.hotmaxx.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")

public class MessageController {
    @Autowired
    private MessageService messageService;
    @GetMapping ("/getMessageByIdOrCode")
    public List<MessageVO> getMessageByIdOrCode( MessageByIdOrCodeQuery messageByIdOrCodeQuery){
        return messageService.getMessageByIdOrCode( messageByIdOrCodeQuery);
    }
//    @PostMapping ("/getMessageByIdOrCode")
//    public List<MessageVO> postGetMessageByIdOrCode(@RequestBody  MessageByIdOrCodeQuery messageByIdOrCodeQuery){
//        return messageService.getMessageByIdOrCode( messageByIdOrCodeQuery);
//    }
    @GetMapping("/getMessage")
    public  List<MessageVO> getMessage(){
        return  messageService.getMessage();
    }
    @GetMapping("/getShopCount")
    public ShopCountVO getShopCount(){
        return  messageService.getShopCount();
    }
    @GetMapping("/getList")
    public  List<MessageDemo> getList(){
        return messageService.getList();
    }
}
