package org.ycpait.DemoInterface;

interface Printable {

		void print();
		static void of() {}
		
		default void printFormat() {
			System.out.println("default printFormat");
		}
		
}
interface Drawable{
	//public static final int PX = 1;
	//static final int PX = 1;
	//public final int PX = 1;
	
	int PX = 1;// most recommended
	
	void draw();
	
}
class Circle implements Drawable, Printable{
	@Override
	public void draw() {
		
	}
	@Override
	public void print() {
		
	}
	
	public void printFormat() {}
}

class Main {
	public static void main(String[] args) {
		Drawable d;
		//d = new Drawable(); ERROR
	}

}