package com.aihecun.blogs.controller.flowController;

import com.aihecun.blogs.model.Article;
import com.aihecun.blogs.model.Section;
import com.aihecun.blogs.model.User;
import com.aihecun.blogs.service.ArticleService;
import com.aihecun.blogs.service.SectionService;
import com.aihecun.blogs.service.UserService;
import com.aihecun.blogs.util.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TianyuanPan on 4/15/16.
 */

@Component
public class ArticleSectionUserR {

    private List<Article> articles;
    private User          user;
    private List<Section> sections;


    @Autowired
    private ArticleService articleService;
    @Autowired
    private UserService userService;
    @Autowired
    private SectionService sectionService;

    private List<ASURList> ASURLists;

    public void SetRelationship(String articleTableWhereExpr) throws Exception{

        this.ASURLists = new ArrayList<ASURList>();

        articles = articleService.getArticleByWhere(articleTableWhereExpr);

        if (articles != null){

            for (Article article : articles){

                user = userService.getUserById(article.getIdUser());

                sections = sectionService.getSectionsByArticle(article.getIdArticle());

                if (user != null)
                    ASURLists.add(new ASURList(user, article, sections));
                else
                    throw new ServiceException("the user null Exception");

            }
        }else
            throw new ServiceException("the articles null Exception " +
                    "by articleService.getArticleByWhere(articleTableWhereExpr)");

    }


    public List<ASURList> getASURLists(){

        return this.ASURLists;
    }


}
