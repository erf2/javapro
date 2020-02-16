package com.neusoft.daysixteen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lan_jia_nao on 2020/2/16.
 */
public class QQ2 implements Runnable {
    @Override
    public void run() {
        List list = new ArrayList();
        for (int i=0;i<10000;i++){
            list.add("我爱你第"+i+"次，亲爱的");
            System.out.println(Thread.currentThread().getName()+"我爱你第"+i+"次，亲爱的");
            if (list.size()==10000){
                System.out.println(Thread.currentThread().getName()+"哈，爱你一万次哦");
            }else{
                System.out.println(Thread.currentThread().getName()+"不够，再爱一次");
            }
        }
        System.out.println("我爱了"+list.size()+"次");
    }
}
