package com.zsgc.dao;

import com.zsgc.pojo.Student;
import com.zsgc.util.ZSGCUtil;

import javax.rmi.CORBA.Util;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by lan_jia_nao on 2020/2/18.
 */
public class StudentDao implements IstudentDao{
    String url = "jdbc:mysql://192.168.13.131:3306/erf?useUnicode=true&characterEncoding=utf8";
    String username = "root";
    String password = "123456";

    @Override
    public List<Student> query() {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Student> list = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("select id,name,age,gender from student");
            rs = pstmt.executeQuery();
            while (rs.next()){
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setGender(rs.getInt("gender"));
                list.add(student);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if (rs!=null)
                    rs.close();
                if (pstmt!=null)
                    pstmt.close();
                if (con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public int add(Student student) {
        return ZSGCUtil.executeUpdate("insert into student(name,age,gender) values(?,?,?)",student.getName(),student.getAge(),student.getGender());
    }

    @Override
    public int update(Student student) {
        return ZSGCUtil.executeUpdate("update student set name=?,age=?,gender=? where id=?",student.getName(),student.getAge(),student.getGender(),student.getId());
    }

    @Override
    public int del(int id) {
        return ZSGCUtil.executeUpdate("delete from student where id=?",id);
    }

    @Override
    public Student queryOne(int id) {
        return null;
    }
}
