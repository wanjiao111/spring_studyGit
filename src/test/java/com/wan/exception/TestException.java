package com.wan.exception;

import junit.framework.Test;

public class TestException {
    private static final String name="wan";
    public static final int passWord=123;
    public static void main(String[] args) {
        TestException testException = new TestException();
        testException.login("wan",1234);

    }
    public  void login(String name,int passWord){
        try{
            if(!this.name.equals(name))
                throw new NameException("用户名错误");
        }catch (NameException e){
            e.printStackTrace();
        }
        try{
            if(this.passWord!=(passWord))
                throw new PassWordException("密码错误");
        }catch (PassWordException e){
            e.printStackTrace();
        }
        System.out.println("成功");
    }

}
class NameException extends RuntimeException{
    public NameException(String message){
        super(message);
    }
}
class PassWordException extends RuntimeException{
    public PassWordException(String message){
        super(message);
    }
}
