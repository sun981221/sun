package com.testing.class10.Inter;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-16 23:46
 */
public class ICat implements IAnimal{
    String hobby;


    @Override
    public void move() {
        System.out.println("猫咪都会跑");
    }

    public void eat() {
        System.out.println("猫咪喜欢吃鱼");
    }


    @Override
    public void death() {
        IAnimal.super.death();
        System.out.println("重写:猫咪可以活100岁");
    }
}