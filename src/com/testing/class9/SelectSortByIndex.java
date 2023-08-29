package com.testing.class9;

import java.util.Arrays;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-14 23:29
 */
public class SelectSortByIndex {
    public static void main(String[] args) {
        int[] array = {4, 6, 3, 9, 2, 10, 1};
        // i-1  index
//        selectSort(array);
        System.out.println(Arrays.toString(selectSort(array)));
    }

    private static int[] selectSort(int[] array) {
        //外层控制轮次,内层控制和谁比

        for (int i = 1; i <= array.length - 1; i++) {

            int index = i - 1;//最小数的下标
            for (int j = i; j <= array.length - 1; j++) {
                if (array[j] < array[index]) {
                    //更新最小值的大小和位置
                    index = j;
                }
            }
            //交换array i-1 和array index的值
            int tmp = array[i-1];
            array[i-1] = array[index];
            array[index] = tmp;


        }

        return array;

    }
}