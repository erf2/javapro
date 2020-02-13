package com.neusoft.daytwelve;

/**
 * Created by lan_jia_nao on 2020/2/13.
 */
public class XianJieKou implements Runnable {
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
    /*public static int method(int a,int b){
    }*/
}
class XianJieKouTest {
    public static void main(String[] args) {
        XianJieKou xjk1 = new XianJieKou();
        Thread t = new Thread(xjk1);
        t.start();
        Thread t2 = new Thread(xjk1);
        t2.start();
    }
}
