package com.aihecun.blogs.service.base;

import com.aihecun.blogs.dao.base.BaseDao;
import com.aihecun.blogs.util.Page;

/**
 * Created by TianyuanPan on 3/22/16.
 */
public interface BaseService<T> extends BaseDao<T> {
    int delete(String id);
    T findById(String id);
    Page<T> listByPage(int pageSize, int pageNo);
}
