package com.shenpotato.bean;

/**
 * Created by Shen_potato on 2019/7/4.
 */
public class MyInfo {

    private Integer id;
    private BasicInfo basicInfo;
    private EducationInfo educationInfo;
    private DevelopInfo developInfo;
    private SchoolInfo schoolInfo;
    private AwardInfo awardInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BasicInfo getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public EducationInfo getEducationInfo() {
        return educationInfo;
    }

    public void setEducationInfo(EducationInfo educationInfo) {
        this.educationInfo = educationInfo;
    }

    public DevelopInfo getDevelopInfo() {
        return developInfo;
    }

    public void setDevelopInfo(DevelopInfo developInfo) {
        this.developInfo = developInfo;
    }

    public SchoolInfo getSchoolInfo() {
        return schoolInfo;
    }

    public void setSchoolInfo(SchoolInfo schoolInfo) {
        this.schoolInfo = schoolInfo;
    }

    public AwardInfo getAwardInfo() {
        return awardInfo;
    }

    public void setAwardInfo(AwardInfo awardInfo) {
        this.awardInfo = awardInfo;
    }
}
