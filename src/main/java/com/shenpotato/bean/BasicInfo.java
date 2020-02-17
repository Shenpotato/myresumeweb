package com.shenpotato.bean;

import java.sql.Date;

/**
 * Created by Shen_potato on 2019/7/3.
 */
public class BasicInfo {

    private Integer id;
    private String personalstatement;
    private String name;
    private Date birth;
    private String address;
    private String email;
    private String phonenumber;
    private String school;
    private String photoaddr;
    private String englishlevel;
    private String hobby;

    @Override
    public String toString() {
        return "BasicInfo{" +
                "id=" + id +
                ", personalstatement='" + personalstatement + '\'' +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", school='" + school + '\'' +
                ", photoaddr='" + photoaddr + '\'' +
                ", englishlevel='" + englishlevel + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonalstatement() {
        return personalstatement;
    }

    public void setPersonalstatement(String personalstatement) {
        this.personalstatement = personalstatement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getPhotoaddr() {
        return photoaddr;
    }

    public void setPhotoaddr(String photoaddr) {
        this.photoaddr = photoaddr;
    }

    public String getEnglishlevel() {
        return englishlevel;
    }

    public void setEnglishlevel(String englishlevel) {
        this.englishlevel = englishlevel;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}