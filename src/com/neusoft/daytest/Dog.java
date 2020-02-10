package com.neusoft.daytest;

/**
 * Created by lan_jia_nao on 2020/2/10.
 */
public class Dog extends Animal {
    public Dog(){
        super('公');
    }
    @Override
    public void run(){
        System.out.println("狗在跑");
    }
    /*private int age;
    private char sex;

    public void setAge(int age){
        if(age<0||age>50){
            this.age=1;
        }else{
            this.age=age;
        }
    }
    public int getAge(){
        return age;
    }
    public void setSex(char sex){
        if(sex !='公'&&sex !='母'){
            this.sex='公';
        }else{
            this.sex=sex;
        }
    }
    public char getSex(){
        return sex;
    }*/
}
