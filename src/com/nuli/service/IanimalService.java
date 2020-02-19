package com.nuli.service;

import com.nuli.pojo.Animal;

import java.util.List;

/**
 * Created by lan_jia_nao on 2020/2/19.
 */
public interface IanimalService {
    List<Animal> query();
    int add(Animal animal);
    int del(int id);
    int update(Animal animal);
    Animal queryOne(int id);
}
