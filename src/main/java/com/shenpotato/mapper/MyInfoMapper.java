package com.shenpotato.mapper;

import com.shenpotato.bean.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

/**
 * Created by Shen_potato on 2019/7/4.
 */
@Mapper
public interface MyInfoMapper {

    @Select("select * from basicinfo where id =1")
    public BasicInfo getBasicInfoById();

    @Select("select * from educationinfo where owner='沈铮涛'")
    public Collection<EducationInfo> getEduInfoByOwner();

    @Select("select * from awardinfo where owner='沈铮涛'")
    public Collection<AwardInfo> getAwardInfoByOwner();

    @Select("select * from developinfo where owner='沈铮涛'")
    public Collection<DevelopInfo> getDevelopInfoByOwner();

    @Select("select * from schoolinfo where owner='沈铮涛'")
    public Collection<SchoolInfo> getSchoolInfoByOwner();

}
