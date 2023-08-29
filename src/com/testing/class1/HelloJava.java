package com.testing.class1;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-07 22:31
 */

import java.util.Vector;

/**
 * 生成多行注释
 * Class定义
 */
public class HelloJava {

    public static void main( String[] args ) {
        Vector v = new Vector();
        while (true){
            byte b[] = new byte[10240*5];
            v.add(b);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    int busyTime = 10;
                    int idleTime = busyTime;
                    long startTime = 0;
                    while (true){
                        startTime = System.currentTimeMillis();
                        System.out.println(System.currentTimeMillis()+","+startTime+","+(System.currentTimeMillis() - startTime));
                        while ((System.currentTimeMillis() - startTime) <= busyTime);

                        try {
                            Thread.sleep(idleTime);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }).start();
        }
    }
}