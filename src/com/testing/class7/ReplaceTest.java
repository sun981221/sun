package com.testing.class7;

import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;

import java.util.Scanner;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-13 14:31
 */
public class ReplaceTest {
    public static void main(String[] args) {
        String str1 = "张三老师";
        String str2 = "李四老师";
        String str3 = "will老师";
        String str4 = "test老师";
        String str5 = "acccbdddddb";

        String regular1 = "a.b";


        System.out.println(str4.matches(regular1));

        //量词
        String regular2 = "(test|will)老师";
        System.out.println(str3.matches(regular2));

        //^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\d{8}$
//        String mobileReg = "^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\\d{8}$";
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入电话号码");
//        String s = scanner.nextLine();
//        if(s.matches(mobileReg)){
//            System.out.println("输入的是一个手机号码");
//        }else {
//            System.out.println("输入的不是一个手机号码");
//        }
//        scanner.close();


        String s ="15172376250";
//        for (int i = 3; i < 8; i++) {
//            s=s.replace(String.valueOf(i),"*");
//
//        }
//        System.out.println(s);
        s=s.replaceAll("[57]","*");
        System.out.println(s);


    }

}