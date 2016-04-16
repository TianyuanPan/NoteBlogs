package com.aihecun.blogs.service.siteService;

import com.aihecun.blogs.model.siteModel.Navigation;
import com.aihecun.blogs.util.JacksonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Random;

/**
 * Created by TianyuanPan on 4/11/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mvc-*.xml")
public class NavigationServiceTest {

    @Autowired
    NavigationService service;

    @Test
    public void testAddNewNavigation() throws Exception {

        Navigation navigation = new Navigation();

        navigation.setIdNavigation(new Long(new java.util.Date().getTime()).toString());
        navigation.setNavigationName("name -> " + new Random().nextInt());
        navigation.setUrl("http://www.baidu.com");

        if (service.addNewNavigation(navigation) > 0)
            System.out.println("return code: > 0");
        else
            System.out.println("return code: <= 0");
    }

    @Test
    public void testUpdateNavigation() throws Exception {

        Navigation navigation = service.getNavigationByName("Home");
        if (navigation != null) {
            System.out.println("get is:\n" + JacksonUtil.toJson(navigation));
            navigation.setUrl("http://www.baidu.com/");
            if (service.updateNavigation(navigation) > 0)
                System.out.println("update return code: > 0");
            else
                System.out.println("update return code: <= 0");
        }else
            System.out.println("get is null");

    }

    @Test
    public void testDeleteNavigationByName() throws Exception {

        if (service.deleteNavigationByName("name -> -2114286901") > 0)
            System.out.println("delete return: > 0");
        else
            System.out.println("delete return: <= 0");
    }

    @Test
    public void testGetAllNavigation() throws Exception {

        List<Navigation> navigations = service.getAllNavigation();

        if (navigations != null)
            for (Navigation n : navigations)
                System.out.println("get is:\n" + JacksonUtil.toJson(n));
        else
            System.out.println("get is null");

    }

    @Test
    public void testGetNavigationByName() throws Exception {

        Navigation navigation = service.getNavigationByName("Home");
        if (navigation != null)
            System.out.println("get is:\n" + JacksonUtil.toJson(navigation));
        else
            System.out.println("get is null");
    }
}