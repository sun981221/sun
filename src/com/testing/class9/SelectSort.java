package com.testing.class9;


import java.util.Arrays;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-14 22:06
 */

public class SelectSort {
    public static void main(String[] args) {
        int[] array = {4, 6, 3, 9, 2, 10, 1};
        // i-1  index
//        selectSort(array);
        System.out.println(Arrays.toString( selectSort(array)));
    }


    private static int[] selectSort(int[] array) {
        //外层控制轮次,内层控制和谁比

        for (int i = 1; i <= array.length - 1; i++) {

            int minNum =array[i-1];
            int  index = i-1;
            for (int j = i; j <= array.length - 1; j++) {
                if(array[j]<minNum){
                    //更新最小值的大小和位置
                    index =j;
                    minNum=array[j];
                }

            }

            if (index != i) {
                array[index]=array[i-1];
                array[i-1]=minNum;
            }


        }


        return array;
    }

}