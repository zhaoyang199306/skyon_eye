package com.skyon.framework.manager;

import java.security.PublicKey;
import java.util.*;

public class MyCollection{
    static String s = "Hello";
    static int ss = 11;

    public static void main(String[] args) {
        int dd = 11;
        int ff = 11;
        System.out.println(dd==ff);
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hel" + "lo";
        String s4 = "Hel" + new String("lo");
        String s5 = new String("Hello");
        String s6 = s5.intern();
        String s7 = "H";
        String s8 = "ello";
        String s9 = s7 + s8;

        System.out.println(ss == dd);  // true
        System.out.println(s == s1);  // true
        System.out.println(s1 == s2);  // true
        System.out.println(s1 == s3);  // true
        System.out.println(s1 == s4);  // false
        System.out.println(s1 == s9);  // false
        System.out.println(s4 == s5);  // false
        System.out.println(s1 == s6);  // true

        Integer[] ssd = new Integer[]{2, 3, 1, 33, 22};
        for (int i = 0; i < ssd.length - 1; i++) {
            for (int j = 0; j < ssd.length - 1 - i; j++) {
                if (ssd[j] > ssd[j+1]) {
                    Integer tmp = ssd[j];
                    ssd[j] = ssd[j+1];
                    ssd[j+1] = tmp;
                }

            }
        }
        for (int i = 0; i < ssd.length; i++) {

            System.out.println(ssd[i]);
        }



    }


}
