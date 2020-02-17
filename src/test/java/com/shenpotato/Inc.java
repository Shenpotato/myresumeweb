package com.shenpotato;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Shen_potato on 2019/8/22.
 */

public class Inc {
    private int n,k;
    private String s;
    private char[] c;
    private int[] a;


    public void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        s = sc.next();
        int len = s.length();
        c = new char[len];
        a = new int[len];
        c = s.toCharArray();

    }

    public boolean compare(char[] c, int length){
        for(int i =0;i<length;i++){
            if(c[i]!=c[c.length-length]){
                return false;
            }
        }
        return true;
    }

    public void printlove(char[] c,int length){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<k;i++){
            for(int j=0;j<c.length-length;j++){
                sb.append(c[j]);
            }
        }
        System.out.println(sb);
    }

    public void operate(){

        int length = n/2;

        for(int i = length;i>0;i++){
            if(compare(c,length) == false)
                --length;
        }
        printlove(c,length);
    }


    public static void main(String[] args) {
        Inc inc = new Inc();
        inc.init();
        inc.operate();
    }
}
