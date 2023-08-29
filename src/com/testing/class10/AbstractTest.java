package com.testing.class10;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-16 23:33
 */
public abstract class AbstractTest {
    abstract public  void Demo();


    public static void main(String[] args) {
        AbstractTest ab = new AbstractTest() {
            @Override
            public void Demo() {
                System.out.println("重写抽象方法");
            }
        };

        ab.Demo();
    }



}