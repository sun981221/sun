package com.testing.class3;

import java.util.Scanner;

/**
 * @program: sun
 * @description: 三种循环
 * @author: Sun
 * @create: 2023-08-09 21:54
 */
public class Loop {
    public static void main(String[] args) {

        //for 循环

        //死循环
        /*
              for ( ; ;){
            System.out.println("a");
        }

         */
        for (int i = 0; i < 10; i++) {

            System.out.println(i);

        }

        System.out.println("***********");


        for (int i = 0; ; ) {
            if (i < 10) {
                System.out.println(i);
                ++i;
            } else if (i == 11) {
                continue;
            } else {
                break;
//                return;
            }
        }

        System.out.println("*********");
        //while

        int i=0;
        while(i<5){
            System.out.println(i);
            ++i;
        }
        System.out.println("*********");

        int j=1;
        do{
            System.out.println(++j);
        }while (j<10);

    }
}