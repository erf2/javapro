package com.zsgc.dao;

import com.zsgc.pojo.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by lan_jia_nao on 2020/2/18.
 */
public class StudentDao implements IstudentDao{
    String url = "jdbc:mysql://192.168.13.131:3306/dbl?useUnicode=ture&characterEnconding=utf8";
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
        int i = 0;
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("insert into student(name,age,gender) values(?,?,?)");
            pstmt.setString(1,student.getName());
            pstmt.setInt(2,student.getAge());
            pstmt.setInt(3,student.getGender());
            i = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            try {
                if(pstmt!=null)
                    pstmt.close();
                if (con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override
    public int update(Student student) {
        int i = 0;
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("update student set name=?,age=?,gender=? where id=:");
            pstmt.setString(1,student.getName());
            pstmt.setInt(2,student.getAge());
            pstmt.setInt(3,student.getGender());
            pstmt.setInt(4,student.getId());
            i = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            try {
                if (pstmt!=null)
                    pstmt.close();
                if (con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override
    public int del(int id) {
        int i = 0;
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("delete from student where id=?");
            pstmt.setInt(1,id);
            i = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            try {
                if (pstmt!=null)
                    pstmt.close();
                if (con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override
    public Student queryOne(int id) {
        return null;
    }
}
