package com.shenpotato.mapper;

import com.shenpotato.bean.BasicInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Shen_potato on 2019/7/4.
 */
@Mapper
public interface BasicInfoMapper {

    @Select("select * from basicinfo where id =1")
    public BasicInfo getBasicInfoById();
}
