package com.testing.class9;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-15 21:47
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(MultiRecusion(5));
        System.out.println(fibNum(4));
        System.out.println(sum(10));
        System.out.println(RabbitSequence(7));
        System.out.println(RabbitArray(7));
    }


    //斐波那契数列:求第N项的值 1 1 2 3  5  8  13
    public static int fibNum(int n){
        return n==1|n==2?1:fibNum(n-1)+fibNum(n-2);
    }

    //斐波那契数列:求N项和
    public static int RabbitSequence(int n){
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=fibNum(i);

        }
        return sum;
    }

    public static int RabbitArray(int n){
        int[] fibArray = new int[n];
        fibArray[0]=1;
        fibArray[1]=1;
        //计算前N项和,并存到数组中
        for (int i = 2; i <n ; i++) {
            fibArray[i]=fibArray[i-1]+fibArray[i-2];
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=fibArray[i];
        }
        return sum;


    }



    //求n的阶乘
    public static int MultiRecusion(int n){
        if (n==1){
            return 1;
        }else if(n<1){
            return -1;
        }else {
            int result = n * MultiRecusion(n-1);
            return  result;
        }

    }


    //求前N项和
    public static int  sum(int n){
        return n==1?1:n+sum(n-1);
    }


}