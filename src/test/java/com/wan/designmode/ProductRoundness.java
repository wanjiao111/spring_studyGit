package com.wan.designmode;

public class ProductRoundness implements Product{

    @Override
    public void draw() {
        System.out.println("画圆形");
    }
    public void erase(){
        System.out.println("擦掉圆形");
    }
}
