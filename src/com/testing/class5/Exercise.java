package com.testing.class5;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-12 20:18
 */
public class Exercise {
    public static void main(String[] args) {
        //数组和链表的互转实现
        Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //aList参数列表为可选参数
        List<Integer> integerList = Arrays.asList(integerArray);
        System.out.println(integerList);


        Object[] listToArray = integerList.toArray();
        System.out.println(Arrays.toString(listToArray));

        Integer[] integers = (Integer[]) integerList.toArray();
        System.out.println(Arrays.toString(integers));

    }

}