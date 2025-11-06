package ECS;

public class Manager extends Employee{

	private int incentives;
		
	public Manager(int incentives, String name, double basicSalary) {
		super(name,basicSalary);
		this.incentives=incentives;
	}
	
	
	@Override
	public void showDetails()
	{	super.showDetails();
		System.out.println("Salary with incentives "+ calculateSalary());
		System.out.println();
	}
	
	public double calculateSalary() { 
		return basicSalary + incentives;
	}

}
