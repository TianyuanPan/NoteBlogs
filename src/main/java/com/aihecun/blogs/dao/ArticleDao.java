package com.aihecun.blogs.dao;

import com.aihecun.blogs.dao.base.BaseDao;
import com.aihecun.blogs.model.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by TianyuanPan on 4/10/16.
 */
public interface ArticleDao extends BaseDao<Article> {

    /**
     *
     * @param model
     * @return
     */
    int createNewArticle(Article model) throws  Exception;

    /**
     *
     * @param model
     * @return
     */
    int updateArticle(Article model) throws  Exception;


    /**
     *
     * @param model
     * @return
     */
    int updateArticleFlag(Article model) throws  Exception;


    /**
     *
     * @param model
     * @return
     */
    int updateArticleCountComment(Article model) throws  Exception;


    /**
     *
     * @param title
     * @return
     */
    List<Article> getArticleByTitle(String title) throws  Exception;


    /**
     *
     * @param idUser
     * @return
     */
    List<Article> getArticleByIdUser(String idUser) throws Exception;


    Article getArticleById(String idArticle) throws  Exception;


    List<Article> getArticleByWhere(String expr) throws Exception;

}
