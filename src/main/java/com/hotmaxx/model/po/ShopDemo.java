package com.hotmaxx.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("hotmaxx_shop")
public class ShopDemo {
    private String employeeId;
    private String shopCode;



}
