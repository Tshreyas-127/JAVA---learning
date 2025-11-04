package ECS;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		
//		Employee e1,e2;
		
//		e1 = new Employee("Shreyas", 50000.00);
//		e1.showDetails();
//		e1.calculateSalary();
//		System.out.println();
//		e2 = new Employee("Sumit", 60000.00);
//		e2.showDetails();
//		e2.calculateSalary();
		
		Employee e = null;
		Scanner sc = new Scanner(System.in);
		int choice=-1;
	do {
		System.out.println("Welcome");
		System.out.println("1.Register");
		System.out.println("2.Display Details");
		System.out.println("-1.Exit");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		
		switch(choice) {
		
			case 1:
				 e = new Employee("Shreyas",50000);
				break;
			
			case 2:
				if(e != null)
					e.showDetails();
				break;	
			case 3:
				System.out.println("Exited");
				choice=-1;
				System.out.println("Thankyou visit again");
				break;
			default :
				System.out.println("Thankyou visit again");
		}
	}while(choice!=-1);
		
		
		
	}

}
