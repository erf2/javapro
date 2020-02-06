package com.dream.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lan_jia_nao on 2020/2/6.
 */
public class Mytext1 {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        /**
         *中间添加用时比较
         * */
        Date Astartarray = new Date();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(0, i);
        }
        Date Aendlinked = new Date();
        System.out.println("arrayList中部添加用时" + (Aendlinked.getTime() - Astartarray.getTime()));
        Date Bstartlinked = new Date();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(0, i);
        }
        Date Bendlinked = new Date();
        System.out.println("linkedList中部添加用时" + (Bendlinked.getTime() - Bstartlinked.getTime()));
        /**
         * 尾部添加用时比较
         */
        Date staetarray = new Date();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        Date endarray = new Date();
        System.out.println("arrayList尾部添加用时" + (endarray.getTime() - staetarray.getTime()));
        Date startlinked = new Date();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        Date endlinked = new Date();
        System.out.println("linkedList尾部添加用时" + (endlinked.getTime() - startlinked.getTime()));
        /**
         * 读取速度比较
         * */
        Date Cstartarray = new Date();
        for (int i=0;i<arrayList.size();i++){
            arrayList.get(i);
        }
        Date Cendarray = new Date();
        System.out.println("arrayList的读取用时"+(Cendarray.getTime()-Cstartarray.getTime()));
        Date Dstartlinked = new Date();
        for (int i=0;i<linkedList.size();i++){
            linkedList.get(i);
        }
        Date Dendlinked = new Date();
        System.out.println("linkedList的读取速度用时"+(Dendlinked.getTime()-Dstartlinked.getTime()));
    }
}
