package com.testing.class10;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-16 22:47
 */
public class TestMammal {
    public static void main(String[] args) {
       Animal aCat=new Cat();
       Animal bDog=new Dog();


       aCat.eat();
       bDog.eat();
        ((Cat) aCat).welcome();
    }

}