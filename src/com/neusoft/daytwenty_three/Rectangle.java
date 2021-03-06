package com.neusoft.daytwenty_three;

/**
 * Created by lan_jia_nao on 2020/2/23.
 */
public class Rectangle extends Shape {
    private Integer width;
    private Integer height;
    public Rectangle(int width,int height,String color){
        super(color);
        this.width=width;
        this.height=height;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPer() {
        return (width+height)*2;
    }

    @Override
    public void showAll() {
        System.out.println("矩形面积："+getArea());
        System.out.println("矩形周长："+getPer());
        System.out.println("矩形颜色："+getColor());
    }
}
