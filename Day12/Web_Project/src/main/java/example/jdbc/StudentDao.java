package example.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class StudentDao implements DaoInterface<Student, Integer>{
	
	public Collection<Student> getAll(){
/*		This method 
 */
		
		Collection<Student> allStudents = new ArrayList<>();
		
		String sqlQuery="SELECT student_name, student_city, student_id FROM students";
	
//			Try with resources
		try(
				Connection dbConnection = JdbcUtils.getConnection();
				Statement stmt = dbConnection.createStatement();
				ResultSet rs = stmt.executeQuery(sqlQuery)
				){
					while(rs.next()) {
						String name = rs.getString(1);
						String city = rs.getString(2);
						int id = rs.getInt(3);
						
//					Creating an object of student class based upon ID, Name, City
						Student studentsObj = new Student(id, name, city);
//					Adding the Student object intO students Collection: allStudents
						allStudents.add(studentsObj);
					}
					
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return allStudents;
	}

	
/*This method accepts an Integer value indicating Student ID
and returns the Student object matching with that ID*/

//If the ID is non-existing, it returns null.
	
	@Override
	public Student getOne(Integer student_id) {
		
		Student foundStudent = null;
		String sqlQuery="SELECT student_name, student_city, student_id FROM students WHERE student_id=?";//'?' for unknown values/user input;
		try(Connection dbConnection = JdbcUtils.getConnection();
				PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery);
				){
//		  Substituting student_id in place of '?'
			pstmt.setInt(1, student_id);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString(1);
				String city = rs.getString(2);
				int id = rs.getInt(3);
				foundStudent = new Student(id, name, city);
			}
		}catch(Exception e) {
				e.printStackTrace();
		}
		
		return foundStudent;	
	}

	
//	This methods accepts a Student object and stores it as a record into Students table
	@Override
	public void create(Student studentsObj) {
	
		String sqlQuery = "insert into students values(?,?,?)";
		
		try(Connection dbConnection = JdbcUtils.getConnection();
				PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery);
				){
//			fetching the values from student object
			int id =studentsObj.getStudent_id();
			String name = studentsObj.getStudent_name();
			String city = studentsObj.getStudent_city();
			
//			substituting values in places of '?'
			pstmt.setInt(1,id);
			pstmt.setString(2,name);
			pstmt.setString(3,city);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + " record inserted");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	
	
//  This methods receives modified state of the student object and reflects that state back to DB to complete the UPDATE operation
	@Override
	public void update(Student modifiedStudentObj) {
		
		String sqlQuery = "Update students set student_name = ?,student_city=? where student_id = ?";
		
		
		try(Connection dbConnection = JdbcUtils.getConnection();
				PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery);
				){
//			fetching the values from student object
			int id =modifiedStudentObj.getStudent_id();
			String name = modifiedStudentObj.getStudent_name();
			String city = modifiedStudentObj.getStudent_city();
			
//			substituting values in places of '?'
			pstmt.setString(1,name);
			pstmt.setString(2,city);
			pstmt.setInt(3,id);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + " record updated");
	
	}catch(Exception e) {
		e.printStackTrace();
	}
	}


	
	@Override
	public void deleteOne(Integer id){
		
		String sqlQuery = "delete from students where student_id = ? ";
		try(Connection dbConnection = JdbcUtils.getConnection();
				PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery);
				){
				pstmt.setInt(1,id);
				int count = pstmt.executeUpdate();
					if(count != 0) {
						System.out.println(count + "record deleted");
					}
				else {
						System.out.println("Student with given Id does not exist.");
				}	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}


	
