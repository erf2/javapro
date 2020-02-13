package com.neusoft.daytwelve;

/**
 * Created by lan_jia_nao on 2020/2/13.
 */
public class XianCheng extends Thread {
    @Override
    public void run() {
        for (int i=1;i<=100;i++){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"线程输出---"+i);
        }
    }
}
class XianChengTest {
    public static void main(String[] args) {
        XianCheng xc1 = new XianCheng();
        xc1.start();
        XianCheng xc2 = new XianCheng();
        xc2.start();
    }
}
