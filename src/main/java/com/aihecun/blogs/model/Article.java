package com.aihecun.blogs.model;

import com.aihecun.blogs.annotations.dbmodel.FK;
import com.aihecun.blogs.annotations.dbmodel.PK;
import com.aihecun.blogs.annotations.dbmodel.Table;

import java.util.Date;

/**
 * Created by TianyuanPan on 4/10/16.
 */
@Table(tableName = "tb_articles")
public class Article {

    @PK
    private String idArticle;
    @FK
    private String idUser;
    private String title;
    private int countComment;
    private boolean flagShare;
    private boolean flagComment;
    private boolean flagAccess;
    private boolean flag;
    private Date timeCreated;
    private Date timeUpdated;


    public String getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(String idArticle) {
        this.idArticle = idArticle;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCountComment() {
        return countComment;
    }

    public void setCountComment(int countComment) {
        this.countComment = countComment;
    }

    public boolean isFlagShare() {
        return flagShare;
    }

    public void setFlagShare(boolean flagShare) {
        this.flagShare = flagShare;
    }

    public boolean isFlagComment() {
        return flagComment;
    }

    public void setFlagComment(boolean flagComment) {
        this.flagComment = flagComment;
    }

    public boolean isFlagAccess() {
        return flagAccess;
    }

    public void setFlagAccess(boolean flagAccess) {
        this.flagAccess = flagAccess;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Date getTimeUpdated() {
        return timeUpdated;
    }

    public void setTimeUpdated(Date timeUpdated) {
        this.timeUpdated = timeUpdated;
    }
}
