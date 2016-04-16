package com.aihecun.blogs.model.siteModel;

import com.aihecun.blogs.annotations.dbmodel.PK;
import com.aihecun.blogs.annotations.dbmodel.Table;

import java.util.Date;

/**
 * Created by TianyuanPan on 4/11/16.
 */

@Table(tableName = "tb_siteNavigation")
public class Navigation {

    @PK
    private String idNavigation;
    private String navigationName;
    private String url;
    private boolean flag;
    private Date timeCreated;
    private Date timeUpdated;

    public String getIdNavigation() {
        return idNavigation;
    }

    public void setIdNavigation(String idNavigation) {
        this.idNavigation = idNavigation;
    }

    public String getNavigationName() {
        return navigationName;
    }

    public void setNavigationName(String navigationName) {
        this.navigationName = navigationName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
