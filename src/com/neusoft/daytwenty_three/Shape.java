package com.neusoft.daytwenty_three;

/**
 * Created by lan_jia_nao on 2020/2/23.
 */
public abstract class Shape {
    private Integer area;
    private Integer per;
    private String color;

    public Shape(String color) {
        this.color=color;
    }

    public Shape(){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPer();

    public abstract void showAll();
}
