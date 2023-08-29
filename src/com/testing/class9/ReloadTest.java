package com.testing.class9;



/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-15 21:39
 */
public class ReloadTest {

    public static void main(String[] args) {
        reload();
        System.out.println(reload("String"));
    }

    public static void reload(){
        System.out.println("我是重载无参方法");
    }


    public static String reload(String type){
        String reload="我是重置"+type+"方法";
        return reload;

    }

}