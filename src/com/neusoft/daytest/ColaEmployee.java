package com.neusoft.daytest;

/**
 * Created by lan_jia_nao on 2020/2/10.
 */
public abstract class ColaEmployee {
    private String name;
    private int month;

    public ColaEmployee(String name,int mouth){
        this.month=mouth;
    }

    public abstract double getSalary(int month);
}
