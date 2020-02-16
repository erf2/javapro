package com.neusoft.daysixteen;

/**
 * Created by lan_jia_nao on 2020/2/16.
 */
public class YYY8 {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            for (int i=0;i<100;i++){
                System.out.println(Thread.currentThread().getName()+"线程输出"+i);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t.start();
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"线程输出"+i);
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
