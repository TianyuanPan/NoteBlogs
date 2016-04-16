package com.aihecun.blogs.service.siteService;

import com.aihecun.blogs.service.base.BaseService;
import com.aihecun.blogs.model.siteModel.Navigation;

import java.util.List;

/**
 * Created by TianyuanPan on 4/11/16.
 */


public interface NavigationService extends BaseService<Navigation> {

    /**
     *
     * @param model
     * @return
     * @throws Exception
     */
    int addNewNavigation(Navigation model) throws Exception;

    /**
     *
     * @param model
     * @return
     * @throws Exception
     */
    int updateNavigation(Navigation model) throws Exception;

    /**
     *
     * @param name
     * @return
     * @throws Exception
     */
    int deleteNavigationByName(String name) throws Exception;

    /**
     *
     * @return
     * @throws Exception
     */
    List<Navigation> getAllNavigation() throws Exception;


    /**
     *
     * @param name
     * @return
     */
    Navigation getNavigationByName(String name) throws Exception;
}
