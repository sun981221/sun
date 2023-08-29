package com.testing.class10.AccessFather;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-17 22:21
 */
public class Son extends Father{


    //    没有继承private方法
    void changeName(){

    }

    void spendMoney(){
        super.spendMoney();

    }

    Son(){
       super("Son");

    }
}