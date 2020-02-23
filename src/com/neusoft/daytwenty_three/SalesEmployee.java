package com.neusoft.daytwenty_three;

/**
 * Created by lan_jia_nao on 2020/2/23.
 */
public class SalesEmployee extends ColaEmployee {
    private Integer monthsalary;
    private Double ticheng;
    private Double salary;

    public SalesEmployee(int monthsalary,double ticheng,String name,int month){
        super(name,month);
        this.monthsalary=monthsalary;
        this.ticheng=ticheng;
    }

    @Override
    public double getSalary(int month) {
        salary = monthsalary*ticheng;
        return salary;
    }
}
