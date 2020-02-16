package com.neusoft.daysixteen;

import java.util.concurrent.CountDownLatch;

/**
 * Created by lan_jia_nao on 2020/2/16.
 */
public class RFT683 {
    public static int a;
    public static void main(String[] args) {
        CountDownLatch c = new CountDownLatch(5000);
        for (int i=0;i<5000;i++){
            Thread t = new Thread(()->{
                a++;
                c.countDown();
            });
            t.start();
        }
        try {
            c.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a);
    }
}
