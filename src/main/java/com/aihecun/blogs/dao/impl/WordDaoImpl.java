package com.aihecun.blogs.dao.impl;

import com.aihecun.blogs.dao.WordDao;
import com.aihecun.blogs.dao.base.BaseDao;
import com.aihecun.blogs.dao.base.BaseDaoImpl;
import com.aihecun.blogs.mapper.WordMapper;
import com.aihecun.blogs.model.Word;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TianyuanPan on 3/24/16.
 */

@Repository
public class WordDaoImpl extends BaseDaoImpl<Word> implements WordDao {

    @Autowired
    WordMapper mapper;


    /**
     *
     * @param model
     * @return
     */
    @Override
    public int createNewWord(Word model) {
        String expr = "";
        try {
            expr = model.getInsertExprString();
        }catch (Exception ex){
            ex.printStackTrace();
            return 0;
        }

        return mapper.createNewWord(expr);
    }

    /**
     *
     * @param propertiesAndValues
     * @param id_word
     * @return
     */
    @Override
    public int updateWord(String propertiesAndValues, String id_word) {

        return mapper.updateWord(propertiesAndValues, id_word);
    }

    /**
     *
     * @param expr
     * @return
     */
    @Override
    public List<Word> findLikeWords(String expr) {
        return mapper.findLikeWords(expr);
    }


    /**
     *
     * @param word
     * @return
     */
    @Override
    public List<Word> findWords(String word) {
        return mapper.findWords(word);
    }
}
