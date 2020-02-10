package com.neusoft.daytest;

/**
 * Created by lan_jia_nao on 2020/2/10.
 */
public class HourlyEmployee extends ColaEmployee {
    private int hour;
    private int hoursalary;

    public HourlyEmployee(int hour,int hoursalary,String name,int mouth){
        super(name,mouth);
        this.hour=hour;
        this.hoursalary=hoursalary;
    }

    @Override
    public double getSalary(int mouth){
        if (hour<=160){
            return hoursalary*hour;
        }else{
            return hoursalary*1.5*(hour-160)+hoursalary*160;
        }
    }
}
