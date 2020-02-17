package com.shenpotato.bean;

import java.sql.Date;
import java.util.List;

/**
 * Created by Shen_potato on 2019/7/4.
 */
public class SchoolInfo {

    private Integer id;
    private Date startdate;
    private Date enddate;
    private String orginazationname;
    private String position;
    private String activitycontents;
    private String owner;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getOrginazationname() {
        return orginazationname;
    }

    public void setOrginazationname(String orginazationname) {
        this.orginazationname = orginazationname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getActivitycontents() {
        return activitycontents;
    }

    public void setActivitycontents(String activitycontents) {
        this.activitycontents = activitycontents;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "SchoolInfo{" +
                "id=" + id +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                ", orginazationname='" + orginazationname + '\'' +
                ", position='" + position + '\'' +
                ", activitycontents='" + activitycontents + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
