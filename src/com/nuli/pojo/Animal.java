package com.nuli.pojo;

/**
 * Created by lan_jia_nao on 2020/2/19.
 */
public class Animal {
    private Integer id;
    private String name;
    private String holder;

    public Animal() {
    }

    public Animal(String name, String holder) {
        this.name = name;
        this.holder = holder;
    }

    public Animal(Integer id, String name, String holder) {
        this.id = id;
        this.name = name;
        this.holder = holder;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", holder='" + holder + '\'' +
                '}';
    }
}
