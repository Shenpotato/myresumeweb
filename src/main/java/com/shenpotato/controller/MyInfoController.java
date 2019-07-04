package com.shenpotato.controller;

import com.shenpotato.bean.BasicInfo;
import com.shenpotato.mapper.BasicInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.jws.WebParam;

/**
 * Created by Shen_potato on 2019/7/2.
 */
@Controller
public class MyInfoController {

    @Autowired
    BasicInfoMapper basicInfoMapper;

    @GetMapping("/index")
    public String GetBasicInfoById(Model model){

        BasicInfo basicInfo = basicInfoMapper.getBasicInfoById();

        model.addAttribute("basicinfo",basicInfo);
        System.out.println(basicInfo);

        return "index";
    }

}
