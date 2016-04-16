package com.aihecun.blogs.service;

import com.aihecun.blogs.model.User;
import com.aihecun.blogs.service.base.BaseService;
import org.apache.ibatis.annotations.Param;

/**
 * Created by TianyuanPan on 3/22/16.
 */
public interface UserService extends BaseService<User> {

    /**
     * 用户登陆
     * @param userNo
     * @param password
     * @return
     */
    User login(String userNo ,String password) throws Exception;


    /**
     *
     * @param model
     * @return
     * @throws Exception
     */
    int createNewUser(User model) throws Exception;


    /**
     *
     * @param model
     * @return
     * @throws Exception
     */
    int updateUser(User model) throws Exception;


    /**
     *
     * @param userNo
     * @return
     * @throws Exception
     */
    User getUserByNo(String userNo) throws Exception;


    /**
     *
     * @param idUser
     * @return
     * @throws Exception
     */
    User getUserById(String idUser) throws Exception;



}
