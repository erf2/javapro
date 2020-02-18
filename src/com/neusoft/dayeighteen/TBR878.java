package com.neusoft.dayeighteen;


import java.sql.*;

/**
 * Created by lan_jia_nao on 2020/2/18.
 */
public class TBR878 {
    public static void method() {
        String url="jdbc:mysql://192.168.xxx.xxxx:3306/xxx?useUnicode=ture&characterEncoding=utf8";
        String username="root";
        String password="xxxxxxxx";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement pstmt = con.prepareStatement("");
            int i = pstmt.executeUpdate();
            System.out.println(i);
            ResultSet rs = pstmt.executeQuery();
            System.out.println(rs);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
