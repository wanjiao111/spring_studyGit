package com.hotmaxx.spring5;

public class Orders {
    private String oname;
    private String address;

    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }
    public  void orderTest(){
        System.out.println(oname+address);

    }
}
