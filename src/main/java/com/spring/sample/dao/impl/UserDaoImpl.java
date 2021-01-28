package com.spring.sample.dao.impl;

import com.spring.sample.dao.IUserDao;

public class UserDaoImpl implements IUserDao {

    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
