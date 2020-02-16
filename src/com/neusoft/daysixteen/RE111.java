package com.neusoft.daysixteen;

/**
 * Created by lan_jia_nao on 2020/2/16.
 */
public class RE111 {
    public static void main(String[] args) {
        MyThread9 t9 = new MyThread9();
        Thread t8 = new Thread(t9);
        t8.start();
        /*MyThread t = new MyThread();
        t.start();
        MyThread t1 = new MyThread();
        t1.start();*/
    }
}
