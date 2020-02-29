package com.neusoft.daytwenty_nine;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lan_jia_nao on 2020/2/29.
 */
public class SLZH {
    public static void main(String[] args) {
        //如何实现数组与List之间的转换
        //数组转List
        int[] array = {1,3,23,53,94,45,67,20};
        List<Integer> list = new ArrayList();
        for (int i : array){
            list.add(i);
        }
        System.out.println(list);

        //List转数组
        Ayys ayys = new Ayys();
        List<Integer> list2 = new ArrayList<>();
        for (int i=0;i<18;i++){
            list2.add(i+1);
        }
        for (int i=0;i<list2.size();i++){
            ayys.add(list2.get(i));
        }
        for (int i=0;i<ayys.length();i++){
            System.out.println(ayys.getIndex(i));
        }
    }
}
