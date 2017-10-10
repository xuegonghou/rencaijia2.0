package com.crm.Test.login;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/27.
 */
public class Data {
    String userpassword = null;
    String number = null;//账号
    String password = null;//密码
    List list;
    private static Connection getConn() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/rcj";
        String username = "root";
        String password = "root";
        Connection conn = null;
        try {
            Class.forName(driver); //classLoader,加载对应驱动
            conn = (Connection) DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public int insert(User student) {
        Connection conn = getConn();
        int i = 0;
        String sql = "insert into students (username,password) values(?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, student.getUsername());
            pstmt.setString(2, student.getPassword());
            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    static int update(User student) {
        Connection conn = getConn();
        int i = 0;
        String sql = "update students set Age='" + student.getPassword() + "',Sex='" + student.getUsername() + "' where Name='" + student.getPassword() + "'";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            i = pstmt.executeUpdate();
            System.out.println("resutl : " + i);
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    static int delete(String name) {
        Connection conn = getConn();
        int i = 0;
        String sql = "delete from students where Name='" + name + "'";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            i = pstmt.executeUpdate();
            System.out.println("resutl: " + i);
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public List getAll() {

        Connection conn = getConn();
       // String sql = "select * from students WHERE  id='" + ids + "'";
        String sql = "select * from students";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            list=new ArrayList<String>();
            while (rs.next()) {
                int id = rs.getInt(1);
                number = rs.getString(2);
                password = rs.getString(3);
                userpassword=number+","+password;
                list.add(userpassword);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return list;
    }
}
