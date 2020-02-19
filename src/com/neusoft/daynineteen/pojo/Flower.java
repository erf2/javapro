package com.neusoft.daynineteen.pojo;

/**
 * Created by lan_jia_nao on 2020/2/19.
 */
public class Flower {
    private Integer id;
    private String name;
    private String color;
    private String weather;
    private Integer no;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Flower() {
    }

    public Flower(String name, String color, String weather, Integer no) {
        this.name = name;
        this.color = color;
        this.weather = weather;
        this.no = no;
    }

    public Flower(Integer id, String name, String color, String weather, Integer no) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.weather = weather;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weather='" + weather + '\'' +
                ", no=" + no +
                '}';
    }
}
