package ECS;

public class WageEmployee extends Employee{

	
		private int hours;
		private int rate;
		
		
		public WageEmployee(int hours, int rate, String name, double basicSalary) {
			super(name,basicSalary);
			this.hours=hours;
			this.rate=rate;
		}
		
		public  void showDetails() {
			super.showDetails();
			System.out.println();
			System.out.println("Wage of Employee per hour is: " + calculateSalary());
		}
		public double calculateSalary() {
			
			return basicSalary + hours*rate;

		}
		

	}


