package com.testing.class5;

import java.util.Arrays;

/**
 * @program: sun
 * @description: 二维数组
 * @author: Sun
 * @create: 2023-08-11 21:29
 */
public class DoubleArray {
    public static void main(String[] args) {
        int [][] doubleArray= new int[9][9];


        int [][]test={{0},{1,2},{3,4,5}};
        int sum=0;
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                System.out.println(test[i][j]);
                sum+=test[i][j];
            }

        }
        System.out.println("二维数组[][]test 元素的和为:"+sum);


        //提前创好一维数组，存到二维数组中
        int [][]demo=new int [3][3];
        int []arr1={11,22,33};
        int []arr2={44,55,66,77};
        int []arr3={88,99,111,222};
        int []arr4={88,99,111,222};
        demo[0]=arr1;
        demo[1]=arr2;
        demo[2]=arr3;
        System.out.println(demo[2][3]);



        //将99乘法表，存到二维数组中

        for (int i = 0; i < doubleArray.length; i++) {
            int [ ] row= doubleArray[i];
            for (int j = 0; j < doubleArray.length; j++) {
                row[j]=(i+1)*(j+1);
            }

        }
        System.out.println(doubleArray[4][5]);

        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(Arrays.toString(doubleArray[i]));

        }




    }

}