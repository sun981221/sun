package com.testing.class3;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-09 23:17
 */
public class Example {
    public static void main(String[] args) {

        //1.求和1-100
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        //2.求100以内偶数和
        int  sum1=0;
        for (int i = 0; i <= 100; i++) {
            if(i%2==0){
                sum1+=i;
//                System.out.println(i);
            }
        }
        System.out.println(sum1);

        //3.99乘法表
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"x"+j+"="+i*j);
                System.out.print("\t");
            }
            System.out.print("\n");

        }

        //4.求1-100之内的质数
        for (int i = 2; i <=100 ; i++) {
            int j = 2;
            for (; j <i; j++) {
                if(i%j==0){
                    System.out.println(i+"是合数");
                    break;
                }
            }
            if(j==i){
                System.out.println(i+"是质数");
            }



        }






    }

}