package com.aihecun.blogs.model;

import com.aihecun.blogs.annotations.dbmodel.FK;
import com.aihecun.blogs.annotations.dbmodel.PK;
import com.aihecun.blogs.annotations.dbmodel.Table;

/**
 * Created by TianyuanPan on 4/11/16.
 */

@Table(tableName = "tb_sections")
public class Section {

    @PK
    private String idSection;
    @FK
    private String idArticle;
    private String title;
    private String contents;
    private boolean flag;

    public String getIdSection() {
        return idSection;
    }

    public void setIdSection(String idSection) {
        this.idSection = idSection;
    }

    public String getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(String idArticle) {
        this.idArticle = idArticle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
