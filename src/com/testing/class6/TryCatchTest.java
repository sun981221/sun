package com.testing.class6;

import java.util.Scanner;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-12 21:09
 */
public class TryCatchTest {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        String s = scanner.nextLine();

        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


        Thread.sleep(1000);
    }

}