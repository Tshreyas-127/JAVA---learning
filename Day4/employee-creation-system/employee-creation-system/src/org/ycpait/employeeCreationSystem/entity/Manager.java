package org.ycpait.employeeCreationSystem.entity;

public class Manager extends Employee{

	int incentives;
	public Manager(String name, double basicSalary) {
		super(name, basicSalary);
		
	}
	
	@Override
	public double calculateSalary() {
		
		this.incentives=incentives;
		return basicSalary+this.incentives;
	}

}
