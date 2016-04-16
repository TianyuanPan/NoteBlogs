package com.aihecun.blogs.service;

import com.aihecun.blogs.model.Fans;
import com.aihecun.blogs.util.JacksonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by TianyuanPan on 4/11/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mvc-*.xml")
public class FansServiceTest {

    @Autowired
    FansService fansService;

    @Test
    public void testCreateNewFans() throws Exception {

        Fans fans = new Fans();
        fans.setIdUser("123456");
        fans.setUserNo("117");
        fans.setIdFans(new Long(new java.util.Date().getTime()).toString());

        if (fansService.createNewFans(fans) > 0)
            System.out.println("crate fans return code: > 0");
        else
            System.out.println("crate fans return code: <= 0");
    }

    @Test
    public void testDeleteFans() throws Exception {
        Fans fans = fansService.getFansById("1460358328162");

        if (fans != null) {
            fans.setFlag(true);
            if (fansService.deleteFans(fans) > 0)
            System.out.println("delete fans return: > 0 fans:\n" + JacksonUtil.toJson(fans));
        }else
            System.out.println("get fans by id user: null");
    }

    @Test
    public void testGetFansById() throws Exception {

        Fans fans = fansService.getFansById("1460358328162");

        if (fans != null)
            System.out.println("get fans by id user:\n" + JacksonUtil.toJson(fans));
        else
            System.out.println("get fans by id user: null");

    }

    @Test
    public void testGetFansByIdUser() throws Exception {

        List<Fans> fans = fansService.getFansByIdUser("123456");

        if (fans != null){
            for (Fans f : fans)
                System.out.println("get fans by id user:\n" + JacksonUtil.toJson(f));
        }else
            System.out.println("get fans by id user: null");
    }
}