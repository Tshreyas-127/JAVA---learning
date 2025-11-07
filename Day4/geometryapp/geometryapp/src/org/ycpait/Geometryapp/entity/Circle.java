package org.ycpait.Geometryapp.entity;

public class Circle extends Shape{

	private float radius;
//	private String color;
	
//	public Circle() {
//		this.radius = 0.0f;
//		this.color = null;
//	}

	public Circle(float radius, String color) {
           
		super(color);
		this.radius = radius;
//		this.color = color;
	}
	
	public float calculateArea() {
		
		return 3.14f*radius*radius;
	} 

	@Override //built-in annotation to check if overriding is appropriate
			  //it is recommended to annotate for overriden methods NOT mandatory
	//Overriden Method
	public void draw() {
		super.draw();
		System.out.println("With radius :"+this.radius);
	}
	
	public float calculatePerimeter() {
		return 2 * 3.14f * radius;
	}
	
	public float getPi() {
		return 3.14f;
	}
}
