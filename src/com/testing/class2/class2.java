package com.testing.class2;

import java.util.Scanner;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-08 23:10
 */
public class class2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        int x = 1;
        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入x的值: ");
//        int x= scanner.nextInt();
        if (x > 1) {
            System.out.println("1");
        } else if (x > 2) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
        System.out.println("*********************");
/**
 *
 * 0011 1100   60
 * 0000 1101  12
 * 111 1100   -60
 *
 */
        System.out.println(60 & 13); //0000 1100  12
        System.out.println(60 | 13);  //0011 1101   61
        System.out.println(60 ^ 13); //0011 0001   49
        System.out.println(~60); //11000011 -> 1011 1101   -61
        System.out.println(~-60);//1000011 -> 1000100-> 0111011  59
        System.out.println(60 << 2); //60*2^2 240     11110000
        System.out.println(60 >> 2);//60/2/2  15    0000 11111
        System.out.println(60 >>> 2); ////60/2/2  15    0000 11111


/**
 *
 */
        int q = 1;
        int w = 2;
        int max = q > w ? q : w;
        System.out.println(max);


        int demo1=3;
        int demo2=10;
        boolean demo3=demo1++ >2 || --demo2 >9;
        System.out.println(demo1); //4
        System.out.println(demo2);//10
        System.out.println(demo3);// true

    }

}