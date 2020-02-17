package com.neusoft.daysixteen;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/**
 * Created by lan_jia_nao on 2020/2/17.
 */
public class SFC32 {
    public static List list = new Vector();
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        CountDownLatch c = new CountDownLatch(2000);
        Semaphore s = new Semaphore(8);
        for (int i=0;i<2000;i++){
            Thread t = new Thread(()->{
                try {
                    s.acquire(5);
                    /*list.add(1);*/
                    sb.append("a");
                    Thread.sleep(1);
                    c.countDown();
                    s.release(5);
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
        /*System.out.println(list.size());*/
        System.out.println(sb.length());
    }
}
