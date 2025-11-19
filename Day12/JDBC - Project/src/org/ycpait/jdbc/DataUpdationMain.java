package org.ycpait.jdbc;

public class DataUpdationMain {

	public static void main(String[] args) {
		

		DaoInterface<Student, Integer> daoRef = new StudentDao();
		Student foundstudent = daoRef.getOne(5);
		if(foundstudent != null ) {
			foundstudent.setStudent_name("Sumit Dhamane");
			foundstudent.setStudent_city("kolhalpur");
			daoRef.update(foundstudent);
			
		}
		else
			System.out.println("Student with given ID does nit exist. ");
		
	}
}
