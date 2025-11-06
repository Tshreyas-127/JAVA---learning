package App;

public class GeometryApp {

	public static void main(String[] args) {
		//CIRCLE
		Circle c1 = new Circle(5.00f,"RED") ; 
		
		c1.draw();
		System.out.println(" Area of Circle is: " + c1.calculateArea());

		System.out.println();
		
		//RECTANGLE
		Rectangle r1 = new Rectangle(4.f,5.0f,"ORANGE");
		
		r1.draw();
		System.out.println("Area of rectangle is: " + r1.calculateArea() );
	}

}
