package com.neusoft.daytest;

import java.util.Date;

/**
 * Created by lan_jia_nao on 2020/2/10.
 */
public class G222 {
    public static void main(String[] args) {
        int[] a = new int[99999999];
        //第一种
        Date d3 = new Date();
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.println(a[i]);
        }
        Date d4 = new Date();
        System.out.println(d4.getTime() - d3.getTime());
        //第二种
        Date d1 = new Date();
        for (int i = 0; i < a.length / 2; i++) {
            a[i * 2] = i * 2;
            a[i * 2 + 1] = i * 2 + 1;
        }
        if (a.length % 2 != 0) {
            a[a.length - 1] = a.length - 1;

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        Date d2 = new Date();
        System.out.println(d2.getTime() - d1.getTime());
    }
}
