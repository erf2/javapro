package com.neusoft.daysixteen;

/**
 * Created by lan_jia_nao on 2020/2/16.
 */
public class SQBTest {
    public static void main(String[] args) {
        Runnable sqb = new SQB();
        Thread t1 = new Thread(sqb);
        Thread t2 = new Thread(sqb);
        Thread t3 = new Thread(sqb);
        t1.start();
        t2.start();
        t3.start();
    }

}
