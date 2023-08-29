package com.testing.class10.Inter;

public interface IAnimal {
    int AGE =24;

    //接口中德方法默认都是public abstract

    void move();

    //有默认实现的方法
    default void death(){
        System.out.println("动物都会死,"+"年龄是:"+AGE);
    }
}
