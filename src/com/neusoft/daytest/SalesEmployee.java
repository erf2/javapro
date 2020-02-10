package com.neusoft.daytest;

/**
 * Created by lan_jia_nao on 2020/2/10.
 */
public class SalesEmployee extends ColaEmployee {
    private int sale;
    private double ticheng;

    public SalesEmployee(int sale,double ticheng,String name,int month){
        super(name,month);
        this.sale=sale;
        this.ticheng=ticheng;
    }

    @Override
    public double getSalary(int month) {
        return sale*ticheng;
    }
}
