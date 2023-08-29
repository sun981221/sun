package com.testing.class10;



/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-16 21:30
 */
public class ExtendTest {
    public static void main(String[] args) {
        Mammal mammal=new Mammal();
        System.out.println(mammal.kind);
        mammal.eat();

        System.out.println("*********");
        System.out.println(mammal);
        System.out.println(mammal.toString());


    }




}