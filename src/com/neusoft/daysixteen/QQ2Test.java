package com.neusoft.daysixteen;

/**
 * Created by lan_jia_nao on 2020/2/16.
 */
public class QQ2Test {
    public static void main(String[] args) {
        QQ2 qq2 = new QQ2();
        Thread t = new Thread(qq2);
        t.start();
        QQ2 qq21 = new QQ2();
        Thread t2 = new Thread(qq21);
        t2.start();
        QQ2 qq22 = new QQ2();
        Thread t3 = new Thread(qq22);
        t3.start();
    }
}
