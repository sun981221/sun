package com.testing.class10;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-16 21:25
 */
public class Animal {
    public int age;
    public  String name;
    public String kind="动物";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("动物都要吃饭");
    }

    public void move(){
        System.out.println("动物都可以动");
    }


    public  Animal(String string){
        System.out.println("我是" + string + "构造方法");
    }

    //重写toString方法
    public String toString() {
        return "这是一个动物"+super.toString();
    }

}