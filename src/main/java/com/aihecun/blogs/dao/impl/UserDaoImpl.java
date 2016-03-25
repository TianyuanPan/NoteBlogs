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
    public int updateUser(String properties, String idUser) {
        return mapper.updateUser(properties, idUser);
    }

    @Override
    public User getUser(String userNumber) {
        return mapper.getUser(userNumber);
    }

    @Override
    public User login(String userNumber, String password) throws Exception {
        return mapper.login(userNumber, password);
    }


}
