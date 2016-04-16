package com.aihecun.blogs.dao.impl;

import com.aihecun.blogs.dao.ArticleDao;
import com.aihecun.blogs.dao.base.BaseDao;
import com.aihecun.blogs.dao.base.BaseDaoImpl;
import com.aihecun.blogs.mapper.ArticleMapper;
import com.aihecun.blogs.model.Article;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TianyuanPan on 4/10/16.
 */

@Repository
public class ArticleDaoImpl extends BaseDaoImpl<Article> implements ArticleDao {

    @Autowired
    ArticleMapper   mapper;

    @Override
    public int createNewArticle(Article model) throws Exception  {
        return mapper.createNewArticle(model);
    }

    @Override
    public int updateArticle(Article model) throws Exception  {
        return mapper.updateArticle(model);
    }

    @Override
    public int updateArticleFlag(Article model) throws Exception  {
        return mapper.updateArticleFlag(model);
    }

    @Override
    public int updateArticleCountComment(Article model) throws Exception  {
        return mapper.updateArticleCountComment(model);
    }

    @Override
    public List<Article> getArticleByTitle(@Param("title") String title) throws Exception {
        return mapper.getArticleByTitle(title);
    }

    @Override
    public List<Article> getArticleByIdUser(@Param("idUser") String idUser) throws Exception {
        return mapper.getArticleByIdUser(idUser);
    }

    @Override
    public Article getArticleById(@Param("idArticle") String idArticle) throws Exception {
        return mapper.getArticleById(idArticle);
    }

    @Override
    public List<Article> getArticleByWhere(String expr) throws Exception {
        return mapper.getArticleByWhere(expr);
    }


}
