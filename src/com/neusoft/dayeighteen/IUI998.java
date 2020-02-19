package com.neusoft.dayeighteen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by lan_jia_nao on 2020/2/18.
 */
public class IUI998 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://192.168.13.131:3306/erf?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "123456";
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("insert into animal(id,name,holder)values(4,'天子','二飞')");
            int i = pstmt.executeUpdate();
            System.out.println(i);
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
    }
}
