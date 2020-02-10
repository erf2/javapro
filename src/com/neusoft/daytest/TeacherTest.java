package com.neusoft.daytest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lan_jia_nao on 2020/2/10.
 */
public class TeacherTest {
    public static List l(){
        List l = new ArrayList();
        l.add(98);
        l.add(54);
        l.add("jk");
        return l;
    }
    public static void main(String[] args) {
        List l =l();
        System.out.println(l);

    }
}
