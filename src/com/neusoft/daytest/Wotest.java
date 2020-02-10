package com.neusoft.daytest;

/**
 * Created by lan_jia_nao on 2020/2/10.
 */
public class Wotest {
    public static void main(String[] args) {
        Qiao qiao = new Qiao();
        Tizi tizi = new Tizi();
        Wo wo = new Wo();
        wo.setTools(tizi);
        wo.method();
    }
}
