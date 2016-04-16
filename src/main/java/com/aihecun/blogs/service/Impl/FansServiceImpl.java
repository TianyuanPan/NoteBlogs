package com.aihecun.blogs.service.Impl;

import com.aihecun.blogs.dao.FansDao;
import com.aihecun.blogs.dao.base.BaseDaoImpl;
import com.aihecun.blogs.model.Fans;
import com.aihecun.blogs.service.FansService;
import com.aihecun.blogs.service.base.BaseService;
import com.aihecun.blogs.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TianyuanPan on 4/11/16.
 */

@Service
public class FansServiceImpl extends BaseServiceImpl<Fans> implements FansService {

    @Autowired
    FansDao dao;

    @Override
    public int createNewFans(Fans model) throws Exception {
        return dao.createNewFans(model);
    }

    @Override
    public int deleteFans(Fans model) throws Exception {
        return dao.deleteFans(model);
    }

    @Override
    public Fans getFansById(String idFans) throws Exception {
        return dao.getFansById(idFans);
    }

    @Override
    public List<Fans> getFansByIdUser(String idUser) throws Exception {
        return dao.getFansByIdUser(idUser);
    }
}
