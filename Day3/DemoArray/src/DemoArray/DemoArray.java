package DemoArray;

public class DemoArray {

	public static void main(String[] args) {
		
		
		System.out.println(args[0]);//Exception.Ife we dont pass values to args array an exception 
		//is generated. 
		
		int[] numbers;
		
		numbers = new int[3];
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
//		numbers[3] = 40;// Exception: Index is not in the boundry.
		
//		way-1:
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
		
//		way2:
		float[] marks = new float[2];//declaration and instansiation(creation) together
		marks[0] = 89.99f;
		marks[1] = 76.99f;
		
		
//		way3:
		String[] subjects = {"java","spring"};// declaration and instantiation(creation) and assigning together
//		System.out.println(subjects[0]);
//		System.out.println(subjects[1]);
		
		//Basic for loop 
//		for(int i = 0; i < subjects.length ; i++) { // print using basic for loop
//			System.out.print(subjects[i]+" ");
//		};
		
		//Enhanced for loop	
//		for(String s: subjects) {
//			System.out.print(s+" ");
//		};
		
	}

}
