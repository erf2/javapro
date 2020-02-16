package com.neusoft.daysixteen;

/**
 * Created by lan_jia_nao on 2020/2/16.
 */
public class TongBu implements Runnable {
    Object obj = new Object();
    public int count = 80;
    @Override
    public void run() {
        for (int i=1;i<=count;i++){
            while(count>1){
                synchronized(obj){
                    System.out.println(Thread.currentThread().getName()+"卖了第"+count+"张票");
                    count--;
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.println(count);
    }
}
