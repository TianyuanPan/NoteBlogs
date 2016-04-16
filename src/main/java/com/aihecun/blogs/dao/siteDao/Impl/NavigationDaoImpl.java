package com.aihecun.blogs.dao.siteDao.Impl;

import com.aihecun.blogs.dao.base.BaseDaoImpl;
import com.aihecun.blogs.dao.siteDao.NavigationDao;
import com.aihecun.blogs.mapper.siteMapper.NavigationMapper;
import com.aihecun.blogs.model.siteModel.Navigation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TianyuanPan on 4/11/16.
 */

@Repository
public class NavigationDaoImpl extends BaseDaoImpl<Navigation> implements NavigationDao {

    @Autowired
    NavigationMapper mapper;

    @Override
    public int addNewNavigation(Navigation model) throws Exception {
        return mapper.addNewNavigation(model);
    }

    @Override
    public int updateNavigation(Navigation model) throws Exception {
        return mapper.updateNavigation(model);
    }

    @Override
    public int deleteNavigationByName(String name) throws Exception {
        return mapper.deleteNavigationByName(name);
    }

    @Override
    public List<Navigation> getAllNavigation()  throws Exception {
        return mapper.getAllNavigation();
    }

    @Override
    public Navigation getNavigationByName(String name) throws Exception {
        return mapper.getNavigationByName(name);
    }
}
