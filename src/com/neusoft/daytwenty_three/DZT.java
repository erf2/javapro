package com.neusoft.daytwenty_three;

/**
 * Created by lan_jia_nao on 2020/2/23.
 */
public class DZT {
    public static void main(String[] args) {
        DZ dz = new DZ();
        for (int i=1;i<=100;i++){
            dz.add(i);
        }
        System.out.println(dz.getIndex(0));
    }
}
