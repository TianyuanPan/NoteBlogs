package com.aihecun.blogs.dao.impl;

import com.aihecun.blogs.dao.FansDao;
import com.aihecun.blogs.dao.base.BaseDaoImpl;
import com.aihecun.blogs.mapper.FansMapper;
import com.aihecun.blogs.model.Fans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TianyuanPan on 4/11/16.
 */

@Repository
public class FansDaoImpl extends BaseDaoImpl<Fans> implements FansDao {

    @Autowired
    FansMapper mapper;

    @Override
    public int createNewFans(Fans model)  throws Exception {
        return mapper.createNewFans(model);
    }

    @Override
    public int deleteFans(Fans model) throws Exception {
        return mapper.deleteFans(model);
    }

    @Override
    public Fans getFansById(String idFans) throws Exception {
        return mapper.getFansById(idFans);
    }

    @Override
    public List<Fans> getFansByIdUser(String idUser) throws Exception {
        return mapper.getFansByIdUser(idUser);
    }
}
