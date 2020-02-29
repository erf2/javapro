package com.zsgc.util;

import java.io.File;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lan_jia_nao on 2020/2/19.
 */
public class ZSGCUtil {
    private static final String URL = "jdbc:mysql://192.168.13.131:3306/erf?useUnicode=true&characterEncoding=utf8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static Connection getconnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static int executeUpdate(String sql, Object... params) {
        Connection con = getconnection();
        PreparedStatement pstmt = null;
        int result = 0;
        try {
            pstmt = con.prepareStatement(sql);
            if (params != null) {
                for (int i = 0; i < params.length; i++) {
                    pstmt.setObject(i + 1, params[i]);
                }
            }
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    public static <T> List<T> execoteQuery(String sql, Class<T> clz) {
        List<T> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                T t = clz.newInstance();
                Field[] fields = clz.getDeclaredFields();
                for (Field f : fields) {
                    String column = f.getName();
                    if (f.isAnnotationPresent(Column.class)){
                        Column c = f.getAnnotation(Column.class);
                        column = c.value();
                    }
                    Object value = rs.getObject(column);
                    f.setAccessible(true);
                    f.set(t, value);
                }
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return list;
    }

    public static <T> T queryOne(String sql,Class<T> clz,Object... params){
        T t = null;
        Connection con = getconnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = con.prepareStatement(sql);
            if (pstmt != null) {
                for (int i = 0; i < params.length; i++) {
                    pstmt.setObject(i + 1, params[i]);
                }
            }
            rs = pstmt.executeQuery();
            if (rs.next()) {
                t = clz.newInstance();
                Field[] fields = clz.getDeclaredFields();
                for (Field f : fields) {
                    String column = f.getName();
                    if (f.isAnnotationPresent(Column.class)){
                        Column c = f.getAnnotation(Column.class);
                        column = c.value();
                    }
                    Object value = rs.getObject(column);
                    f.setAccessible(true);
                    f.set(t, value);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return t;
    }

    static void close(Connection con, PreparedStatement pstmt) {
        try {
            if (pstmt != null)
                pstmt.close();
            if (con != null)
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
        try {
            if (rs != null)
                rs.close();
            close(con, pstmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
