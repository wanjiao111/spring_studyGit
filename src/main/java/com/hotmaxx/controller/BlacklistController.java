package com.hotmaxx.controller;

import com.hotmaxx.model.po.BlacklistDemo;
import com.hotmaxx.service.BlacklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blackList")
public class BlacklistController {
    @Autowired
    private BlacklistService blacklistservice;

   @GetMapping("/getByPhone")
   public boolean getByPhone(@RequestParam("mobile") String phone){
       return blacklistservice.getByPhone(phone);
   }
   @GetMapping("/getByName")
   public boolean getByName(@RequestParam("name")String name){
       return blacklistservice.getByName(name);
   }

   @PostMapping("/save")
    public boolean save(@RequestBody BlacklistDemo blacklistDemo) {

        System.out.println(blacklistDemo);
        return blacklistservice.saveDemo(blacklistDemo);

    }
    @GetMapping("/delete")
    public  boolean  delete(BlacklistDemo blacklistDemo){

       return  blacklistservice.deleteById("13");
    }
    @GetMapping("/update")
    public boolean update(BlacklistDemo blacklistDemo){
        blacklistDemo.setName("李玉");
        blacklistDemo.setPhone("178");
        blacklistDemo.setId(14);
       return blacklistservice.updateByName(blacklistDemo);
    }

//        List<EmployeeDemo> list = blacklistservice.list();
//       return     blacklistservice.printList();

    }


