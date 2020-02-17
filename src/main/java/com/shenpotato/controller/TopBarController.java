package com.shenpotato.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Shen_potato on 2019/7/3.
 */
@Controller
public class TopBarController {

    @RequestMapping("/contact")
    public String goContact(){
        return "contact";
    }

    @RequestMapping("/index")
    public String goIndex(){
        return "index";
    }

}
