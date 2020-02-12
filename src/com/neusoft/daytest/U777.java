package com.neusoft.daytest;

/**
 * Created by lan_jia_nao on 2020/2/12.
 */
public class U777 extends Teacher {
    private int age;
    private int Id;
    private String name;
    private String Grade;

    @Override
    public String toString() {
        return "U777{" +
                "age=" + age +
                ", Id=" + Id +
                ", name='" + name + '\'' +
                ", Grade='" + Grade + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    @Override
    public void method() {

    }
}
