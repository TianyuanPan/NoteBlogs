package com.aihecun.blogs.controller.flowController;

import com.aihecun.blogs.model.Article;
import com.aihecun.blogs.model.Section;
import com.aihecun.blogs.model.User;

import java.util.List;

/**
 * Created by TianyuanPan on 4/15/16.
 */
public class ASURList {

    private User user;
    private Article article;
    private List<Section> sections;

    public ASURList(User user, Article article, List<Section> sections){
        this.user = user;
        this.article = article;
        this.sections = sections;
    }

    public  User getUser(){
        return this.user;
    }

    public Article getArticle(){
        return this.article;
    }

    public List<Section> getSections(){
        return this.sections;
    }

}
