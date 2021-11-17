package com.yl.service;

import com.yl.dao.UserDao;

/**
 * @author candk
 * @Description
 * @date 11/17/21 - 10:56 AM
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("Service Add...");
        userDao.update();
    }
}
