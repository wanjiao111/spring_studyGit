package com.wan.JDBC;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class JdbcQuickStart {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotmaxx-dev", "root", "123456");
        //3.获取执行sql对象
        Statement statement = conn.createStatement();
        String sql="select*from hotmaxx_scms.hotmaxx_distribution_good";
        ResultSet resultSet = statement.executeQuery(sql);
        int anInt = resultSet.getInt(1);
        System.out.println(anInt);
        resultSet.close();
        statement.close();
        conn.close();

    }
}
