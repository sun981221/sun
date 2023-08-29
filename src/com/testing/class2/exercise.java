package com.testing.class2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-09 21:11
 */
public class exercise {
    public static void main(String[] args) {
        int x=1;
//        int y=2;
//        int z = x++ * 2 + ++x * 2 + y-- * 2 + --y * 2;
//        /** 2+6+4+0
//         * x=2,3
//         * y=1,0
//         */
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        System.out.println("**************");

        x=9;
        boolean b = x > 5 && x << 8 - 7 > 20 || !(x++ < 15);
        /**
         *
         */
        System.out.println(b);
    }

}