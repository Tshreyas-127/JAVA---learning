package org.ycpait.jdbc;

import java.util.Collection;

public class DataInsertionMain {

	public static void main(String[] args) {
		
		DaoInterface<Student, Integer> daoRef = new StudentDao();
		Student std = new Student(6,"Sumit Dhamne","Kalyan");
		daoRef.create(std);
	}

}
