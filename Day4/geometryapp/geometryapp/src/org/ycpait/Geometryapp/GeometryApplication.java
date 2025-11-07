package org.ycpait.Geometryapp;

import org.ycpait.Geometryapp.entity.Circle;
import org.ycpait.Geometryapp.entity.Rectangle;
import org.ycpait.Geometryapp.entity.Shape;

public class GeometryApplication {

	public static void main(String[] args) {

//		Circle c=new Circle(2,"Blue");
//		
//		System.out.println("Area of Circle is "+c.calculateArea());
//		c.draw();
		
//		Rectangle r= new Rectangle(2,3,"Red");
//		System.out.println("Area of Rectangle is "+r.calculateArea());
//		r.draw();
		//s = new Shape(); // error can't create a instatnce of class shape.
//		Shape s ;
//		Circle c= new Circle(5,"red");
//		s = c ;                         
//		System.out.println("Area of circle is "+ s.calculateArea());
//		s.draw();
//		Circle c1 = (Circle)s;
//		System.out.println(c1.getPi());
		
		Shape s;
		s = new Circle(4,"red");
		
		//invoking Generalized methods
		System.out.println( s.calculateArea());
		System.out.println(s.calculatePerimeter());
		s.draw();
		//invoking specialized methods
		Circle c = (Circle)s;
		c.getPi();
		
		
		
		System.out.println();
//		
//		Shape r = new Rectangle(5,2,"green");
//		System.out.println("Area of Rectangle is "+r.calculateArea());
//		r.draw();
		
		Shape r ;
		r = new Rectangle(5,2,"green");
		r.calculateArea();
		r.calculatePerimeter();
		r.draw();
		
		Rectangle t = (Rectangle) r;
		  
		
	
	}

}
