package com.org.service.impl;

import com.org.config.MysqlConfig;
import com.org.dao.UserDao;
import com.org.pojo.User;
import com.org.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by weixin on 17-8-28.
 */
@Service
public class UserService implements IUserService{

    @Value("${aliyun.appkey}")
    private String appkey;
    @Value("${aliyun.secretkey}")
    private String secretkey;

    @Autowired
    private UserDao userDao;

    @Override
    public String login(User user) {

        System.out.println(appkey);
        System.out.println(secretkey);

        String username=user.getSname();
        String res=userDao.queryPasswordByUsername(username);

        if(res==null){
            return "用户不存在";
        }
        String password=user.getSpassword();
        if(password.equals(res)){
            return "0";
        }
        else{
            return "100";
        }
    }

}
