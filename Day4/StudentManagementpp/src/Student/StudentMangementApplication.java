package Student;

public class StudentMangementApplication {

	public static void main(String[] args) {
		
		System.out.println("Number of student registered are "+ Student.getCount());
		
		// Create a reference of student type
		Student s1,s2;
		System.out.println("Before");
		
		
		//System.out.println(s); Error
		//create object and assign to reference variable
		s1 = new Student("Sumit",10.45f);
		s2 = new Student("Shitij",45.55f);
		
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
		s2.display();
		
		Student s3 = new Student("Amaam", 76.98f);
//		s3.display();
		
		s1.display("=");
	}

}
