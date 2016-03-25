package com.aihecun.blogs.service;

import com.aihecun.blogs.model.User;
import com.aihecun.blogs.service.base.BaseService;

/**
 * Created by TianyuanPan on 3/22/16.
 */
public interface UserService extends BaseService<User> {

    /**
     * 用户登陆
     * @param userNumber
     * @param password
     * @return
     */
    User login(String userNumber ,String password) throws Exception;
}
