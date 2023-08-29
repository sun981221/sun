package com.testing.class4;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-10 00:02
 */
public class Student {
    //属性
    public String name;
    public int age;
    public String sex;

    //行为


    //构造方法
    public Student(){
        System.out.println("1");
    }
    public Student(int name,String sex){
        System.out.println("2");
    }


    public Student(String name, int age, String sex) {

        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public static void test(int ... args){
        System.out.println("这是静态方法");
        System.out.println(args[0]);
        System.out.println(args[1]);
    }

    /**
     *
     * @param args
     */public static void main(String[] args) {
         test(3,4,5,6);
         return;
    }




}