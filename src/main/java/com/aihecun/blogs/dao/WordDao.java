package com.aihecun.blogs.dao;

import com.aihecun.blogs.dao.base.BaseDao;
import com.aihecun.blogs.model.Word;

import java.util.List;

/**
 * Created by TianyuanPan on 3/24/16.
 */
public interface WordDao extends BaseDao<Word> {


    /**
     *
     * @param model
     * @return
     */
    int createNewWord(Word model);

    /**
     *
     * @param properties
     * @param id_word
     * @return
     */
    int updateWord(String properties, String id_word);


    /**
     *
     * @param expr
     * @return
     */
    List<Word> findLikeWords(String expr);


    /**
     *
     * @param word
     * @return
     */
    List<Word> findWords(String word);


}
