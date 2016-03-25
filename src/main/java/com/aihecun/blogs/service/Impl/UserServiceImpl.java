package com.aihecun.blogs.service.Impl;

import com.aihecun.blogs.dao.UserDao;
import com.aihecun.blogs.model.User;
import com.aihecun.blogs.service.UserService;
import com.aihecun.blogs.service.base.BaseService;
import com.aihecun.blogs.service.base.BaseServiceImpl;
import com.aihecun.blogs.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TianyuanPan on 3/22/16.
 */


@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {


    @Autowired
    UserDao dao;


    @Override
    public User login(String userNumber, String password) throws Exception {
        return dao.login(userNumber, password);
    }

    @Override
    public int delete(Object id) {
        return dao.delete(id);
    }

    @Override
    public int insert(User model) {
        return dao.insert(model);
    }

    @Override
    public int update(User model) {
        return dao.update(model);
    }


}
