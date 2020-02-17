package com.shenpotato.controller;

import com.shenpotato.config.MailConfiguration;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.ServiceMode;
import java.util.Map;

/**
 * Created by Shen_potato on 2019/8/12.
 */

@Controller
public class SendEmail {

    private static String myemail ="18373162770@163.com";

    @PostMapping("/sendemail")
    public String sendcomments(@RequestParam("author")String author, @RequestParam("email")String email,
                               @RequestParam("subject")String subject, @RequestParam("comment")String comment,
                                Map<String,Object>map){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(myemail); // 发送人的邮箱
        message.setSubject(subject); //标题
        message.setTo(myemail); //发给谁  对方邮箱
        StringBuilder stringBuilder = new StringBuilder(comment);
        stringBuilder.append("发送者为 "+ email + author);
        comment = stringBuilder.toString();
        message.setText(comment); //内容
        new MailConfiguration().JavaMailSender().send(message); //发送
        map.put("msg","success");
        return "redirect:/contact.html";
    }
}
