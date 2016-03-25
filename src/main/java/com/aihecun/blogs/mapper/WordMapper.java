package com.aihecun.blogs.mapper;

import com.aihecun.blogs.dao.base.BaseDaoMybatisPGSQLImpl;
import com.aihecun.blogs.model.Word;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by TianyuanPan on 3/24/16.
 */
public interface WordMapper extends BaseDaoMybatisPGSQLImpl.MybatisMultiDao<Word> {

    /**
     *
     * @param insertExpr
     * @return
     */
    @Insert("${insertExpr}")
    int createNewWord(@Param("insertExpr") String insertExpr);


    /**
     *
     * @param propertiesAndValues
     * @param idWord
     * @return
     */
    @Update("UPDATE tb_words SET ${propertiesAndValues} WHERE id_word=#{idWord}")
    int updateWord(@Param("propertiesAndValues") String propertiesAndValues, @Param("idWord") String idWord);


    @Select("SELECT * FROM tb_words WHERE word LIKE #{expr}")
    List<Word> findLikeWords(@Param("expr") String expr);


    @Select("SELECT * FROM tb_words WHERE word=#{word}")
    List<Word> findWords(@Param("word") String word);
}
