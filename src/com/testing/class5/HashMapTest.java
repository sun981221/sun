package com.testing.class5;

import java.net.SocketTimeoutException;
import java.util.*;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-11 23:56
 */
public class HashMapTest {
    public static void main(String[] args) {
        //map中不能有重复的键，键是用set存储的
        HashMap<String, Integer> scoreMap = new HashMap<>();

        //增
        scoreMap.put("张三", 80);
        scoreMap.put("李四",100);
        scoreMap.put("王五",90);
        scoreMap.put("陈六",95);
        //键是无序的，不能重复，value可以重复

        System.out.println(scoreMap);

        //删
        //删除陈六
        scoreMap.remove("陈六");
        System.out.println(scoreMap);  //{李四=100, 张三=80, 王五=90}

        scoreMap.remove("王五",98); //{李四=100, 张三=80, 王五=90},更严谨，value不对；无法删除
        scoreMap.remove("王3",98); //key不对无法删除
        System.out.println(scoreMap);
        //清空
        //scoreMap.clear();

        //改
        //将李四=100,---->李四=150
        scoreMap.replace("李四",100,150);
        System.out.println(scoreMap);  //先校验再修改 {李四=150, 张三=80, 王五=90}
        /*
        直接修改:将李四=100,---->李四=150
         scoreMap.replace("李四",150);
         */

        System.out.println("************");
        //查
        //map的遍历方式，是基于键或者键值对的存储来做
        /*
        键的集合:[李四, 张三, 王五]
         */
        Set<String> stringSet = scoreMap.keySet();
        System.out.println("键的集合:"+stringSet);

        for (String key : scoreMap.keySet()) {
            System.out.println(key+"="+scoreMap.get(key));
        }

        //迭代器
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()){
//            String next=iterator.next();
//            System.out.println(next.ge);
            System.out.println(iterator.next()+"="+iterator);
        }


        System.out.println("_____________");
        //获取键值对的集合
        /*
        键值对的集合:[李四, 张三, 王五]
         */
        Set<Map.Entry<String, Integer>> entries = scoreMap.entrySet();
        System.out.println("键值对的集合:"+entries);
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);

        }


        //迭代器
        Iterator<Map.Entry<String, Integer>> it = entries.iterator();


        while (it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println("________________________________");
        while (it.hasNext()){
            Map.Entry<String, Integer> next = it.next();
            System.out.println(next.getKey());
        }



    }

}