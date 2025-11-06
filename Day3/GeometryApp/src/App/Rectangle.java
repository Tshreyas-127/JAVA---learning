package App;

public class Rectangle extends Shape{

	
		
		private float length;
		private float breadth;
//		private String color;
		
		public Rectangle(float length,float breadth,String color) {
			super(color);
			this.length =length;
			this.breadth =breadth;
//			this.color =color;
		}


		public float getLength() {
			return length;
		}


		public void setLength(float length) {
			this.length = length;
		}


		public float getBreadth() {
			return breadth;
		}


		public void setBreadth(float breadth) {
			this.breadth = breadth;
		}


//		public String getColor() {
//			return color;
//		}
//
//
//		public void setColor(String color) {
//			this.color = color;
//		}
		
		
		public float calculateArea() {
			return length * breadth;
		}
		
		//overriden method
		
		public void draw() {
		  //draw(); //recursive calling
		   super.draw();//To stop overriding 
		   System.out.println("With length "+ this.length + " and breadth "+ this.breadth);
		};
		
		

	

}
