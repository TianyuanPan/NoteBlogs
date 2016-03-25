package com.aihecun.blogs.service.Impl;

import com.aihecun.blogs.dao.WordDetailsDao;
import com.aihecun.blogs.model.WordDetails;
import com.aihecun.blogs.service.WordDetailsService;
import com.aihecun.blogs.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TianyuanPan on 3/25/16.
 */

@Service
public class WordDetailsServiceImpl extends BaseServiceImpl<WordDetails> implements WordDetailsService {

    @Autowired
    WordDetailsDao dao;


    /**
     *
     * @param wordDetails
     * @return
     * @throws Exception
     */
    @Override
    public int createNewWordDetail(WordDetails wordDetails) throws Exception {
        return dao.createNewWordDetail(wordDetails);
    }


    /**
     *
     * @param propertiesAndValues
     * @param idDetails
     * @return
     * @throws Exception
     */
    @Override
    public int updateDetail(String propertiesAndValues, String idDetails) throws Exception {
        return dao.updateDetail(propertiesAndValues, idDetails);
    }


    /**
     *
     * @param idWord
     * @return
     * @throws Exception
     */
    @Override
    public List<WordDetails> findWordDetails(String idWord) throws Exception {
        return dao.findWordDetails(idWord);
    }
}
