package App;

public class Shape {

		protected String color;
		
		public Shape(String color) {
			super();
			this.color=color;
		}
		
		public void draw() {
			System.out.println("Shape drawn using color: " + this.color);
			
		}

	

}
