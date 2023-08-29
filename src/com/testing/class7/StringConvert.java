package com.testing.class7;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-13 13:34
 */
public class StringConvert {
    public static void main(String[] args) {
        convert("你好");

        System.out.println("***************");

        String ss = "我是StringBuffer";
        StringBuffer sbuf = new StringBuffer(ss);
        System.out.println(sbuf.reverse());  //reffuBgnirtS是我

        StringBuilder sbud = new StringBuilder(ss);
        System.out.println(sbud.reverse());
        System.out.println("_------------------");

        String string = "测试SB字符串";
        StringBuilder stringBuilder = new StringBuilder(string);
        //追加一个字符串
        System.out.println(stringBuilder.append("追加字符").append("继续追加").reverse());
        //加追续继符字加追串符字BS试测

        System.out.println(stringBuilder.insert(4,"太阳"));
        //加追续继太阳符字加追串符字BS试测


    }

    private static String convert(String s) {
        int mid = s.length()/2;
        char[] chars = s.toCharArray();
        for (int i =  0; i < mid; i++) {
            char temp=chars[i];
            chars[i]=chars[s.length()-1-i];
            chars[s.length()-1-i]=temp;
        }
        System.out.println(chars);
        System.out.println(Arrays.toString(chars));
        String s1 = new String(chars);
        System.out.println(s1);
        return  s1;
    }

}