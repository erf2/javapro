package com.neusoft.daytest;

/**
 * Created by lan_jia_nao on 2020/2/10.
 */
public abstract class Animal {
    public Animal(char  sex){
        this.sex=sex;
    }
    private String name;
    private int age;
    private char sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void run();/*{
        System.out.println("动物在跑");
    }*/
}
