package com.aihecun.blogs.model;

import com.aihecun.blogs.annotations.dbmodel.FK;
import com.aihecun.blogs.annotations.dbmodel.PK;
import com.aihecun.blogs.annotations.dbmodel.Table;

/**
 * Created by TianyuanPan on 3/21/16.
 */
@Table(tableName = "tb_users")
public class User {

    @PK
    private  String id_user;

    @PK
    private String user_number;

    @FK
    private String id_role;

    private String user_name;
    private String password;
    private String user_title;
    private String birthday;
    private String created_date;
    private String created_time;
    private String last_login_date;
    private String last_login_time;
    private String update_date;
    private String update_time;
    private String email;
    private String mobile;
    private String address;
    private int bit_coins;
    private short    sex;
    private short count_fans;
    private short count_article;
    private short count_share;
    private short count_comment;
    private short count_says;
    private short  flag;


    public void User(){

    }


    public String getIdUser() {
        return id_user;
    }

    public void setIdUser(String id_user) {
        this.id_user = id_user;
    }

    public String getUserNumber() {
        return user_number;
    }

    public void setUserNumber(String user_number) {
        this.user_number = user_number;
    }

    public String getIdRole() {
        return id_role;
    }

    public void setIdRole(String id_role) {
        this.id_role = id_role;
    }

    public String getUserName() {
        return user_name;
    }

    public void setUserName(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserTitle() {
        return user_title;
    }

    public void setUserTitle(String user_title) {
        this.user_title = user_title;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBitCoins() {
        return bit_coins;
    }

    public void setBitCoins(int bit_coins) {
        this.bit_coins = bit_coins;
    }

    public short getSex() {
        return sex;
    }

    public void setSex(short sex) {
        this.sex = sex;
    }

    public short getCountFans() {
        return count_fans;
    }

    public void setCountFans(short count_fans) {
        this.count_fans = count_fans;
    }

    public short getCountArticle() {
        return count_article;
    }

    public void setCountArticle(short count_article) {
        this.count_article = count_article;
    }

    public short getCountShare() {
        return count_share;
    }

    public void setCountShare(short count_share) {
        this.count_share = count_share;
    }

    public short getCountComment() {
        return count_comment;
    }

    public void setCountComment(short count_comment) {
        this.count_comment = count_comment;
    }

    public short getCountSays() {
        return count_says;
    }

    public void setCountSays(short count_says) {
        this.count_says = count_says;
    }

    public short getFlag() {
        return flag;
    }

    public void setFlag(short flag) {
        this.flag = flag;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLastLoginDate() {
        return last_login_date;
    }

    public void setLastLoginDate(String last_login_date) {
        this.last_login_date = last_login_date;
    }

    public String getLastLoginTime() {
        return last_login_time;
    }

    public void setLastLoginTime(String last_login_time) {
        this.last_login_time = last_login_time;
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

    public String getCreatedDate() {
        return created_date;
    }

    public void setCreatedDate(String created_date) {
        this.created_date = created_date;
    }

    public void setCreatedTime(String created_time) {
        this.created_time = created_time;
    }

    public String getCreatedTime() {
        return created_time;
    }
}
