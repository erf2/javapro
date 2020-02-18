package com.zsgc.service;

import com.zsgc.dao.IstudentDao;
import com.zsgc.dao.StudentDao;
import com.zsgc.pojo.Student;

import java.util.List;

/**
 * Created by lan_jia_nao on 2020/2/18.
 */
public class StudentService implements IstudentService {
    IstudentDao studentDao = new StudentDao();
    @Override
    public List<Student> query() {
        return studentDao.query();
    }

    @Override
    public int add(Student student) {
        return studentDao.add(student);
    }

    @Override
    public int update(Student student) {
        return studentDao.update(student);
    }

    @Override
    public int del(int id) {
        return studentDao.del(id);
    }

    @Override
    public Student queryOne(int id) {
        return null;
    }
}
