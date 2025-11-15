package org.ycpait.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataRetrivelMain {

	public static void main(String[] args) {
		//Program to retrieve data from database using SELECT query and display it.
		//step1:Load the Driver
		String driverClass="com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driverClass);
			System.out.println("Driver Loaded...");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}	
	
		
		//step2: Establish Connection
		String connectionUrl="jdbc:mysql://localhost:3306/cdac?useSSL=false";
		String userId = "root";
		String password = "root";
		Connection dbConnection = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			dbConnection = DriverManager.getConnection(connectionUrl, userId, password);
			System.out.println("Connection Established to DB");
			
			
			//step3. Obtain some Statement
			stmt = dbConnection.createStatement();
			
			//step4. Execute SQL Query
			String sqlQuery="SELECT student_name, student_city, student_id FROM students";
			rs = stmt.executeQuery(sqlQuery);
			
			
			//step5. Perform navigation on ResultSet 
			while(rs.next()) {
			String name = rs.getString(1);
			String city = rs.getString(2);
			int id = rs.getInt(3);
			
			System.out.println(id+" "+name+" "+city);
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		try {
			rs.close();
			stmt.close();
			dbConnection.close();		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
