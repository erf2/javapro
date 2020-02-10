package com.neusoft.daytest;

/**
 * Created by lan_jia_nao on 2020/2/10.
 */
public class SalariedEmployee extends ColaEmployee {
    public int salary;

    public SalariedEmployee(int salary,String name,int mouth){
        super(name,mouth);
        this.salary=salary;
    }

    @Override
    public double getSalary(int month){
        return salary;
    }
}
