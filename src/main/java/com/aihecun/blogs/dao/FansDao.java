package com.aihecun.blogs.dao;

import com.aihecun.blogs.dao.base.BaseDao;
import com.aihecun.blogs.model.Fans;

import java.util.List;

/**
 * Created by TianyuanPan on 4/11/16.
 */

public interface FansDao extends BaseDao<Fans> {

    /**
     *
     * @param model
     * @return
     */
    int createNewFans(Fans model) throws Exception;


    /**
     *
     * @param model
     * @return
     */
    int deleteFans(Fans model) throws Exception;


    /**
     *
     * @param idFans
     * @return
     */
    Fans getFansById(String idFans) throws Exception;


    /**
     *
     * @param idUser
     * @return
     */
    List<Fans> getFansByIdUser(String idUser) throws Exception;
}
