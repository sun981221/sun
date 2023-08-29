package com.testing.class4;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-10 17:01
 */
public class ArrayDefine {
    public static void main(String[] args) {
        //一维数组静态初始化
        int [ ] arr1 =new int[ ]{ 1,2,3,4,5};
        int [ ] arr2 ={6,7,8,9,10};
        String[] arr3 = {"张三","李四","王五"};


        //打印arr1 arr2
        System.out.println(arr1);
        System.out.println(arr2);

        //循环遍历arr
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("*************");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        //一维数组动态初始化
        int [ ] arr4= new int[5];
        String [ ] arr5=new String[5];
        System.out.println(arr4);
        System.out.println(arr4[0]);

        System.out.println(arr5);
        System.out.println(arr5[0]);
        arr5[0]="张三";
        arr5[1]="李四";
        arr5[2]="王五";
        for (int i = 0; i < arr5.length; i++) {
            System.out.println(arr5[i]);
        }

        /**
         * 1.数组越界:
         *     System.out.println(arr1[5]);
         *     java.lang.ArrayIndexOutOfBoundsException
         * 2.空指针:
         *     arr1=null;
         *     System.out.println(arr1[1]);
         *     java.lang.NullPointerException
         */


        //找最值及其第一次出现的下标
        int [ ]arr6 = { 3,7,15,8,9,0,10,3,15,11};
        int max1= arr6[0];
        int index1=0;
        for (int i = 0; i < arr6.length; i++) {

            if(arr6[i]>max1){
                max1= arr6[i];
                index1 = i;
            }
        }
        System.out.println("max = " + max1);
        System.out.println("index = " + index1);

        //找最值及其所有最值的下标
        int max2 =arr6 [0];
        String index2 = "";
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i]>max2){
                max2=arr6[i];
                index2=i +"";
            }else if (arr6[i]==max2){
                index2+=","+i;
            }
        }
        System.out.println("最大值是" + max2);
        System.out.println("最大值的下标是[" + index2+"]");











    }

}