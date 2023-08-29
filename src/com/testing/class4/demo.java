package com.testing.class4;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-10 16:31
 */
public class demo {
    public static void main(String[] args) {
        System.out.println("hello\tjava");
        System.out.println("hello\rjava");
        System.out.println("hello\njava");
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();

        scanner.close();

    }
}