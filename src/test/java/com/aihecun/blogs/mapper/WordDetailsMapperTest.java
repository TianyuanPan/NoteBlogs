package com.aihecun.blogs.mapper;

import com.aihecun.blogs.model.WordDetails;
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
public class WordDetailsMapperTest {

    @Autowired
    WordDetailsMapper mapper;

    @Test
    public void testCreateNewWordDetail() throws Exception {

        WordDetails wordDetails = new WordDetails();
        wordDetails.setId_details(new Long(new Date().getTime()).toString());
        wordDetails.setId_word("10001");
        wordDetails.setShortcut("verb. vt&vi");
        wordDetails.setDetails("喜欢;  爱，热爱;  爱戴;  赞美，称赞");

        mapper.createNewWordDetail(wordDetails);


    }

    @Test
    public void testUpdateDetail() throws Exception {

    }

    @Test
    public void testFindWordDetails() throws Exception {

    }
}