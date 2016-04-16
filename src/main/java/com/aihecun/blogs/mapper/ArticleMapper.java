package com.aihecun.blogs.mapper;

import com.aihecun.blogs.dao.base.BaseDaoMybatisPGSQLImpl;
import com.aihecun.blogs.model.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by TianyuanPan on 4/10/16.
 */
public interface ArticleMapper extends BaseDaoMybatisPGSQLImpl.MybatisMultiDao<Article>{

    /**
     *
     * @param model
     * @return
     */
    @Insert("INSERT INTO tb_articles ( " +
            "\"idArticle\", \"idUser\", title," +
            "\"countComment\", \"flagShare\"," +
            "\"flagComment\", \"flagAccess\"," +
            "flag, \"timeCreated\", \"timeUpdated\" ) VALUES (" +
            "#{idArticle}, #{idUser}, #{title}, #{countComment}," +
            "#{flagShare}, #{flagComment}, #{flagAccess}," +
            "#{flag}, #{timeCreated}, #{timeUpdated})")
    int createNewArticle(Article model);

    /**
     *
     * @param model
     * @return
     */
    @Update("UPDATE  tb_articles SET " +
            "title = #{title},\"countComment\" = #{countComment}," +
            "\"flagShare\" = #{flagShare}, \"flagComment\" = #{flagComment}," +
            "\"flagAccess\" = #{flagAccess}," +
            "flag = #{flag}, \"timeUpdated\" =  #{timeUpdated}" +
            "WHERE \"idArticle\" =#{idArticle}")
    int updateArticle(Article model);


    /**
     *
     * @param model
     * @return
     */
    @Update("UPDATE  tb_articles SET " +
            "\"flagShare\" = #{flagShare}, \"flagComment\" = #{flagComment}," +
            "\"flagAccess\" = #{flagAccess}," +
            "flag = #{flag}, \"timeUpdated\" =  #{timeUpdated}" +
            "WHERE \"idArticle\" =#{idArticle}")
    int updateArticleFlag(Article model);


    /**
     *
     * @param model
     * @return
     */
    @Update("UPDATE  tb_articles SET " +
            "\"countComment\" = #{countComment}" +
            "WHERE \"idArticle\" = #{idArticle}")
    int updateArticleCountComment(Article model);


    /**
     *
     * @param title
     * @return
     */
    @Select("SELECT * FROM tb_articles WHERE title = #{title}")
    List<Article> getArticleByTitle(@Param("title") String title);


    /**
     *
     * @param idUser
     * @return
     */
    @Select("SELECT * FROM tb_articles WHERE \"idUser\" = #{idUser}")
    List<Article> getArticleByIdUser(@Param("idUser") String idUser);


    /**
     *
     * @param idArticle
     * @return
     */
    @Select("SELECT * FROM tb_articles WHERE \"idArticle\" = #{idArticle}")
    Article getArticleById(@Param("idArticle") String idArticle);


    /**
     *
     * @param expr
     * @return
     */
    @Select("SELECT * FROM tb_articles WHERE ${expr}")
    List<Article> getArticleByWhere(@Param("expr") String expr);

}


