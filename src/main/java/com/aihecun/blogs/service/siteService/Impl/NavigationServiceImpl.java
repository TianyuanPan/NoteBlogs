package com.aihecun.blogs.service.siteService.Impl;

import com.aihecun.blogs.service.base.BaseServiceImpl;
import com.aihecun.blogs.dao.siteDao.NavigationDao;
import com.aihecun.blogs.model.siteModel.Navigation;
import com.aihecun.blogs.service.siteService.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TianyuanPan on 4/11/16.
 */

@Service
public class NavigationServiceImpl extends BaseServiceImpl<Navigation> implements NavigationService {


    @Autowired
    NavigationDao dao;

    @Override
    public int addNewNavigation(Navigation model) throws Exception {
        return dao.addNewNavigation(model);
    }

    @Override
    public int updateNavigation(Navigation model) throws Exception {
        return dao.updateNavigation(model);
    }

    @Override
    public int deleteNavigationByName(String name) throws Exception {
        return dao.deleteNavigationByName(name);
    }

    @Override
    public List<Navigation> getAllNavigation() throws Exception {
        return dao.getAllNavigation();
    }

    @Override
    public Navigation getNavigationByName(String name) throws Exception {
        return dao.getNavigationByName(name);
    }
}
