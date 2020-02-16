package com.neusoft.daysixteen;

/**
 * Created by lan_jia_nao on 2020/2/16.
 */
public class MyThread9 implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread()+"线程输出-----"+i);
        }
    }
}
