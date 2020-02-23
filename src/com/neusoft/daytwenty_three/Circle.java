package com.neusoft.daytwenty_three;

/**
 * Created by lan_jia_nao on 2020/2/23.
 */
public class Circle extends Shape {
    private Integer radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPer() {
        return 3.14 * 2 * radius;
    }

    @Override
    public void showAll() {
        System.out.println("圆面积：" + getArea());
        System.out.println("圆周长：" + getPer());
        System.out.println("圆颜色：" + getColor());
    }
}
