package org.ycpait.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class StudentDao implements DaoInterface<Student, Integer>{
	
public Collection<Student> getAll(){
	/*This method 
	 * */
	
	Collection<Student> allStudents = new ArrayList<>();
	
	String sqlQuery="SELECT student_name, student_city, student_id FROM students";

	try(
			Connection dbConnection = JdbcUtils.getConnection();
			Statement stmt = dbConnection.createStatement();
			ResultSet rs = stmt.executeQuery(sqlQuery)
			){
				while(rs.next()) {
					String name = rs.getString(1);
					String city = rs.getString(2);
					int id = rs.getInt(3);
					
				//Creating an object of student class based upon ID, Name, City
					Student studentsObj = new Student(id, name, city);
				//Adding the Student object intO students Collection: allStudents
					allStudents.add(studentsObj);
				}
				
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
	return allStudents;
}
	
}
