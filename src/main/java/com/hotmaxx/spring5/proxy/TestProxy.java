package com.hotmaxx.spring5.proxy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TestProxy {
    @Pointcut(value = "execution(*com.hotmaxx.spring5.service.UserService.update(..))")
    public void pointDemo(){

    }
    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("before......");
    }
}
