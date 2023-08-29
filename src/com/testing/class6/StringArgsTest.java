package com.testing.class6;

import javax.swing.*;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-12 21:29
 */
public class StringArgsTest {
    public static void main(String[] args) {
        if(args.length<1){
            System.out.println("输入参数数量不足");
        }
        else {
            String arg=args[0];
            try {
                int i=Integer.parseInt(arg);
                System.out.println("输入的值是整数,值是:"+i);
            } catch (NumberFormatException e) {
                System.out.println("输入的值不是整数");

            }
        }
    }

}