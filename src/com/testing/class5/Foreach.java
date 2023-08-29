package com.testing.class5;

import com.testing.class4.Student;

import java.util.Arrays;

/**
 * @program: sun
 * @description: 增强for循环
 * @author: Sun
 * @create: 2023-08-11 21:12
 */
public class Foreach {
    public static void main(String[] args) {
        String [] strArray =new String [] { "张三","李四","王五"};

        strArray[0]="陈二";
        System.out.println(strArray[0]);

        Student student = new Student();
        System.out.println(student);
        System.out.println(student.toString());



        //Arrays 类
        //fill:完成对数组所有元素的赋值
//        Arrays.fill(strArray,"sun");
        for (String s : strArray) {
            System.out.println(s);

        }

        //Arrays.tostring :将数组转化为String
        System.out.println(Arrays.toString(strArray));


    }

}