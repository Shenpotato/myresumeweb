package com.shenpotato.Exception;

/**
 * Created by Shen_potato on 2019/8/14.
 */
public class PageNotFoundException extends Exception{
    public PageNotFoundException(String message) {
        super("找不到界面");
    }
}
