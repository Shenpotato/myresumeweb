package com.shenpotato.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

/**
 * Created by Shen_potato on 2019/8/12.
 */
@Configuration
public class MailConfiguration {

    @Bean
    public JavaMailSenderImpl JavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
        Properties javaMailProperties = new Properties();
        //邮箱的发送服务器地址
        javaMailProperties.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
        javaMailProperties.setProperty("mail.smtp.socketFactory.fallback", "false");
        javaMailProperties.setProperty("mail.smtp.socketFactory.port", "465");

        //邮箱发送服务器端口,这里设置为465端口

        mailSender.setHost("220.181.12.15");
        mailSender.setUsername("18373162770@163.com");
        mailSender.setPassword("Szt4698799770");
        mailSender.setPort(465);

        javaMailProperties.put("mail.smtp.auth", true);
        javaMailProperties.put("mail.smtp.starttls.enable", true);
//        javaMailProperties.put("mail.smtp.timeout", 5000);
        mailSender.setJavaMailProperties(javaMailProperties);
        return mailSender;
    }

}
