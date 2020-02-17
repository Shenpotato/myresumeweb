package com.shenpotato.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by Shen_potato on 2019/8/9.
 */

@Controller
public class DownLoadFunction {

    @GetMapping("/download")
    public void downloadResume(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        String fileName = "个人简历_沈铮涛.pdf";
        if (fileName != null) {
            //设置文件路径
//            String filepath = "E:/工作/简历投递/";
            String filepath = "C:/Users/Administrator/Desktop/Shenpotato";
            File file = new File(filepath, fileName);
            if (file.exists()) {
                httpServletResponse.setContentType("application/force-download");// 设置强制下载不打开
                httpServletResponse.addHeader("Content-Disposition", "attachment;fileName=" + fileName);// 设置文件名
                byte[] buffer = new byte[1024];
                FileInputStream fis = null;
                BufferedInputStream bis = null;
                try {
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    OutputStream os = httpServletResponse.getOutputStream();
                    int i = bis.read(buffer);
                    while (i != -1) {
                        os.write(buffer, 0, i);
                        i = bis.read(buffer);
                    }
                    System.out.println("success");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("failed");
                } finally {
                    if (bis != null) {
                        try {
                            bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}

