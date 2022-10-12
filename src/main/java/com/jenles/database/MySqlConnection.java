package com.jenles.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jenles.Status;

public class MySqlConnection {
	
	private Connection conn = null;
	private PreparedStatement preparedStatement;
	private Statement statement;
	private ResultSet resultSet;
	
	private Connection openConnection() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/jenles?user=root&password=jenles");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public ResultSet listTasks() {
		conn = openConnection();
		
		try {
			statement = conn.createStatement();
			
			resultSet = statement.executeQuery("SELECT * from task");	
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultSet;
	}
	
	public ResultSet registerTask(String title, String description, String assignee, Status status) {
		conn = openConnection();
		
		try {
			preparedStatement = conn.prepareStatement("INSERT INTO `task` (title, description, assignee, status) VALUES (?, ?, ?, ?)");
		
			preparedStatement.setString(1, title);
			preparedStatement.setString(2, description);
			preparedStatement.setString(3, assignee);
			preparedStatement.setString(4, status.toString());
			
			preparedStatement.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultSet;
	}
}