package com.neusoft.daysixteen;

/**
 * Created by lan_jia_nao on 2020/2/16.
 */
public class SQB implements Runnable {
    public int count = 100;
    Object obj = new Object();
    @Override
    public void run() {
        for (int i=1;i<=count;i++){
            while(count>0){
                synchronized (obj){
                    System.out.println(Thread.currentThread().getName()+"我忙完了，在想你"+"第"+count+"次");
                    count--;
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
