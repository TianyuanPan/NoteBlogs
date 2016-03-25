package com.aihecun.blogs.dao.base;

/**
 * Created by TianyuanPan on 3/21/16.
 */

import java.util.List;

/**
 * 多功能Dao层接口
 * @param <T>
 * @author yp
 * @date 2016-01-15 10:46:18 中国标准时间
 */
public interface MultiDao<T> extends BaseDao<T>{
    /**
     * 选择性删除
     * @param where
     * @return
     * @throws Exception
     */
    public int deleteWhere(String where);
    /**
     * 根据属性值删除
     * @param propertyName
     * @param value
     * @return
     * @throws Exception
     */
    public int deleteByPropertyName(String propertyName,Object value) throws Exception;
    /**
     * 选择性统计
     * @param where
     * @return
     * @throws Exception
     */
    public int countWhere(String where);
    /**
     * 根据属性统计
     * @param propertyName
     * @param value
     * @return
     * @throws Exception
     */
    public int countByPropertyName(String propertyName,Object value) throws Exception;
    /**
     * 选择性查询
     * @param where
     * @return
     * @throws Exception
     */
    public List<T> findWhere( String where);
    /**
     * 选择性分页查询
     * @param where
     * @param limit
     * @param start
     * @return
     * @throws Exception
     */
    public List<T> findWhereByPage(String where, int limit,int start) throws Exception;
    /**
     * 根据属性查询
     * @param propertyName
     * @param value
     * @return
     * @throws Exception
     */
    public List<T> findByPropertyName(String propertyName,Object value) throws Exception;

}