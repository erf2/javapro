package com.neusoft.daysixteen;

/**
 * Created by lan_jia_nao on 2020/2/16.
 */
public class TongBuTest {
    public static void main(String[] args) {
        Runnable tb = new TongBu();
        Thread t1 = new Thread(tb);
        Thread t2 = new Thread(tb);
        t1.start();
        t2.start();
    }
}
