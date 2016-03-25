package com.aihecun.blogs.service.base;

import com.aihecun.blogs.annotations.dbmodel.interpreter.Interpreter;
import com.aihecun.blogs.dao.base.BaseDao;
import com.aihecun.blogs.model.base.ModelBase;
import com.aihecun.blogs.util.AfReflecter;
import com.aihecun.blogs.util.JacksonUtil;
import com.aihecun.blogs.util.Page;
import com.aihecun.blogs.util.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Field;
import java.util.List;

import static com.aihecun.blogs.util.AfReflecter.*;

/**
 * Created by TianyuanPan on 3/22/16.
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    BaseDao<T> baseDao;

    protected Class<T> clazz;

    public BaseServiceImpl() {
        this.clazz = AfReflecter.getActualTypeArgument(this, BaseServiceImpl.class, 0);
    }

    @Override
    public int insert(T model){
        ModelBase.check(model);
        ModelBase.fillNullID(model);
        return baseDao.insert(model);
    }

    @Override
    public int update(T model) {
        T old = findById(getModelID(model));
        if (old == null) {
            throw new ServiceException("请求更新记录不存在或已经被删除！");
        }
        model = checkNullField(old, model);
        return baseDao.update(model);
    }

    @Override
    public int delete(Object id) {
        return baseDao.delete(id);
    }

    @Override
    public T findById(Object id){
        return baseDao.findById(id);
    }

    @Override
    public List<T> findAll(){
        return baseDao.findAll();
    }

    @Override
    public int delete(String id){
        return baseDao.delete(id);
    }

    @Override
    public List<T> findByPage(int limit, int start) {
        return baseDao.findByPage(limit,start);
    }

    @Override
    public T findById(String id) {
        return baseDao.findById(id);
    }

    @Override
    public Page<T> listByPage(int pageSize, int pageNo){
        int limit = pageSize;
        int start = pageNo*pageSize;
        int totalRecord = baseDao.countAll();
        int totalPage = 1+totalRecord/pageSize;

        List<T> list = baseDao.findByPage(limit, start);

        return new Page<T>(pageNo,pageSize,totalPage,totalRecord,list){};
    }

    @Override
    public int countAll() {
        return baseDao.countAll();
    }
    /**
     * 检测非空字段
     * @param old 老数据
     * @param model 新数据model
     */
    @SuppressWarnings("unchecked")
    protected T checkNullField(T old, T model) {
        try {
            Class<?> clazz = model.getClass();
            old = (T) JacksonUtil.toObject(JacksonUtil.toJson(old), clazz);
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                Object nfield = field.get(model);
                if (nfield != null) {
                    field.set(old, nfield);
                }
            }
        } catch (Exception e) {

        }
        return old;
    }
    /**
     * 获取ID字段
     * @param model 数据model
     */
    protected Object getModelID(T model) {
        Class<?> clazz = model.getClass();
        Field field = Interpreter.getPKField(clazz);
        if (field != null) {
            field.setAccessible(true);
            try {
                return field.get(model);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
