package com.aihecun.blogs.service;

import com.aihecun.blogs.model.Section;
import com.aihecun.blogs.service.base.BaseService;

import java.util.List;

/**
 * Created by TianyuanPan on 4/11/16.
 */
public interface SectionService extends BaseService<Section> {

    /**
     *
     * @param model
     * @return
     */
    int createNewSection(Section model) throws  Exception;


    /**
     *
     * @param model
     * @return
     */
    int updateSection(Section model) throws  Exception;


    /**
     *
     * @param idArticle
     * @return
     */
    List<Section> getSectionsByArticle(String idArticle) throws  Exception;


    /**
     *
     * @param model
     * @return
     */
    int deleteSection(Section model) throws  Exception;
}
