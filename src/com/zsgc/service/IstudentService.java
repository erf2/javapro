package com.zsgc.service;

import com.zsgc.pojo.Student;

import java.util.List;

/**
 * Created by lan_jia_nao on 2020/2/18.
 */
public interface IstudentService {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int del(int id);
    Student queryOne(int id);
}
