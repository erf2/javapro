package com.neusoft.daysixteen;

import java.util.concurrent.CountDownLatch;

/**
 * Created by lan_jia_nao on 2020/2/16.
 */
public class OKI09 {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(100);
        Thread t = new Thread(()->{
            for (int i=0;i<100;i++){
                System.out.println(Thread.currentThread().getName()+"线程输出"+i);
                try {
                    Thread.sleep(30);
                    countDownLatch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"线程输出"+i);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
