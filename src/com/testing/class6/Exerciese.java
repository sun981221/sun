package com.testing.class6;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-12 23:18
 */
public class Exerciese {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("您未输入参数,请重新输入");
        } else if (args.length == 1) {
            System.out.println("您输入的参数数量为1,请输入2个整数");
        } else {
            String strNum1 = args[0];
            String strNum2 = args[1];
            try {
                int intNum1 = Integer.parseInt(strNum1);
                try {
                    int intNum2 = Integer.parseInt(strNum2);
                    if (intNum1 > intNum2) {
                        System.out.println("第1个参数的数值大,它的值为" + intNum1);
                    } else if (intNum1 == intNum2) {
                        System.out.println("2个参数的数值相等,它的值为" + intNum1);
                    } else {
                        System.out.println("第2个参数的数值大,它的值为" + intNum2);

                    }
                } catch (NumberFormatException e) {
                    System.out.println("您输入的第二个参数不是整数,请输入2个整数");
                }

            } catch (NumberFormatException e) {
                System.out.println("您输入的第一个参数不是整数,请输入2个整数");
            }

        }


    }

}