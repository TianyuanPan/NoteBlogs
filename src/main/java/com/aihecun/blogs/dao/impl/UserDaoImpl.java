package com.aihecun.blogs.dao.impl;

import com.aihecun.blogs.dao.UserDao;
import com.aihecun.blogs.dao.base.BaseDaoImpl;
import com.aihecun.blogs.mapper.UserMapper;
import com.aihecun.blogs.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



/**
 * Created by TianyuanPan on 3/22/16.
 */


@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

    @Autowired
    UserMapper mapper;


    @Override
    public int createNewUser(User model) {
        return mapper.createNewUser(model);
    }


    @Override
    public int updateUser(User model) {
        return mapper.updateUser(model);
    }

    @Override
    public User getUserByNo(String userNo) {
        return mapper.getUserByNo(userNo);
    }

    @Override
    public User getUserById(String idUser) throws Exception {

        return mapper.getUserById(idUser);
    }


    @Override
    public User login(String userNo, String password) throws Exception {
        return mapper.login(userNo, password);
    }


}
