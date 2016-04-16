package com.aihecun.blogs.dao;

import com.aihecun.blogs.dao.base.BaseDao;
import com.aihecun.blogs.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by TianyuanPan on 3/22/16.
 */

public interface UserDao extends BaseDao<User> {

    /**
     * 插入一条新数据
     * @param model 添加的数据
     * @return 改变行数
     */
    int createNewUser(User model) throws  Exception;



    /**
     *
     * @param model
     * @return
     */
    int updateUser(User model) throws  Exception;


    /**
     *
     * @param userNo
     * @return
     */
    User getUserByNo(String userNo) throws  Exception;


    /**
     *
     * @param idUser
     * @return
     * @throws Exception
     */
    User getUserById(String idUser) throws Exception;

    /**
     * 用户登陆
     * @param userNo
     * @param password
     * @return
     */
    User login(String userNo, String password) throws Exception;


}
