package com.neusoft.daytest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lan_jia_nao on 2020/2/10.
 */
public class Mytest5 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add("我要向前飞，你是心爱的玫瑰");
        list.add(0,"我要为你展现我的美");
        List list1=new ArrayList();
        list1.add(9);
        list1.add(11);
        list.addAll(list1);
        /*System.out.println(list.addAll(list));*/
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        /*System.out.println(list.contains(12));*/
        /*System.out.println(list.size());*/
    }
}
