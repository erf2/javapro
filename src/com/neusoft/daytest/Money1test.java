package com.neusoft.daytest;

/**
 * Created by lan_jia_nao on 2020/2/10.
 */
public class Money1test {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee(6000,"李静",3);
        System.out.println(salariedEmployee.getSalary(3));
        HourlyEmployee hourlyEmployee = new HourlyEmployee(180,30,"刘明",4);
        System.out.println(hourlyEmployee.getSalary(4));
        SalesEmployee salesEmployee = new SalesEmployee(300000,0.05,"金东",2);
        System.out.println(salesEmployee.getSalary(2));
    }
}
