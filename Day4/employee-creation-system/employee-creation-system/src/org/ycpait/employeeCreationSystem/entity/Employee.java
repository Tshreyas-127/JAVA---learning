package org.ycpait.employeeCreationSystem.entity;

public abstract class Employee {

	private static int count;
	
	private static int id;
	private String name;
	protected double basicSalary;
	
	public void showDetails() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.basicSalary);
	}
	public abstract double calculateSalary();
	 
	public Employee(String name,double basicSalary) {
		id++;
		this.id=id;
		this.name=name;
		this.basicSalary=basicSalary;
	}
	public static int getId() {
		return id;
	}
	
}
