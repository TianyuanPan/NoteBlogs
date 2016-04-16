package com.aihecun.blogs.service.Impl;

import com.aihecun.blogs.dao.UserDao;
import com.aihecun.blogs.model.User;
import com.aihecun.blogs.service.UserService;
import com.aihecun.blogs.service.base.BaseService;
import com.aihecun.blogs.service.base.BaseServiceImpl;
import com.aihecun.blogs.util.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created by TianyuanPan on 3/22/16.
 */


@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {


    @Autowired
    UserDao dao;


    @Override
    public User login(String userNo, String password) throws Exception {
        return dao.login(userNo, password);
    }

    @Override
    public int createNewUser(User model) throws Exception {
        return dao.createNewUser(model);
    }

    @Override
    public int updateUser(User model) throws Exception {
        return dao.updateUser(model);
    }


    @Override
    public User getUserByNo(@Param("userNo") String userNo) throws Exception {
        return dao.getUserByNo(userNo);
    }

    @Override
    public User getUserById(String idUser) throws Exception {
        return dao.getUserById(idUser);
    }

}
