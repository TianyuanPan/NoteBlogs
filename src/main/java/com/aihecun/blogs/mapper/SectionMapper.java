package com.aihecun.blogs.mapper;

import com.aihecun.blogs.dao.base.BaseDaoMybatisPGSQLImpl;
import com.aihecun.blogs.model.Article;
import com.aihecun.blogs.model.Section;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by TianyuanPan on 4/11/16.
 */
public interface SectionMapper extends BaseDaoMybatisPGSQLImpl.MybatisMultiDao<Section>{


    /**
     *
     * @param model
     * @return
     */
    @Insert("INSERT INTO tb_sections ( " +
            "\"idSection\", \"idArticle\", title," +
            "contents, flag ) VALUES ( " +
            "#{idSection},#{idArticle},#{title},#{contents},#{flag})")
    int createNewSection(Section model);


    /**
     *
     * @param model
     * @return
     */
    @Update("UPDATE tb_sections SET " +
            "title = #{title}, contents = #{contents}, flag = #{flag}" +
            "WHERE \"idSection\" = #{idSection}")
    int updateSection(Section model);


    /**
     *
     * @param idArticle
     * @return
     */
    @Select("SELECT * FROM tb_sections WHERE \"idArticle\" = #{idArticle}")
    List<Section> getSectionsByArticle(@Param("idArticle") String idArticle);


    /**
     *
     * @param model
     * @return
     */
    @Update("UPDATE tb_sections SET flag = false WHERE \"idSection\" = #{idSection}")
    int deleteSection(Section model);
}
