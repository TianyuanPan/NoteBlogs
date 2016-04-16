package com.aihecun.blogs.dao;

import com.aihecun.blogs.model.Section;

import java.util.List;

/**
 * Created by TianyuanPan on 4/11/16.
 */
public interface SectionDao {

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
