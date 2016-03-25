package com.aihecun.blogs.mapper;

import com.aihecun.blogs.model.Word;
import com.aihecun.blogs.service.WordService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.text.html.parser.Parser;
import java.util.Date;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by TianyuanPan on 3/24/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-*.xml")
public class WordMapperTest {


    @Autowired
    WordMapper mapper;

    @Test
    public void testCreateNewWord() throws Exception {

        Word model = new Word();
        model.setIdUser("000000");
        model.setIdWord(new Long(new Date().getTime()).toString());
        model.setCreatedDate("2016-03-25");
        model.setCreatedTime("17:20:32");
        model.setUpdateDate("2016-03-27");
        model.setUpdateTime("11:07:23");
        model.setWord("you");

        String expr = "";

        try{
            expr = model.getInsertExprString();
        }catch (Exception ex){

            ex.printStackTrace();
            return;
        }

        System.out.println("Expr: " + expr);


        System.out.println("===> crated new word: " + mapper.createNewWord(expr));

    }

    @Test
    public void testUpdateWord() throws Exception {

        mapper.updateWord("phonetic='lo:v',pronounce='30'", "1458876229811");
    }

    @Test
    public void testFindLikeWords() throws Exception {

    }

    @Test
    public void testFindWords() throws Exception {

    }
}