package org.ycpait.demoException;

public class DemoManyCatches {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
			System.out.println(args[0]);
			System.out.println(1/0);
		}
//		catch(ArithmeticException e) {//can only handle Arithmetic exceptions
//			System.out.println("Cannot Divide by zero");
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("array index out of range");
//		}
//		catch(NullPointerException e) {
//			System.out.println("Cannot invoke method on null reference");
//		}
		catch(Exception e) {
			System.out.println("Generic");
		}
		System.out.println("After");
	}

}
