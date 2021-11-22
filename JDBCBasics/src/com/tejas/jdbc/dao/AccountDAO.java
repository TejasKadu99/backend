package com.tejas.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccountDAO {

public static void main (String[] args)
{
	try {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "root");
	System.out.println(connection);
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
