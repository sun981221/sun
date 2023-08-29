package com.testing.class6;

import java.lang.reflect.Type;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-12 20:33
 */
public class StringTest {
    public static void main(String[] args) {

        String hello = "hello world";
        int a= 3;
        System.out.println(String.valueOf(a));


        String b = "15";
        int i = Integer.parseInt(b);
        System.out.println(i);

        String c="3.14";
        System.out.println(Float.parseFloat(c));

        System.out.println("*****************");

        String age="我今年15岁";
        int intAge = 0;
        try {
            intAge = Integer.parseInt(age);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println(intAge);


    }

}