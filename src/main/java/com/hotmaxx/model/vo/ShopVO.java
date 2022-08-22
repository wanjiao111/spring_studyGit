package com.hotmaxx.model.vo;

import lombok.Data;

@Data
public class ShopVO {
    private String orgCode;

    private String orgName;
    String name;
    String shopCode;
    String shopName;


    public static void main(String[] args) {
        Integer a = -129;
        Integer integer = -128;
        System.out.println(a == integer);
    }
}
