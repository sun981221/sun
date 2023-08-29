package com.testing.class11;

import com.sun.javafx.image.BytePixelSetter;

import java.sql.Array;
import java.util.Arrays;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-16 20:23
 */
public class exercise {

    public static void main(String[] args) {

        int [ ]arr ={1,3,9,4,5,2,6,7};
        System.out.println(Arrays.toString(bubbleSort(arr)));
        System.out.println(Arrays.toString(selectSort(arr)));
        System.out.println(Arrays.toString(qucikSort(arr,0,7)));

    }

    public static int [ ] bubbleSort(int [ ] array) {

        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 0; j <= array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
        return array;
    }

    public static int [ ] selectSort(int [ ] array){

        for (int i = 1; i <=array.length-1 ; i++) {
            int  index=i-1;
            for (int j = i; j <=array.length-1 ; j++) {
                if(array[j]<array[index]){
                    index=j;
                }
            }

            int temp=array[i-1];
            array[i-1] =array[index];
            array[index]=temp;



        }
        return array;




    }

    public  static int [] qucikSort(int [] array,int start , int end){
        int left=start;
        int right =end;
        int base= array[left];
        while (left<right){
            while (left<right){
                if(array[right]>base) {
                    right--;
                }else {
                    int temp=array[right];
                    array[right]=array[left];
                    array[left]=temp;
                    left++;
                    break;
                }
            }

            while (left<right){
               if(array[left]<base){
                   left++;
               }else {
                   int tmp=array[left];
                   array[left]=array[right];
                   array[right]=tmp;
                   right--;
                   break;
               }
            }

        }

        if(start-1>left){
            qucikSort(array,start,left-1);
        }
        if(right+1<end){
            qucikSort(array,right,end-1);
        }

        return array;
    }



}