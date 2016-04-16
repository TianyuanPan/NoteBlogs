package com.aihecun.blogs.service;

import com.aihecun.blogs.model.Article;
import com.aihecun.blogs.util.JacksonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;
import java.util.Random;


/**
 * Created by TianyuanPan on 4/10/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mvc-*.xml")
public class ArticleServiceTest {

    @Autowired
    ArticleService service;

    @Test
    public void testCreateNewArticle() throws Exception {

        Article article = new Article();

        article.setIdArticle(new Long(new java.util.Date().getTime()).toString());
        article.setTitle("title_" + new Long(new java.util.Date().getTime()).toString());
        article.setIdUser("123456");
        article.setTimeCreated(new java.util.Date());
        article.setTimeUpdated(new java.util.Date());

        System.out.println("Will create Article:\n" + JacksonUtil.toJson(article));

        if (service.createNewArticle(article) > 0)
            System.out.println("crate return value: > 0");
        else
            System.out.println("crate return value: <= 0");

    }

    @Test
    public void testUpdateArticle() throws Exception {

        List<Article> articles = service.getArticleByIdUser("123456");
        if (articles != null){
            for(Article a : articles) {
                System.out.println("get article:\n" + JacksonUtil.toJson(a));
                a.setTitle("name_" + new Integer(new Random().nextInt()).toString());
                a.setTimeUpdated(new Date());

                if ( service.updateArticle(a) > 0)
                    System.out.println("After update article:\n" + JacksonUtil.toJson(a));
                else
                    System.out.println("After update article return value: <= 0");
            }
        }

    }

    @Test
    public void testUpdateArticleFlag() throws Exception {
        List<Article> articles = service.getArticleByIdUser("123456");
        if (articles != null){
            for(Article a : articles) {
                System.out.println("get article:\n" + JacksonUtil.toJson(a));
                a.setTitle("name_" + new Integer(new Random().nextInt()).toString());
                a.setTimeUpdated(new Date());
                a.setFlagAccess(true);
                a.setFlag(true);
                a.setFlagComment(true);
                a.setFlagShare(true);

                if ( service.updateArticleFlag(a) > 0)
                    System.out.println("After update article:\n" + JacksonUtil.toJson(a));
                else
                    System.out.println("After update article return value: <= 0");
            }
        }
    }

    @Test
    public void testUpdateArticleCountComment() throws Exception {
        List<Article> articles = service.getArticleByIdUser("123456");
        if (articles != null){
            for(Article a : articles) {
                System.out.println("get article:\n" + JacksonUtil.toJson(a));
                a.setCountComment(1 + a.getCountComment());
                a.setFlagShare(false);

                if ( service.updateArticleCountComment(a) > 0)
                    System.out.println("After update article:\n" + JacksonUtil.toJson(a));
                else
                    System.out.println("After update article return value: <= 0");
            }
        }
    }

    @Test
    public void testGetArticleByIdUser() throws Exception {

        List<Article> articles = service.getArticleByIdUser("123456");

        if (articles != null){
            for(Article a : articles)
                System.out.println("get artile by title:\n" + JacksonUtil.toJson(a));
        }else
            System.out.println("get artile by idUser: null");

    }

    @Test
    public void testGetArticleByTitle() throws Exception {

       List<Article> articles = service.getArticleByTitle("title_123456");

        if (articles != null){
            for(Article a : articles)
                System.out.println("get artile by title:\n" + JacksonUtil.toJson(a));
        }else
            System.out.println("get artile by title: null");

    }

    @Test
    public void testGetArticleById() throws Exception {

        Article article = service.getArticleById("123456789");

        if (article != null)
            System.out.println("get artile by title:\n" + JacksonUtil.toJson(article));
        else
            System.out.println("get artile by title: null");
    }
}