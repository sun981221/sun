package com.testing.class9;

import java.util.Arrays;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-14 21:40
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {8, 2, 3, 5, 6};
        System.out.println(Arrays.toString(bubbleSort(array)));

    }

    public static int[] bubbleSort(int[] array) {

        //12345
        //外层轮次，内层和谁比
        for (int i = 1; i <= array.length - 1; i++) {
            for (int j = 0; j <= array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmep = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmep;
                }

            }

        }
        return array;
    }

}