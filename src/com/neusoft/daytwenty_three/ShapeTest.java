package com.neusoft.daytwenty_three;

/**
 * Created by lan_jia_nao on 2020/2/23.
 */
public class ShapeTest {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(15,2,"red");
        rectangle.showAll();
        Shape circle = new Circle(2,"blue");
        circle.showAll();
    }
}
