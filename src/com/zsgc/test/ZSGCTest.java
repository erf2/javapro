package com.zsgc.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.zsgc.pojo.Student;
import com.zsgc.pojo.User;
import com.zsgc.util.ZSGCUtil;
import com.zsgc.web.StudentWeb;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lan_jia_nao on 2020/2/18.
 */
public class ZSGCTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        /*StudentWeb studentWeb = new StudentWeb();
        studentWeb.showmain();
        studentWeb.input();*/
        /*List<Student> list = ZSGCUtil.execoteQuery("select id,name,age,gender from student",Student.class);
        System.out.println(list);*/
        User user = ZSGCUtil.queryOne("select id,login_id,login_name,password from user where login_id = ?",User.class,"002");
        System.out.println(user);
    }
}
