package org.ycpait.StudentMangementapp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.yacpait.StudentManagementapp.entity.Student;
import org.yacpait.StudentManagementapp.exception.StudentNotFoundException;

public class StudentMangementApplication {

	public static void main(String[] args) {
		
		// Create a reference of student type
//		Student s1,s2;
//		System.out.println("Before");
		
		
		//System.out.println(s); Error
		//create object and assign to reference variable
//		s1 = new Student("Sumit",10.45f);
//		s2 = new Student("Shitij",45.55f);
		
//		System.out.println(s);
		
//		System.out.println(s.rollNumber);
		
//		System.out.println(s.name);
//		System.out.println(s.marks);
		
//		s.rollNumber = -1;// to stop this we make sure rollNumber is not accessible outside class
//							// in which it is declared
//		
//		s.name = "Shreyas";
//		s.marks = 88.89f;
		
//		s1.accept(1, "Shreyas", 88.89f);
//		s1.display();// invoking display() method
//		System.out.println( );
//		s2.accept(2,"om", 92.99f);
//		s2.display();
		
//		Student s=null;
//		s3.display();
		
//		Student[] students = new Student[4];
		List<Student> students = new ArrayList<Student>();
		
//		System.out.println(students[0]);
//		System.out.println(students[1]);
		
		int indexcount=0;
		
//		s1.display("=");
		
		int choice = 0;

		do {
			System.out.println("Welcome to Student Management App:");
			System.out.println("==================================");
			System.out.println("Number of student registered are "+ Student.getCount());
			System.out.println("1. Register new Employee");
			System.out.println("2. Display Details");
			System.out.println("3. Search Student by RollNumber");
			System.out.println("4. Delete Student by RollNumber");
			System.out.println("5. Sorted list of students by marks: ");
			System.out.println("6. Sorted list of students by name: ");
			
			System.out.println("-1. Exit");
			System.out.println("Enter your choice:");
			Scanner sc=new Scanner(System.in);
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter name: ");
				String name = sc.next();
				System.out.println("Enter marks: ");
				float marks = sc.nextFloat();
				Student s= new Student(name,marks);
				students.add(s);
				break;
				
			case 2: {
				if(students.isEmpty())
					System.out.println("No Student Registered");
				
				else {
					System.out.println("\nRegister Student Details");
					System.out.println("==========================");
					for(Student stu: students) {
						if(stu!=null)
							stu.display();
					}
					System.out.println("==========================");
					System.out.println("Total Count ");
					
					break;
				}
			}
			case 3:
				System.out.println("Enter rollNumber: ");
				int r = sc.nextInt();
				
				boolean isFound = false;
				//searching student in array
				for(Student foundStu: students) {
					if(foundStu!=null) {
						//if student rollNumber from array is = accepted
						if(foundStu.getRollNumber() == r) {
							System.out.println(foundStu);
							isFound = true;
							break;
						}
					}
				}
				if(!isFound) {
					//generate Exception
					StudentNotFoundException e = new StudentNotFoundException("Student with RollNumber "+ r + " Not Found");
					try {
						throw e;
					}
					catch(StudentNotFoundException ex) {
						ex.printStackTrace();
					}
				}
				break;
			case 4: {
				System.err.println("Enter Roll Number: ");
				int d = sc.nextInt();
				boolean found = false;
				
				Iterator<Student> i = students.iterator();
				
				while(i.hasNext()) {
					Student del = i.next();
					
					if(del.getRollNumber() == d) {
						i.remove();
						found = true;
					}
				}
			}
			break;
			case 5:{
				Collections.sort(students);
				
				System.out.println("\nSorted List of students by marks: ");
				System.out.println("==========================");
				for(Student stu: students) {
					if(stu!=null)
						stu.display();
				}
				
			}
			break;
			case 6:{
				Collections.sort(students,(s1,s2)->s1.getName().compareTo(s2.getName()));
				
				System.out.println("\nSorted list of students by name: ");
				System.out.println("==========================");
				for(Student stu: students) {
					if(stu!=null)
						stu.display();
				}
			}
			break;
			case -1: {
				
				break;
			}
			default:
				System.out.println("Select correct choice");
				break;
			}
		}while(choice!=-1);
		System.out.println("Program Exit Successful");
	}

}
