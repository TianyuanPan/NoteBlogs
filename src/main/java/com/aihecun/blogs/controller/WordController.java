package com.aihecun.blogs.controller;

import com.aihecun.blogs.annotations.Intent;
import com.aihecun.blogs.model.Word;
import com.aihecun.blogs.service.WordService;
import com.aihecun.blogs.util.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by TianyuanPan on 3/24/16.
 */
@RestController
@Intent("数据库表tb_words")
@RequestMapping("/Access")
public class WordController {


    @Autowired
    WordService service;

    @RequestMapping("findword")
    public Object  findWord(String word, HttpServletRequest request, Model model){

        List<Word> wordList;
        int lenth;
        String info = "";
       try {

//           wordList = service.findWords(word);
           wordList = service.findLikeWords("%" + word + "%");
           if (wordList != null){

               lenth = wordList.size();
               for(int i=0; i < lenth; i++) {
                   info = info + "word  id: " + wordList.get(i).getIdWord() + "<br>";
                   info = info + "user  id: " + wordList.get(i).getIdUser() + "<br>";
                   info = info + "the word: " + wordList.get(i).getWord() + "<br>";
                   info = info + "created date: " + wordList.get(i).getCreatedDate() + "<br>";
                   info = info + "created time: " + wordList.get(i).getCreatedTime() + "<br>";
                   info = info + "<br><br>";
               }

               model.addAttribute("words", info);

               return "wordlist";
           }
           throw  new ServiceException("查找出错！！！");
       }catch (Exception ex){

           model.addAttribute("err", ex.toString());

           return "errors/err";
       }

    }
}
