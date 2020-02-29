package com.zsgc.pojo;

import java.lang.reflect.Field;

/**
 * Created by lan_jia_nao on 2020/2/29.
 */
public class ClassTest {
    public static void main(String[] args) {
        Class cas = User.class;
        Field[] fields = cas.getDeclaredFields();
        for (Field f:fields){
            System.out.println(f.getName());
        }
    }
}
