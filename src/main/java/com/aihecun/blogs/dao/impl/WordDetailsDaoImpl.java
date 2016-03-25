package com.aihecun.blogs.dao.impl;

import com.aihecun.blogs.dao.WordDetailsDao;
import com.aihecun.blogs.dao.base.BaseDao;
import com.aihecun.blogs.dao.base.BaseDaoImpl;
import com.aihecun.blogs.mapper.WordDetailsMapper;
import com.aihecun.blogs.model.WordDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TianyuanPan on 3/25/16.
 */

@Repository
public class WordDetailsDaoImpl extends BaseDaoImpl<WordDetails> implements WordDetailsDao {


    @Autowired
    WordDetailsMapper mapper;

    /**
     *
     * @param wordDetails
     * @return
     */
    @Override
    public int createNewWordDetail(WordDetails wordDetails) {
        return mapper.createNewWordDetail(wordDetails);
    }


    /**
     *
     * @param propertiesAndValues
     * @param idDetails
     * @return
     */
    @Override
    public int updateDetail(String propertiesAndValues, String idDetails) {
        return mapper.updateDetail(propertiesAndValues, idDetails);
    }


    /**
     *
     * @param idWord
     * @return
     */
    @Override
    public List<WordDetails> findWordDetails(String idWord) {
        return mapper.findWordDetails(idWord);
    }
}
