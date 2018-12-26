package com.org.dao;

import com.org.pojo.User;

/**
 * Created by weixin on 17-8-28.
 */
public interface UserDao {
    public String  queryPasswordByUsername(String sname);

    public User userInfo(String sid);
}
