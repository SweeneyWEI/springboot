package com.org.controller;

import com.org.pojo.User;
import com.org.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by weixin on 17-8-28.
 */
@Controller
@RequestMapping("/user")
public class UserC {
    @Autowired
    private IUserService userService;
    @PostMapping("/login")
    public String login(@RequestBody User user){
        String res=userService.login(user);
        return res;


//        if ("0".equals(res)){
//            return "登录成功";
//        }
//        else {
//            if ("1".equals(res)) {
//                return "登录失败";
//            } else {
//                return "密码错误";
//            }
//        }
    }
}