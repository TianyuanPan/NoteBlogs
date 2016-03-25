package com.aihecun.blogs.dao;

import com.aihecun.blogs.model.WordDetails;

import java.util.List;

/**
 * Created by TianyuanPan on 3/25/16.
 */
public interface WordDetailsDao {

    /**
     *
     * @param wordDetails
     * @return
     */
    int createNewWordDetail(WordDetails wordDetails);


    /**
     *
     * @param propertiesAndValues
     * @param idDetails
     * @return
     */
    int updateDetail(String propertiesAndValues, String idDetails);


    /**
     *
     * @param idWord
     * @return
     */
    List<WordDetails> findWordDetails(String idWord);
}
