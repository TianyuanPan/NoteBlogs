package com.aihecun.blogs.mapper;

import com.aihecun.blogs.dao.base.BaseDaoMybatisPGSQLImpl;
import com.aihecun.blogs.dao.base.MultiDao;
import com.aihecun.blogs.model.User;
import org.apache.ibatis.annotations.*;

/**
 * Created by TianyuanPan on 3/22/16.
 */
public interface UserMapper extends BaseDaoMybatisPGSQLImpl.MybatisMultiDao<User> {

    /**
     * insert a record,user in create a new user case.
     * @param model
     * @return active lines
     */
    @Insert("INSERT INTO tb_users (" +
            "\"idUser\", \"userNo\", \"idRole\", \"userName\", password, \"userTitle\"," +
            "sex, birthday, \"bitCoins\", email, address, mobile, flag," +
            "\"countFans\", \"countArticle\", \"countShare\", \"countComment\", \"countSays\"," +
            "\"timeCreated\", \"timeLastLogin\", \"timeUpdated\") " +
            "VALUES (#{idUser}, #{userNo}, #{idRole}, #{userName}, #{password}," +
            "#{userTitle}, #{sex}, #{birthday}, #{bitCoins}, #{email}, #{address}," +
            "#{mobile}, #{flag}, #{countFans}, #{countArticle}, #{countShare}," +
            "#{countComment}, #{countSays}, #{timeCreated}, #{timeLastLogin}," +
            "#{timeUpdated})")
    int createNewUser(User model);


    /**
     *
     * @param model
     * @return
     */
    @Update("UPDATE tb_users SET" +
            "\"idRole\" = #{idRole}, \"userName\" = #{userName}, password = #{password}," +
            "\"userTitle\" = #{userTitle}, sex = #{sex}, birthday = #{birthday}," +
            "\"bitCoins\" = #{bitCoins}, email = #{email}, address = #{address}," +
            "mobile = #{mobile}, flag = #{flag}, \"countFans\" = #{countFans}," +
            "\"countArticle\" = #{countArticle}, \"countShare\" = #{countShare}," +
            "\"countComment\" = #{countComment}, \"countSays\" = #{countSays}," +
            "\"timeCreated\" = #{timeCreated}, \"timeLastLogin\" = #{timeLastLogin}," +
            "\"timeUpdated\" = #{timeUpdated} WHERE \"idUser\" = #{idUser}")
    int updateUser(User model);


    /**
     *
     * @param userNo
     * @return
     */
    @Select("SELECT * FROM tb_users WHERE \"userNo\"=#{userNo}")
    User getUserByNo(@Param("userNo") String userNo);


    /**
     *
     * @param idUser
     * @return
     */
    @Select("SELECT * FROM tb_users WHERE \"idUser\"=#{idUser}")
    User getUserById(@Param("idUser") String idUser);


    /**
     *
     * @param userNo
     * @param password
     * @return
     */
    @Select("SELECT * FROM tb_users WHERE \"userNo\"=#{userNo} AND password=#{password}")
    User login(@Param("userNo") String userNo,@Param("password") String password);


}


