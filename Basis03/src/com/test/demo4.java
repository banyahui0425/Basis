package com.test;

import java.sql.*;

/**
 * @Creater banyahui
 * @Date 2019/11/25 下午 21:52
 * @Description jdbc
 */
public class demo4 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jemp?serverTimezone=GMT", "jemp", "jemp");
        PreparedStatement sta = con.prepareStatement("select * from user");
        ResultSet resultSet = sta.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            System.out.println("id = " + id);
            String name = resultSet.getString(2);
            System.out.println("name = " + name);
            int age = resultSet.getInt(3);
            System.out.println("age = " + age);
        }
    }
}
