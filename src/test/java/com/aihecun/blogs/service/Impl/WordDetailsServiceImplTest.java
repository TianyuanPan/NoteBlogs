package com.aihecun.blogs.service.Impl;

import com.aihecun.blogs.model.WordDetails;
import com.aihecun.blogs.service.WordDetailsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by TianyuanPan on 3/25/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-*.xml")
public class WordDetailsServiceImplTest {

    @Autowired
    WordDetailsService service;

    @Test
    public void testCreateNewWordDetail() throws Exception {

        WordDetails wordDetails = new WordDetails();
        wordDetails.setId_details(new Long(new Date().getTime()).toString());
        wordDetails.setId_word("10001");
        wordDetails.setShortcut("n.");
        wordDetails.setDetails("热爱;  爱情，爱意;  疼爱;  爱人，所爱之物");

        service.createNewWordDetail(wordDetails);
    }

    @Test
    public void testUpdateDetail() throws Exception {
//        WordDetails wordDetails = new WordDetails();
//        wordDetails.setId_details(new Long(new Date().getTime()).toString());
//        wordDetails.setId_word("10001");
//        wordDetails.setShortcut("n.");
//        wordDetails.setDetails("热爱;  爱情，爱意;  疼爱;  爱人，所爱之物");
//
//        System.out.println(wordDetails.getDetails().toString());

        service.updateDetail("details = '热爱;爱情,爱意;疼爱;爱人，所爱之物，所爱之事'", "1458880889944");
    }

    @Test
    public void testFindWordDetails() throws Exception {

    }
}