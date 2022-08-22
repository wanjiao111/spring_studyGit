package com.hotmaxx.spring5.service;

import com.hotmaxx.spring5.Dao.UserDao;

import java.util.List;

public class UserService {
    private UserDao userDao;

    private List<String> list;

    public void setUserDao(UserDao userdao) {
        this.userDao = userdao;
    }
    public void update(){
        userDao.update();
    }

}
