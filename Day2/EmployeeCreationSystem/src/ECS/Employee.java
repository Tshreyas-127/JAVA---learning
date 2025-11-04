package ECS;

public class Employee 
{
		private static int count;
		private int empId;
		private String name;
		private double basicSalary;
		
		public Employee(String name, double basicSalary) 
		{
			count++;
			this.empId=count;
			this.name=name;
			this.basicSalary=basicSalary;
		}
		
		public static int generateId() {
			return count;
		}
		
		public void showDetails()
		{
			System.out.println("EmpID= "+ this.empId);
			System.out.println("Name= "+ this.name);
			System.out.println("Salary1= "+ this.basicSalary);
			System.out.println();
			System.out.println("Salary after bonus= "+ calculateSalary());
			System.out.println();
		}
		
		public double calculateSalary() { 
			return basicSalary*2;
		}
		
		
		
	
	

}
