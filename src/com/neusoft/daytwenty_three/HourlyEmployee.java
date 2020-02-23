package com.neusoft.daytwenty_three;

/**
 * Created by lan_jia_nao on 2020/2/23.
 */
public class HourlyEmployee extends ColaEmployee {
    private Integer hoursalary;
    private Double hour;
    private Double salary;

    public HourlyEmployee(int hoursalary,double hour,String name,int month){
        super(name,month);
        this.hoursalary=hoursalary;
        this.hour=hour;
    }
    @Override
    public double getSalary(int month) {
        if (hour<=160&&hour>=0){
            return salary = hoursalary*hour;
        }else if (hour>160){
            return salary = hoursalary*(hour-160)*1.5+hoursalary*160;
        }
        return salary;
    }
}
