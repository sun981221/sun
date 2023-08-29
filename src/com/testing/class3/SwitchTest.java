package com.testing.class3;

import java.util.Scanner;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-09 21:41
 */
public class SwitchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数值");
        int num = scanner.nextInt();

        switch (num) {
            case 1:

            case 2:

            case 3:
                System.out.println("小于3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("default");

        }
    }

}