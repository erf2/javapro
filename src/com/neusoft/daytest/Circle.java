package com.neusoft.daytest;

/**
 * Created by lan_jia_nao on 2020/2/10.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(){}

    public Circle(double radius,String color){
        super(color);
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getPer() {
        return 3.14*2*radius;
    }

    @Override
    public void showAll() {
        System.out.println("圆面积="+getArea());
        System.out.println("圆周长="+getPer());
        System.out.println("圆颜色="+getColor());
    }
}
