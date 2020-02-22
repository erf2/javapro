package com.neusoft.daytwenty_twe;

import java.io.File;

/**
 * Created by lan_jia_nao on 2020/2/22.
 */
public class Earth<T> {
    private Person person;
    private Animal animal;
    private Building building;
    private Metal metal;
    private Wood wood;
    private Water water;
    private File file;
    private Soil soil;
    private Yin yin;
    private Yang yang;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Metal getMetal() {
        return metal;
    }

    public void setMetal(Metal metal) {
        this.metal = metal;
    }

    public Wood getWood() {
        return wood;
    }

    public void setWood(Wood wood) {
        this.wood = wood;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Soil getSoil() {
        return soil;
    }

    public void setSoil(Soil soil) {
        this.soil = soil;
    }

    public Yin getYin() {
        return yin;
    }

    public void setYin(Yin yin) {
        this.yin = yin;
    }

    public Yang getYang() {
        return yang;
    }

    public void setYang(Yang yang) {
        this.yang = yang;
    }

    @Override
    public String toString() {
        return "Earth{" +
                "person=" + person +
                ", animal=" + animal +
                ", building=" + building +
                ", metal=" + metal +
                ", wood=" + wood +
                ", water=" + water +
                ", file=" + file +
                ", soil=" + soil +
                ", yin=" + yin +
                ", yang=" + yang +
                '}';
    }
}
