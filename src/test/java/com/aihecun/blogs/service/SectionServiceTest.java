package com.aihecun.blogs.service;

import com.aihecun.blogs.model.Article;
import com.aihecun.blogs.model.Section;
import com.aihecun.blogs.util.JacksonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by TianyuanPan on 4/11/16.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mvc-*.xml")
public class SectionServiceTest {


    @Autowired
    ArticleService articleService;
    @Autowired
    SectionService sectionService;

    @Test
    public void testCreateNewSection() throws Exception {

        Article article = articleService.getArticleById("123456789");
        Section section = new Section();
        if (article != null){
            section.setIdSection(new Long(new java.util.Date().getTime()).toString());
            section.setTitle("this is a new section -->> " + new Random().nextInt());
            section.setFlag(true);
            section.setIdArticle(article.getIdArticle());
            section.setContents("this is a section contents -->> " + new Random().nextInt());

            if (sectionService.createNewSection(section) > 0)
                System.out.println("create section return value code; > 0");
        }else
            System.out.println("get article by id IS NULL.");

    }

    @Test
    public void testUpdateSection() throws Exception {
        List<Section> sections = sectionService.getSectionsByArticle("123456789");

        if (sections != null){
            for (Section s:sections){
                s.setTitle("update <-> " + s.getTitle());
                s.setContents("update <-> " + s.getContents());
                if (sectionService.updateSection(s) > 0)
                    System.out.println("update section return value: > 0");
            }
        }else
            System.out.println("getSectionsByArticle is NULL.");
    }

    @Test
    public void testGetSectionsByArticle() throws Exception {

        List<Section> sections = sectionService.getSectionsByArticle("123456789");
        if (sections != null)
            for (Section s:sections)
               System.out.println("get sections is:\n" + JacksonUtil.toJson(s));
        else
            System.out.println("getSectionsByArticle is NULL.");
    }

    @Test
    public void testDeleteSection() throws Exception {
        List<Section> sections = sectionService.getSectionsByArticle("123456789");

        if (sections != null){
            for (Section s:sections){
                s.setFlag(!s.isFlag());
                if (sectionService.updateSection(s) > 0)
                    System.out.println("update section return value: > 0");
            }
        }else
            System.out.println("getSectionsByArticle is NULL.");
    }
}