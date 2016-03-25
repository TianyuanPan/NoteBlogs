package com.aihecun.blogs.service;

import com.aihecun.blogs.dao.WordDao;
import com.aihecun.blogs.model.Word;
import com.aihecun.blogs.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by TianyuanPan on 3/24/16.
 */
public interface WordService extends BaseService<Word> {

    /**
     *
     * @param model
     * @return
     */
    int createNewWord(Word model) throws Exception;

    /**
     *
     * @param properties
     * @param id_word
     * @return
     */
    int updateWord(String properties, String id_word) throws Exception;


    /**
     *
     * @param exp
     * @return
     * @throws Exception
     */
    List<Word> findLikeWords(String exp) throws  Exception;


    /**
     *
     * @param word
     * @return
     * @throws Exception
     */
    List<Word> findWords(String word) throws Exception;
}
