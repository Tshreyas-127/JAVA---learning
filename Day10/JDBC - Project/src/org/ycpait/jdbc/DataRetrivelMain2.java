package org.ycpait.jdbc;

import java.util.Collection;

public class DataRetrivelMain2 {

	//This is a improved version of the main program
	public static void main(String[] args) {
		
		DaoInterface<Student, Integer> daoRef = new StudentDao();
		Collection<Student> allStudents = daoRef.getAll();

		
		
//		Using For Loop:
//		for(Student st : allStudents) {
//			System.out.println(st);
//		}

		
		//Declarative approach
		//Using Lambda Expression:
		allStudents.stream()
				   .forEach(student -> System.out.println(student));	

	}

}
