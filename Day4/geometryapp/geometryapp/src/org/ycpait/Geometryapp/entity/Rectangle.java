package org.ycpait.Geometryapp.entity;

public class Rectangle extends Shape {

	private float length;
	private float breadth;
//	private String color;

	public Rectangle(float length, float breadth, String color) {

		super(color);
		this.length = length;
		this.breadth= breadth;
//		this.color = color;
	}
	
	public float calculateArea() {
		
		return length*breadth;
	}     
	
	public float calculatePerimeter() {
		return 2 * (length + breadth);
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("with length "+this.length+" and breadth "+this.breadth);
	}
}
