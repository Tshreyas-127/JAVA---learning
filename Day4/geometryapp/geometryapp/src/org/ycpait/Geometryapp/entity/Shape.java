package org.ycpait.Geometryapp.entity;

public abstract class Shape {

	protected String color;

	public Shape(String color) {
//		super();
//		System.out.println("In Shape(String color)");
		this.color = color;
	}

	public void draw() {

		System.out.println("Shape drawn using color " + this.color);
	}

	  public abstract float calculateArea();
	  public abstract float calculatePerimeter();
}
