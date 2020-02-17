package com.shenpotato.bean;

import java.sql.Date;
import java.util.List;

/**
 * Created by Shen_potato on 2019/7/4.
 */
public class DevelopInfo {

    private Integer id;
    private Date startdate;
    private Date enddate;
    private String projectname;
    private String projectContents;
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

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getProjectContents() {
        return projectContents;
    }

    public void setProjectContents(String projectContents) {
        this.projectContents = projectContents;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "DevelopInfo{" +
                "id=" + id +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                ", projectname='" + projectname + '\'' +
                ", projectContents='" + projectContents + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
