package com.aihecun.blogs.controller.flowController;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by TianyuanPan on 4/15/16.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mvc-*.xml")
public class ArticleSectionUserRTest {

    @Autowired
    ArticleSectionUserR articleSectionUserR;

    @Test
    public void testSetRelationship() throws Exception {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String whereStr = "\"timeCreated\" > '" +
                dateFormat.format(new Date(new Date().getTime() - 10*24*60*60*1000)) +
                "' ORDER BY \"timeCreated\" DESC";
//         = new UserArticleSectionR();
        articleSectionUserR.SetRelationship(whereStr);

        List<ASURList> uasrs = articleSectionUserR.getASURLists();
        System.out.println("uasrs size: " + uasrs.size());


    }

    @Test
    public void testGetUasrs() throws Exception {

    }
}