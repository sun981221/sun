package com.testing.class6;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-12 22:05
 */
public class StringOps {
    public static void main(String[] args) {

        String s1 = new String("123");
        String s2 = "czy";


        String s3 = "我今年18岁";
        System.out.println("18岁".equals(s3)); //false
        System.out.println(s3.contains("18岁")); //true
        System.out.println(s3.length()); //6
        System.out.println(s3.charAt(2)); //年


        String s33 = s3.replace("岁", "虽然");
        System.out.println(s33);
        //replaceAll 支持正则表达式


        //左闭右开
        System.out.println(s3.substring(3)); //18岁
        System.out.println(s3.substring(3, 5)); //18


        String s4 = "ABCDefg";
        System.out.println(s4.toLowerCase()); //全部转为小写:abcdefg
        System.out.println(s4.toUpperCase()); //全部转为大写:ABCDEFG
        System.out.println(s4.toCharArray()); //返回一个字符数组:ABCDefg

        String s5 = " 今天天气真的好 ;我是不是应该出去玩;去公园玩 ";
        //分隔spilt,按指定分隔符切分为字符数组
        String[] split = s5.split(";");
        System.out.println(Arrays.toString(split)); //[今天天气真的好, 我是不是应该出去玩, 去公园玩]

        //trim去掉头尾空格
        System.out.println(s5); // 今天天气真的好 ;我是不是应该出去玩;去公园玩
        System.out.println(s5.trim()); //今天天气真的好 ;我是不是应该出去玩;去公园玩

        System.out.println(s5.indexOf('玩')); //找不到 -1;多个输出第一个



        //将"我今年20岁"变成N年后 --》"我N年后20+N岁"
        String s6 = "我今年20岁";
        //方法一:substring
        String age = s6.substring(3, 5);

        int i = Integer.parseInt(age);
        int n=10;
        System.out.println(i+n);

        System.out.println("*****************");

        //方法二:spilt

        String[] sp = s6.split("年");
        String sp2 = sp[1].split("岁")[0];
        System.out.println(sp2);


    }

}