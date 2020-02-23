package com.neusoft.daytwenty_three;

/**
 * Created by lan_jia_nao on 2020/2/23.
 */
public class ColaEmployeeTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee(2500,"张三",2);
        /*System.out.println(salariedEmployee.getSalary(2));*/
        HourlyEmployee hourlyEmployee = new HourlyEmployee(20,161,"李四",2);
        /*System.out.println(hourlyEmployee.getSalary(5));*/
        SalesEmployee salesEmployee = new SalesEmployee(5000000,0.001,"王五",2);
        /*System.out.println(salesEmployee.getSalary(6));*/
        ColaEmployee[] colaEmployees ={salariedEmployee,hourlyEmployee,salesEmployee};
        for (ColaEmployee c :colaEmployees){
            System.out.println(c.getSalary(2));
        }
    }
}
