package com.wan.designmode;

public class ProductSquare implements Product{

    @Override
    public void draw() {
        System.out.println("画正方形");
    }
    public void erase(){
        System.out.println("擦掉正方形");
    }
}
