package Student;
import java.util.Scanner;

public class StudentMangementApplication {

	public static void main(String[] args) {
		
		System.out.println("Number of student registered are "+ Student.getCount());
		
		// Create a reference of student type
		Student s1,s2;
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
		
		Student s=null;
//		s3.display();
		
		Student[] students = new Student[2];
//		System.out.println(students[0]);
//		System.out.println(students[1]);
		
		int indexcount=0;
		
//		s1.display("=");
		
		int choice = 0;

		do {
			System.out.println("Welcome to Student Management App:");
			System.out.println("==================================");
			System.out.println("1. Register new Employee");
			System.out.println("2. Display Details");
			System.out.println("-1. Exit");
			System.out.println("Enter your choice:");
			Scanner sc=new Scanner(System.in);
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				String name = sc.next();
				float marks = sc.nextFloat();
				
				
				if(indexcount != students.length) {
					students[indexcount]= new Student(name,marks);
					indexcount++;
				}
				else {
					System.err.println("Limit Exceeded");
				}
//				students[1]= new Student("Sumit", 94.88f);
				break;
			
			case 2: {
				if(indexcount == 0)
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
