package com.shenpotato.controller;

import com.shenpotato.bean.*;
import com.shenpotato.mapper.MyInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;


/**
 * Created by Shen_potato on 2019/7/2.
 */
@Controller
public class MyInfoController {

    @Autowired
    MyInfoMapper myInfoMapper;


    //在index界面返回以下信息
    @GetMapping("/index")
    public String GetBasicInfoById(Model model){

        BasicInfo basicInfo = myInfoMapper.getBasicInfoById();
        Collection<EducationInfo> educationInfos = myInfoMapper.getEduInfoByOwner();
        Collection<DevelopInfo> developInfos = myInfoMapper.getDevelopInfoByOwner();
        Collection<SchoolInfo> schoolInfos = myInfoMapper.getSchoolInfoByOwner();
        Collection<AwardInfo> awardInfos = myInfoMapper.getAwardInfoByOwner();

        model.addAttribute("basicInfo",basicInfo);
        model.addAttribute("educationInfos",educationInfos);
        model.addAttribute("developInfos",developInfos);
        model.addAttribute("schoolInfos",schoolInfos);
        model.addAttribute("awardInfos",awardInfos);

        return "index";
    }

    @GetMapping("/contact")
    public String GetLeftSideBarInfo(Model model){
        BasicInfo basicInfo = myInfoMapper.getBasicInfoById();
        model.addAttribute("basicInfo",basicInfo);
        return "contact";
    }
}
