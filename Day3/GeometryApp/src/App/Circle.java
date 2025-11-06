package App;

public class Circle extends Shape{

		private float radius;
//		private String color;
		
		public Circle(float radius,String color){
			super(color);
			this.radius=radius;
//			this.color=color;	
		}

		public float getRadius() {
			return radius;
		}

		public void setRadius(float radius) {
			this.radius = radius;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
		
		public float calculateArea() {
			return 3.14f * this.radius * this.radius;
		}
		
		//overriden method
		@Override //built-in annotation to check if  overriding is appropriate
				  //it is recommended to annotation for overriding methods, not Mandate
		public void draw() {
//			draw(); //recursive calling
			super.draw();//To stop overriding 
			System.out.println("With radius "+ this.radius);
		};
		
	}
 

