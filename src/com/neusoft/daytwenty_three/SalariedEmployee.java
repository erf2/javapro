package com.neusoft.daytwenty_three;

/**
 * Created by lan_jia_nao on 2020/2/23.
 */
public class SalariedEmployee extends ColaEmployee {
    private Integer salary;
    public SalariedEmployee(int salary,String name,int month){
        super(name,month);
        this.salary = salary;
    }
    @Override
    public double getSalary(int month) {
        return salary;
    }
}
