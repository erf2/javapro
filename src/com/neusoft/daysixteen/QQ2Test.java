package com.neusoft.daysixteen;

/**
 * Created by lan_jia_nao on 2020/2/16.
 */
public class QQ2Test {
    public static void main(String[] args) {
        QQ2 qq2 = new QQ2();
        Thread t = new Thread(qq2);
        t.start();
    }
}
