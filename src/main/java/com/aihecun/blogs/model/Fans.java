package com.aihecun.blogs.model;

import com.aihecun.blogs.annotations.dbmodel.FK;
import com.aihecun.blogs.annotations.dbmodel.PK;
import com.aihecun.blogs.annotations.dbmodel.Table;

import java.util.Date;

/**
 * Created by TianyuanPan on 4/11/16.
 */

@Table(tableName = "tb_fans")
public class Fans {

    @PK
    private String idFans;
    @FK
    private String idUser;
    @FK
    private String userNo;
    private boolean flag;
    private Date timeCreated;

    public String getIdFans() {
        return idFans;
    }

    public void setIdFans(String idFans) {
        this.idFans = idFans;
    }

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
}
