package com.neusoft.daysixteen;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lan_jia_nao on 2020/2/16.
 */
public class WEQ777 {
    public static int a=0;
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=5000;i++){
            Thread t6 = new Thread(()->{
                /*a++;*/
                list.add(1);
            });
            t6.start();
        }
        System.out.println(list.size());
        /*System.out.println(a);*/
        /*Thread t5 = new Thread(()->{
            for (int i=1;i<=100;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread()+"线程输出---"+i);
            }
        });
        t5.start();*/
        /*Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=100;i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread()+"线程输出---"+i);
                }
            }
        });
        t1.start();*/
       /* System.out.println(method(10,2,(a,b)->{
            return a/b;
        }));*/
        /*MyE5 jia = new MyE5() {
            @Override
            public int method(int a, int b) {
                return a+b;
            }
        };
        System.out.println(method(10,2,jia));*/
        /*System.out.println(method(10, 2, new MyE5() {
            @Override
            public int method(int a, int b) {
                return a*b;
            }
        }));*/
        /*MyE5 jia = new EWQR333();
        MyE5 jian = new TCC88();
        MyE5 cheng = new OUI99();
        MyE5 chu = new OCD77();
        System.out.println(method(10, 2, chu));*/
    }

    public static int method(int a, int b, MyE5 myE5) {
        return myE5.method(a, b);
    }
}

interface MyE5 {
    int method(int a, int b);
}

class EWQR333 implements MyE5 {
    @Override
    public int method(int a, int b) {
        return a + b;
    }
}

class TCC88 implements MyE5 {
    @Override
    public int method(int a, int b) {
        return a - b;
    }
}

class OUI99 implements MyE5 {
    @Override
    public int method(int a, int b) {
        return a * b;
    }
}

class OCD77 implements MyE5 {
    @Override
    public int method(int a, int b) {
        return a / b;
    }
}
