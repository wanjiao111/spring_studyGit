package com.hotmaxx.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("hotmaxx_message")
public class MessageDemo {
    private Integer shopId;
    private Integer shopCode;
    private String shopName;
    private String states;
    private String orgStructure;
    private String province;
    private String city;
    private String area;
    private String shopAddress;
    private String openingTime;
    private String shopType;
    private String shopProperty;
    private String shopOwner;
    private String mobile;
}
