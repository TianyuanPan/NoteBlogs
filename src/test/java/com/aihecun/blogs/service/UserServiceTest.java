package com.aihecun.blogs.service;

import com.aihecun.blogs.model.User;
import com.aihecun.blogs.util.JacksonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by TianyuanPan on 4/10/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mvc-*.xml")
public class UserServiceTest {



    @Autowired
    UserService service;

    @Test
    public void testLogin() throws Exception {

        User user;
        user = service.login("1002016","admin");
        if (user != null)
            System.out.println("Login user is:\n" + JacksonUtil.toJson(user));
        else
            System.out.println("service.login(...) error, user is null");

    }

    @Test
    public void testCreateNewUser() throws Exception {

        User user = new User();
        user.setIdUser(new Long(new java.util.Date().getTime()).toString());
        user.setUserNo(new Integer(new java.util.Date().getYear() + new Random().nextInt()).toString());
        user.setUserName("name_" + new Integer(new java.util.Date().getYear() + new Random().nextInt()).toString());
        user.setPassword("123456");

        System.out.println("Will create the user:\n" + JacksonUtil.toJson(user));

        service.createNewUser(user);

        User user1 = service.getUserByNo(user.getUserNo());
        if (user1 != null)
            System.out.println("After create the user:\n" + JacksonUtil.toJson(user1));
        else
            System.out.println("After create the user: IS NULL");
    }

    @Test
    public void testUpdateUser() throws Exception {

        User user = service.getUserById("1002016");
        if (user != null){
            System.out.println("Get user is:\n" + JacksonUtil.toJson(user));
            user.setUserName("name_" + new Integer(new Random().nextInt()).toString());
            user.setTimeUpdated(new java.util.Date());
            service.updateUser(user);
        }else{
            System.out.println("get User NO = 1002016 is NULL");
            return;
        }

        user = service.getUserByNo("1002016");

        if (user != null)
            System.out.println("After update the user:\n" + JacksonUtil.toJson(user));
        else
            System.out.println("After update the user get is NULL");

    }

    @Test
    public void testGetUserByNo() throws Exception {
        User user;
        user = service.getUserByNo("1002016");
        if (user != null)
            System.out.println("Get user is:\n" + JacksonUtil.toJson(user));
        else
            System.out.println("service.getUserByNo(...) error, user is null");
    }
}