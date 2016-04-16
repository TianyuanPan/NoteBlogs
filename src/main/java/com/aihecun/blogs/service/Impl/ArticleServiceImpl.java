package com.aihecun.blogs.service.Impl;

import com.aihecun.blogs.dao.ArticleDao;
import com.aihecun.blogs.model.Article;
import com.aihecun.blogs.service.ArticleService;
import com.aihecun.blogs.service.base.BaseServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TianyuanPan on 4/10/16.
 */

@Service
public class ArticleServiceImpl extends BaseServiceImpl<Article> implements ArticleService {

    @Autowired
    ArticleDao  dao;

    @Override
    public int createNewArticle(Article model) throws Exception  {
        return dao.createNewArticle(model);
    }

    @Override
    public int updateArticle(Article model) throws Exception  {
        return dao.updateArticle(model);
    }

    @Override
    public int updateArticleFlag(Article model) throws Exception  {
        return dao.updateArticleFlag(model);
    }

    @Override
    public int updateArticleCountComment(Article model) throws Exception  {
        return dao.updateArticleCountComment(model);
    }

    @Override
    public List<Article> getArticleByTitle(@Param("title") String title) throws Exception {
        return dao.getArticleByTitle(title);
    }

    @Override
    public List<Article> getArticleByIdUser(@Param("idUser") String idUser) throws Exception {
        return dao.getArticleByIdUser(idUser);
    }

    @Override
    public Article getArticleById(String idArticle) throws Exception {
        return dao.getArticleById(idArticle);
    }

    @Override
    public List<Article> getArticleByWhere(String expr) throws Exception {
        return dao.getArticleByWhere(expr);
    }
}
