package com.nuli.dao;

import com.nuli.pojo.Animal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lan_jia_nao on 2020/2/19.
 */
public class AnimalDao implements IanimalDao {
    String url = "jdbc:mysql://192.168.13.131:3306/erf?useUnicode=true&characterEncoding=utf8";
    String username = "root";
    String password = "123456";
    @Override
    public List<Animal> query() {
        List<Animal> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("select id,name,holder from animal");
            rs = pstmt.executeQuery();
            while (rs.next()){
                Animal animal = new Animal();
                animal.setId(rs.getInt("id"));
                animal.setName(rs.getString("name"));
                animal.setHolder(rs.getString("holder"));
                list.add(animal);
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
    public int add(Animal animal) {
        int i = 0;
        List<Animal> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("insert into animal(name,holder) values(?,?)");
            pstmt.setString(1,animal.getName());
            pstmt.setString(2,animal.getHolder());
            i = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
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
        List<Animal> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("delete from animal where id=?");
            pstmt.setInt(1,id);
            i = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
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
    public int update(Animal animal) {
        int i = 0;
        List<Animal> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("update animal set name=?,holder=? where id=?");
            pstmt.setString(1,animal.getName());
            pstmt.setString(2,animal.getHolder());
            pstmt.setInt(3,animal.getId());
            i = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
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
    public Animal queryOne(int id) {
        return null;
    }
}
