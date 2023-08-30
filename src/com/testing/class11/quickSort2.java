package com.testing.class11;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-17 22:49
 */
public class quickSort2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 9, 4, 5, 2, 6, 7,1};
        System.out.println(Arrays.toString(quickSort2(arr, 0, arr.length - 1)));

    }


    public static int[] quickSort2(int[] arr, int start, int end) {
        int left = start;
        int right = end;
        int base = arr[end];

//            while (left<right){
//
//                while (left<right){
//                    if(arr[left]<base){
//                        left++;
//                    }else {
//                        int tmp=arr[left];
//                        arr[left]=arr[right];
//                        arr[right] =tmp;
//                        right--;
//                        break;
//                    }
//                }
//
//                while (left<right){
//                    if(arr[right]>base){
//                        right--;
//                    }else {
//                        int tmp=arr[left];
//                        arr[left]=arr[right];
//                        arr[right] =tmp;
//                        left++;
//                        break;
//                    }
//                }
//
//            }

        while (left < right) {
            while (left < right && arr[left] < base) {
                left++;
            }
            while (left < right && arr[right] > base) {
                right--;
            }

            if (left < right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }

        if (start < right) {
            quickSort2(arr, start, right - 1);
        }
        if (left < end) {
            quickSort2(arr, left + 1, end);
        }

        return arr;
    }

}