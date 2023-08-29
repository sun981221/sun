package com.testing.class10;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-15 23:18
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array={4,2,9,1,3,8,5};
//        quickSort(array,0,array.length-1)
        System.out.println(Arrays.toString(quickSort(array, 0, array.length - 1)));
    }

    private static int[ ] quickSort(int [ ] array , int start, int end) {
        //先生成左右游标
        int left =start;
        int right = end ;
        //选取基准值为最左边的数
        int base= array[left];
        while (left<right){
            while (left<right){
                if(array[right]>base){
                   right--;
                }else {
                    int tmp=array[right];
                    array[right]=array[left];
                    array[left]=tmp;
                    left++;
                    break;
                }
            }

            while (left<right){
                if(array[left]<base){
                    left++;
                }else {
                    int tmp=array[right ];
                    array[right]=array[left];
                    array[left]=tmp;
                    right--;
                    break;
                }

            }
        }


         //递归操作
        if(left-1>start){
            quickSort(array,start,left-1);
        } 
        if(right+1<end){
            quickSort(array,right+1,end);
        }


        return array;
    }

}