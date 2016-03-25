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
    @Insert("INSERT INTO tb_users (id_user, user_number, user_name, password, created, flag) VALUES (#{idUser}, #{userNumber}, #{userName}, #{password}, #{created}, #{flag})")
    int createNewUser(User model);


    /**
     *
     * @param properties
     * @param idUser
     * @return
     */
    @Update("UPDATE  tb_users SET #{properties} WHERE id_user=#{idUser}")
    int updateUser(@Param("properties") String properties, @Param("idUser") String idUser);

    /**
     *
     * @param userNumber
     * @return
     */
    @Select("SELECT * FROM tb_users WHERE user_number=#{userNumber}")
    User getUser(@Param("userNumber") String userNumber);

    /**
     * 用户登陆
     * @param userNumber
     * @param password
     * @return
     */
    @Select("SELECT * FROM tb_users WHERE user_number=#{userNumber} AND password=#{password}")
    User login(@Param("userNumber") String userNumber,@Param("password") String password);


}
