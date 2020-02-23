package com.neusoft.daytwenty_three;

/**
 * Created by lan_jia_nao on 2020/2/23.
 */
public abstract class ColaEmployee {
    private String name;
    private Integer month;

    public ColaEmployee() {}

    public ColaEmployee(String name, Integer month) {
        this.name = name;
        this.month = month;
    }

    public abstract double getSalary(int month);
}
