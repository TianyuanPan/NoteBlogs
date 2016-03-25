package com.aihecun.blogs.service;

import com.aihecun.blogs.model.WordDetails;

import java.util.List;

/**
 * Created by TianyuanPan on 3/25/16.
 */
public interface WordDetailsService {

    /**
     *
     * @param wordDetails
     * @return
     */
    int createNewWordDetail(WordDetails wordDetails) throws Exception;


    /**
     *
     * @param propertiesAndValues
     * @param idDetails
     * @return
     */
    int updateDetail(String propertiesAndValues, String idDetails) throws Exception;


    /**
     *
     * @param idWord
     * @return
     */
    List<WordDetails> findWordDetails(String idWord) throws  Exception;
}
