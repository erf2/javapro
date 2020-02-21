package com.neusoft.daytwenty_one;

/**
 * Created by lan_jia_nao on 2020/2/21.
 */
public class FWQ12Test {
    public static void main(String[] args) {
        FWQ1 f1 = new FWQ1();
        FWQ2 f2 = new FWQ2();
        Thread t2 = new Thread(f2);
        t2.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t1 = new Thread(f1);
        t1.start();

    }
}
