package com.aihecun.blogs.model;

import com.aihecun.blogs.annotations.dbmodel.FK;
import com.aihecun.blogs.annotations.dbmodel.PK;

/**
 * Created by TianyuanPan on 3/24/16.
 */
public class Word {

    @PK
    private  String id_word;

    @FK
    private String id_user;

    private String word;

    private String phonetic;

    private String pronounce;

    private String created_date;

    private String  created_time;

    private String  update_date;

    private String  update_time;


    public void Word(){

    }

    public void Word(String word){

        this.word = word;


    }

    public String getIdWord() {
        return id_word;
    }

    public void setIdWord(String id_word) {
        this.id_word = id_word;
    }

    public String getIdUser() {
        return id_user;
    }

    public void setIdUser(String id_user) {
        this.id_user = id_user;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPhonetic() {
        return phonetic;
    }

    public void setPhonetic(String phonetic) {
        this.phonetic = phonetic;
    }

    public String getCreatedDate() {
        return created_date.toString();
    }

    public void setCreatedDate(String created_date) {
        this.created_date = created_date;
    }

    public String getCreatedTime() {
        return created_time;
    }

    public void setCreatedTime(String created_time) {
        this.created_time = created_time;
    }

    public String getUpdateDate() {
        return update_date;
    }

    public void setUpdateDate(String update_date) {
        this.update_date = update_date;
    }

    public String getUpdateTime() {
        return update_time;
    }

    public void setUpdateTime(String update_time) {
        this.update_time = update_time;
    }

    public String getPronounce() {
        return pronounce;
    }

    public void setPronounce(String pronounce) {
        this.pronounce = pronounce;
    }

    public String getInsertExprString() throws Exception {

        if (this.id_word == null || this.id_word.equals(""))
            throw new Exception("Id Word is null Exception.");

        return ("INSERT INTO tb_words (" +
                "id_word,id_user,word,phonetic," +
                "pronounce,created_date,created_time," +
                "update_date,update_time) VALUES" +
                "('" + this.id_word        + "',"
                     + "'" + this.id_user      + "',"
                     + "'" + this.word         + "',"
                     + "'" + this.phonetic     + "',"
                     + "'" + this.pronounce    + "',"
                     + "'" + this.created_date + "',"
                     + "'" + this.created_time + "',"
                     + "'" + this.update_date  + "',"
                     + "'" + this.update_time + "')"
                );
    }


}
