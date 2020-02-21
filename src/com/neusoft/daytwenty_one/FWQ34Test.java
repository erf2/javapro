package com.neusoft.daytwenty_one;

/**
 * Created by lan_jia_nao on 2020/2/21.
 */
public class FWQ34Test {
    public static void main(String[] args) {
        FWQ3 f3 = new FWQ3();
        FWQ4 f4 = new FWQ4();
        Thread t3 = new Thread(f3);
        t3.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t4 = new Thread(f4);
        t4.start();
    }
}
