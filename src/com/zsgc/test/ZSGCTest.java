package com.zsgc.test;

import com.zsgc.pojo.Student;
import com.zsgc.util.ZSGCUtil;
import com.zsgc.web.StudentWeb;

import java.util.List;
import java.util.Scanner;

/**
 * Created by lan_jia_nao on 2020/2/18.
 */
public class ZSGCTest {
    public static void main(String[] args) {
        /*StudentWeb studentWeb = new StudentWeb();
        studentWeb.showmain();
        studentWeb.input();*/
        List<Student> list = ZSGCUtil.execoteQuery("select id,name,age,gender from student",Student.class);
        System.out.println(list);
    }
}
