package com.org.dao;

import com.org.pojo.User;

/**
 * Created by weixin on 17-8-28.
 */
public class IUserDao implements UserDao {
    @Override
    public String queryPasswordByUsername(String sname) {
      return "123";
    }

    @Override
    public User userInfo(String sid) {
        return null;
    }
}
