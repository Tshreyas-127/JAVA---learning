package org.ycpait.employeeCreationSystem;

import org.ycpait.employeeCreationSystem.entity.Manager;
import org.ycpait.employeeCreationSystem.entity.WageEmployee;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		int choice;
//		Employee e = null;
		WageEmployee e=new WageEmployee("Suman",10000,2,5);
		
		e.showDetails();
		
         Manager m = new Manager("Sumit", 20000);       
         
         m.showDetails();
		
		
//		do {
//			
//			System.out.println("Welcome to EMS:");
//			System.out.println("============================");
//			System.out.println("1. Register new Employee");
//			System.out.println("2. Display Details");
//			System.out.println("-1. Exit");
//			System.out.println("Enter your choice:");
//			Scanner sc=new Scanner(System.in);
//			choice = sc.nextInt();
//			
//			switch (choice) {
//			case 1: {
//				e = new Employee("Suman",10000);
//				break;
//			}
//			case 2: {
//				if(e!=null)
//					e.showDetails();
//				break;
//			}
//			case -1: {
//				
//				break;
//			}
//			default:
//				System.out.println("Select correct choice");
//				break;
//			}
//		} while (choice!=-1);
//			System.out.println("Program Exit Successful");
	}
}
