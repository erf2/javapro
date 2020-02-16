package com.neusoft.daysixteen;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/**
 * Created by lan_jia_nao on 2020/2/16.
 */
public class HER {
    public static int a;

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(8);
        CountDownLatch c = new CountDownLatch(3000);
        for (int i=0;i<3000;i++){
            Thread t = new Thread(()->{
                try {
                    semaphore.acquire(5);
                    a++;
                    c.countDown();
                    semaphore.release(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
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
