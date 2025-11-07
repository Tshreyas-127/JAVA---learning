package org.ycpait.employeeCreationSystem.entity;

public class WageEmployee extends Employee {

	int hours;
	int rate;
	
	public WageEmployee(String name, double basicSalary,int hours,int rate) {
		super(name, basicSalary);
		this.hours=hours;
		this.rate=rate;
		
	}
	
	@Override
	public double calculateSalary() {
		
		return basicSalary+this.hours*this.rate;
	}

	@Override
	public void showDetails() {
		
		System.out.println(this.basicSalary);
		calculateSalary();
	}
}
