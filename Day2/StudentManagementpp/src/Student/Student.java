package Student;

public class Student {
			
			private static int count;
			
	//Attributes or Instance variables 
			private int rollNumber;
			private String name;// name of inbuilt class should start with caps letter
			private float marks;
			
//			public Student(){
//				System.out.println("Non-Parameterized Constructor");
//				this.rollNumber=1;
//				this.name="sumit";
//				this.marks=96.00f;
//			}
			
			public Student(String name, float marks){
				System.out.println("==Parameterized Constructor==");
				count++;
				this.rollNumber=count;
				this.name=name;
				this.marks=marks;
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
			void display() {
				
				System.out.println(this.rollNumber);
				System.out.println(this.name);
				System.out.println(this.marks);
			}
			
			void display(String format) {
				System.out.println("  "+"rollNumber"+ "\t" +"name" + "\t  " +"marks");
				for(int i = 1; i<=40 ; i++)
						System.out.print(format);
				
				System.out.println();
				System.out.println("\t"+this.rollNumber+ "\t" + this.name + "\t   " + this.marks);
			}

}
 
