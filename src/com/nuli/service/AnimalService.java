package com.nuli.service;

import com.nuli.dao.AnimalDao;
import com.nuli.dao.IanimalDao;
import com.nuli.pojo.Animal;

import java.util.List;

/**
 * Created by lan_jia_nao on 2020/2/19.
 */
public class AnimalService implements IanimalService{
    IanimalDao animalDao = new AnimalDao();
    @Override
    public List<Animal> query() {
        return animalDao.query();
    }

    @Override
    public int add(Animal animal) {
        return animalDao.add(animal);
    }

    @Override
    public int del(int id) {
        return animalDao.del(id);
    }

    @Override
    public int update(Animal animal) {
        return animalDao.update(animal);
    }

    @Override
    public Animal queryOne(int id) {
        return null;
    }
}
