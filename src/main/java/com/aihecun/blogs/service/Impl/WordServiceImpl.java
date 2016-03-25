package com.aihecun.blogs.service.Impl;

import com.aihecun.blogs.dao.WordDao;
import com.aihecun.blogs.model.Word;
import com.aihecun.blogs.service.WordService;
import com.aihecun.blogs.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TianyuanPan on 3/24/16.
 */


@Service
public class WordServiceImpl extends BaseServiceImpl<Word> implements WordService {

    @Autowired
    WordDao dao;


    /**
     *
     * @param model
     * @return
     */
    @Override
    public int createNewWord(Word model) {

        return dao.createNewWord(model);
    }

    /**
     *
     * @param properties
     * @param id_word
     * @return
     */
    @Override
    public int updateWord(String properties, String id_word) {

        return dao.updateWord(properties, id_word);
    }

    /**
     *
     * @param exp
     * @return
     * @throws Exception
     */
    @Override
    public List<Word> findLikeWords(String exp) throws Exception {

        return dao.findLikeWords(exp);
    }


    /**
     *
     * @param word
     * @return
     * @throws Exception
     */
    @Override
    public List<Word> findWords(String word) throws Exception {

        return dao.findWords(word);
    }


}
