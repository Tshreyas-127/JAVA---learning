package org.yacpait.StudentManagementapp.entity;

import java.io.Serializable;
import java.util.Comparator;

public class Student implements Serializable, Comparable<Student> {
			
			private static int count;
			
	//Attributes or Instance variables 
			private int rollNumber;
			private String name;// name of inbuilt class should start with caps letter
			private float marks;
			
			public Student(String name, float marks){
//				System.out.println("==Parameterized Constructor==");
				count++;
				this.rollNumber=count;
				this.name=name;
				this.marks=marks;
			}
			
			
			public void setMarks(float marks){
				this.marks=marks;
			}
			public float getMarks() {
				return this.marks;
			}
			
			
			public void setName(String name){
				this.name=name;
			}
			public String getName() {
				return this.name;
			}
			
			
			
			
			
//			public Student(){
//				System.out.println("Non-Parameterized Constructor");
//				this.rollNumber=1;
//				this.name="sumit";
//				this.marks=96.00f;
//			}
			
			
			
			
			private static void setCount(int count) {
				Student.count = count;
			}

			public int getRollNumber() {
				return rollNumber;
			}
			public void setRollNumber(int rollNumber) {
				this.rollNumber = rollNumber;
			}
			
			
			
			public static int getCount() {
				return count;
			}
			void accept(int rollNumber, String name, float marks) {
				this.rollNumber=rollNumber;
				this.name=name;
				this.marks=marks;
			}
			//Instance method
			 public void display() {
				System.out.println(this.rollNumber);
				System.out.println(this.name);
				System.out.println(this.marks);
			}
			
			public void display(String format) {
				System.out.println("  "+"rollNumber"+ "\t" +"name" + "\t  " +"marks");
				for(int i = 1; i<=40 ; i++)
						System.out.print(format);
				
				System.out.println();
				System.out.println("\t"+this.rollNumber+ "\t" + this.name + "\t   " + this.marks);
			}
			
			
			@Override
			//overriden method 
			//this method should return String which is useful information 
			//about this object
			public String toString() {
				System.out.println("in toString");
				return this.rollNumber + " " + this.name + " " + this.marks;
			}


			@Override
			public int compareTo(Student o) {
				
				return (int) (marks-o.marks);
			}
//			@Override
//			public int compare(Student s1,Student s2) {
//				
//				return (int) (s1.compareTo(s2));
//			}//old traditional approach by implementing comparator. Instead use lambda function

}
 
