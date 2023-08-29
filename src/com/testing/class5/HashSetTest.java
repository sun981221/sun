package com.testing.class5;

import sun.misc.PostVMInitHook;

import java.net.SocketTimeoutException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-11 22:42
 */
public class HashSetTest {
    public static void main(String[] args) {

        //HashSet:无序存储，自动去重
        java.util.HashSet<String> test1Set = new HashSet();

        //增
        test1Set.add("太阳");
        test1Set.add("星星");
        test1Set.add("月亮");
        System.out.println(test1Set); //[太阳, 月亮, 星星]

        test1Set.add("月亮");  //已有的元素无法再次添加

        //删
        test1Set.remove(" ");
        test1Set.remove("地球");  //删除不存在的元素不会报错
        test1Set.remove("星星");
        System.out.println(test1Set);  //[太阳, 月亮]

        //改
        test1Set.remove("月亮");
        test1Set.add("岳亮") ;//月亮-->岳亮
        System.out.println(test1Set);  //[岳亮, 太阳]


        //查
        for (String s : test1Set) {
            System.out.println(s);
            /*
            岳亮
            太阳
             */
        }

       //iterator 迭代器
        /**
         * 1.获得迭代器对象:迭代器对象创建出来时，默认指向集合的0索引处
         *  Iterator<String> it=collection.iterator();
         *2.利用迭代器里面的方法进行遍历:判断当前元素是否可以取出
         *        it.hasNext()  //boolean
         *        取出当前位置元素,并将迭代器往后移动一个索引的单位
         */

        Iterator<String> it = test1Set.iterator();
        System.out.println(it.hasNext()); //true
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(it.hasNext()); //true






    }

}