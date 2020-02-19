package com.neusoft.daynineteen.FlowerDao;

import com.neusoft.daynineteen.pojo.Flower;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lan_jia_nao on 2020/2/19.
 */
public class FlowerDao implements IflowerDao {
    String url = "jdbc:mysql://192.168.13.131:3306/erf?useUnicode=true&characterEncoding=utf8";
    String username = "root";
    String password ="123456";
    @Override
    public List<Flower> query() {
        List<Flower> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("select id,name,color,weather,no from flower");
            rs = pstmt.executeQuery();
            while (rs.next()){
                Flower flower = new Flower();
                flower.setId(rs.getInt("id"));
                flower.setName(rs.getString("name"));
                flower.setColor(rs.getString("color"));
                flower.setWeather(rs.getString("weather"));
                flower.setNo(rs.getInt("no"));
                list.add(flower);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
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
    public int buy(Flower flower) {
        int i = 0;
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("insert into flower(name,color,weather,no)values(?,?,?,?)");
            pstmt.setString(1,flower.getName());
            pstmt.setString(2,flower.getColor());
            pstmt.setString(3,flower.getWeather());
            pstmt.setInt(4,flower.getNo());
            i = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
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
    public int sell(int id) {
        int i = 0;
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("delete from flower where id=?");
            pstmt.setInt(1,id);
            i = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
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
    public int exchange(Flower flower) {
        int i = 0;
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("update flower set name=?,color=?,weather=?,no=? where id=?");
            pstmt.setInt(5,flower.getId());
            pstmt.setString(1,flower.getName());
            pstmt.setString(2,flower.getColor());
            pstmt.setString(3,flower.getWeather());
            pstmt.setInt(4,flower.getNo());
            i = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
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
    public void quit() {

    }
}
