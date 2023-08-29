package com.testing.class10.Inter;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-16 23:49
 */
public class InterTest {
    public static void main(String[] args) {
        ICat cat = new ICat();
        cat.move();
        cat.death();
        cat.eat();
        cat.hobby="吃鱼";
        System.out.println(cat.hobby);
    }

}