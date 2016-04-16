package com.aihecun.blogs.model;

import com.aihecun.blogs.annotations.dbmodel.FK;
import com.aihecun.blogs.annotations.dbmodel.PK;
import com.aihecun.blogs.annotations.dbmodel.Table;

import java.util.Date;

/**
 * Created by TianyuanPan on 4/11/16.
 */

@Table(tableName = "tb_notes")
public class Note {

    @PK
    private String idNote;
    @FK
    private String idUser;
    private String title;
    private String contents;
    private boolean flagAccess;
    private boolean flag;
    Date timeCreated;

    public String getIdNote() {
        return idNote;
    }

    public void setIdNote(String idNote) {
        this.idNote = idNote;
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

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
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
}
