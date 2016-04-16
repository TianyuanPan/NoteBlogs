package com.aihecun.blogs.mapper;

import com.aihecun.blogs.dao.base.BaseDaoMybatisPGSQLImpl;
import com.aihecun.blogs.model.Fans;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by TianyuanPan on 4/11/16.
 */
public interface FansMapper extends BaseDaoMybatisPGSQLImpl.MybatisMultiDao<Fans> {


    /**
     *
     * @param model
     * @return
     */
    @Insert("INSERT INTO tb_fans ( \"idFans\", \"idUser\", \"userNo\", flag, \"timeCreated\" ) " +
            "VALUES ( #{idFans}, #{idUser}, #{userNo}, #{flag}, #{timeCreated} )")
    int createNewFans(Fans model);


    /**
     *
     * @param model
     * @return
     */
    @Update("UPDATE tb_fans SET flag = false WHERE \"userNo\" = #{userNo}")
    int deleteFans(Fans model);


    /**
     *
     * @param model
     * @return
     */
    @Select("SELECT * FROM tb_fans WHERE \"idFans\" = #{idFans}")
    Fans getFansById(@Param("idFans") String idFans);


    /**
     *
     * @param idUser
     * @return
     */
    @Select("SELECT * FROM tb_fans WHERE \"idUser\" = #{idUser}")
    List<Fans> getFansByIdUser(@Param("idUser") String idUser);
}
