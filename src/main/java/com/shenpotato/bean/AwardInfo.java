package com.shenpotato.bean;

import java.sql.Date;

/**
 * Created by Shen_potato on 2019/7/4.
 */
public class AwardInfo {

    private Integer id;
    private Date date;
    private String awardname;
    private String awardlevel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAwardname() {
        return awardname;
    }

    public void setAwardname(String awardname) {
        this.awardname = awardname;
    }

    public String getAwardlevel() {
        return awardlevel;
    }

    public void setAwardlevel(String awardlevel) {
        this.awardlevel = awardlevel;
    }

}
