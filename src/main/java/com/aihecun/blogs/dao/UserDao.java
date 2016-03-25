package com.aihecun.blogs.dao;

import com.aihecun.blogs.dao.base.BaseDao;
import com.aihecun.blogs.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TianyuanPan on 3/22/16.
 */

@Repository
public interface UserDao extends BaseDao<User> {

    /**
     * 插入一条新数据
     * @param model 添加的数据
     * @return 改变行数
     */
    int createNewUser(User model);



    /**
     *
     * @param properties
     * @param idUser
     * @return
     */
    int updateUser(String properties, String idUser);


    /**
     *
     * @param userNumber
     * @return
     */
    User getUser(String userNumber);


    /**
     * 用户登陆
     * @param userNumber
     * @param password
     * @return
     */
    User login(String userNumber ,String password) throws Exception;


}
