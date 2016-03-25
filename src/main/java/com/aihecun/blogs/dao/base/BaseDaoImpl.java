package com.aihecun.blogs.dao.base;

import com.aihecun.blogs.model.base.ModelBase;
import com.aihecun.blogs.util.AfReflecter;

import java.util.Date;

/**
 * Created by TianyuanPan on 3/21/16.
 */
public class BaseDaoImpl<T>extends BaseDaoMybatisPGSQLImpl<T> implements BaseDao<T> {

    public BaseDaoImpl() {
        //order = "ORDER BY create_time DESC";
    }

    @Override
    public int insert(T t) {
        ModelBase.fillNullID(t);
//        AfReflecter.setMemberNoException(t, "created", new Date());
//        AfReflecter.setMemberNoException(t, "last_login", new Date());
        return super.insert(t);
    }

    @Override
    public int update(T t) {
//        AfReflecter.setMemberNoException(t, "updateTime", new Date());
        return super.update(t);
    }


}
