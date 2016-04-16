package com.aihecun.blogs.model;

import com.aihecun.blogs.annotations.dbmodel.FK;
import com.aihecun.blogs.annotations.dbmodel.PK;
import com.aihecun.blogs.annotations.dbmodel.Table;

import java.util.Date;

/**
 * Created by TianyuanPan on 3/21/16.
 */
@Table(tableName = "tb_users")
public class User {

    @PK
    private  String idUser;
    @PK
    private String userNo;
    @FK
    private String idRole;
    private String userName;
    private String password;
    private String userTitle;
    private short  sex;
    private Date birthday;
    private int bitCoins;
    private String email;
    private String address;
    private String mobile;
    private boolean  flag;
    private short countFans;
    private short countArticle;
    private short countShare;
    private short countComment;
    private short countSays;
    private Date timeCreated;
    private Date timeLastLogin;
    private Date timeUpdated;

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getIdRole() {
        return idRole;
    }

    public void setIdRole(String idRole) {
        this.idRole = idRole;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public short getSex() {
        return sex;
    }

    public void setSex(short sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getBitCoins() {
        return bitCoins;
    }

    public void setBitCoins(int bitCoins) {
        this.bitCoins = bitCoins;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public short getCountFans() {
        return countFans;
    }

    public void setCountFans(short countFans) {
        this.countFans = countFans;
    }

    public short getCountArticle() {
        return countArticle;
    }

    public void setCountArticle(short countArticle) {
        this.countArticle = countArticle;
    }

    public short getCountShare() {
        return countShare;
    }

    public void setCountShare(short countShare) {
        this.countShare = countShare;
    }

    public short getCountComment() {
        return countComment;
    }

    public void setCountComment(short countComment) {
        this.countComment = countComment;
    }

    public short getCountSays() {
        return countSays;
    }

    public void setCountSays(short countSays) {
        this.countSays = countSays;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Date getTimeLastLogin() {
        return timeLastLogin;
    }

    public void setTimeLastLogin(Date timeLastLogin) {
        this.timeLastLogin = timeLastLogin;
    }

    public Date getTimeUpdated() {
        return timeUpdated;
    }

    public void setTimeUpdated(Date timeUpdated) {
        this.timeUpdated = timeUpdated;
    }

}
