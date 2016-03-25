package com.aihecun.blogs.model;

import com.aihecun.blogs.annotations.dbmodel.FK;
import com.aihecun.blogs.annotations.dbmodel.PK;

/**
 * Created by TianyuanPan on 3/25/16.
 */


public class WordDetails {

    @PK
    private String id_details;

    @FK
    private String id_word;

    private String shortcut;

    private String details;


    public String getId_details() {
        return id_details;
    }

    public void setId_details(String id_details) {
        this.id_details = id_details;
    }

    public String getId_word() {
        return id_word;
    }

    public void setId_word(String id_word) {
        this.id_word = id_word;
    }

    public String getShortcut() {
        return shortcut;
    }

    public void setShortcut(String shortcut) {
        this.shortcut = shortcut;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
