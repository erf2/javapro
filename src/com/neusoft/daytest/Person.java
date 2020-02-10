package com.neusoft.daytest;

/**
 * Created by lan_jia_nao on 2020/2/10.
 */
public class Person extends Animal {
    public Person(){
        super('男');
    }
    private int no;
    private char sex;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
    @Override
    public void run(){
        System.out.println("人在跑，打拳");
    }
    /*public static int add(int a,int b){
        int c=a+b;
        return c;
    }
    public static float add(float a,int b){
        float c=a+b;
        return c;
    }*/
    /*private int age;
    public int no;
    private char sex;*/
    /*public void add(int a,int b){
        int c=a+b;
        System.out.println(c);
}
    public void setAge(int age){
        if (age<0||age>130){
            this.age=1;
        }else{
            this.age=age;
        }
    }
    public int getAge(){
        return age;
    }
    public void  setSex(char sex){
        if(sex != '男'&& sex !='女'){
            System.out.println("输入错误");
        }else {
            this.sex = sex;
        }
    }
    public int getSex(){
        return sex;
    }*/

    /*public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0||age >130){
            this.age =1;
        }else{
            this.age = age;
        }
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        if (no<0){
            this.no =1;
        }else{
            this.no = no;
        }
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if(sex !='男'&& sex !='女'){
            System.out.println("输入错误");
        }else{
            this.sex = sex;
        }
    }*/
}
