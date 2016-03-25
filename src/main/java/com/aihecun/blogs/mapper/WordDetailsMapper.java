package com.aihecun.blogs.mapper;

import com.aihecun.blogs.dao.base.BaseDaoMybatisPGSQLImpl;
import com.aihecun.blogs.model.WordDetails;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by TianyuanPan on 3/25/16.
 */
public interface WordDetailsMapper extends BaseDaoMybatisPGSQLImpl.MybatisMultiDao<WordDetails> {

    /**
     *
     * @param wordDetails
     * @return
     */
    @Insert("INSERT INTO tb_words_details (" +
            "id_details,id_word,shortcut,details" +
            ") VALUES (" +
            "#{id_details},#{id_word},#{shortcut}," +
            "#{details}" +
            ")")
    int createNewWordDetail(WordDetails wordDetails);

    /**
     *
     * @param propertiesAndValues
     * @param idDetails
     * @return
     */
    @Update("UPDATE tb_words_details SET ${propertiesAndValues} WHERE id_details=#{idDetails}")
    int updateDetail(@Param("propertiesAndValues") String propertiesAndValues, @Param("idDetails") String idDetails);


    /**
     *
     * @param idWord
     * @return
     */
    @Select("SELECT * FROM tb_words_details WHERE id_word=#{idWord}")
    List<WordDetails>  findWordDetails(@Param("idWord") String idWord);
}
