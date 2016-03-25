package com.aihecun.blogs.controller;

import com.aihecun.blogs.annotations.Intent;
import com.aihecun.blogs.model.User;
import com.aihecun.blogs.service.UserService;
import com.aihecun.blogs.util.ServiceException;
import com.aihecun.blogs.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by TianyuanPan on 3/22/16.
 */
@RestController
@Intent("数据库表tb_users")
@RequestMapping("/Access")
public class LoginController {

    @Autowired
    UserService  service;

    @RequestMapping("userlogin")
    public Object login(String userNumber,String password,HttpServletRequest request, ModelMap model) throws Exception{

        User user =  service.login(userNumber, password);
        try {


            if (user!=null){
                SessionUtil.setUser(request, user);
                model.addAttribute("idUser", user.getIdUser());
                model.addAttribute("userNumber", user.getUserNumber());
                model.addAttribute("userName", user.getUserName());
                model.addAttribute("password", user.getPassword());
                return "success";
            }
            throw new ServiceException("用户名或密码错误");

        }catch (ServiceException ex){

            model.addAttribute("err", ex.toString());
            return "errors/err";
        }

    }
}
