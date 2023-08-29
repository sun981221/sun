package com.testing.class5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-11 23:24
 */
public class ArrayListSet {
    public static void main(String[] args) {
        //列表，链表;最常用的数据结构

        //list、set、map等存储的数据类型不是是基本数据类型，只能是他们的包装类型
        ArrayList<Integer> list = new ArrayList<>();

        //增
        list.add(333);
        list.add(444);
        list.add(666);
        list.add(555);

        System.out.println(list);  //[333, 444, 666, 555]

        //删
        //1.根据索引删：
       // list.remove(555);     //IndexOutOfBoundsException:列表越界
        list.remove(new Integer(555));
        System.out.println(list); //[333, 444, 666]

        // 2.根据值删:有多个值，只删除第一个
        list.remove(new Integer(99));  //删除不存在的不会报错


        //改
        list.set(0,520); //将333-->520;
        System.out.println(list); //[520, 444, 666]

        //查
        //list.size是一个方法
        //1.for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("************");
        //2.增强for循环
        for (Integer integer : list) {
            System.out.println(integer);

        }
        System.out.println("************");

        //3.迭代器
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("************");

    }

}