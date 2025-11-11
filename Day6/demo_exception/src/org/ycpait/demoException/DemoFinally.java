package org.ycpait.demoException;

public class DemoFinally {

	public static void main(String[] args) {
		
		try {
			System.out.println("in try");
			System.out.println(1/1);
		}
		catch(Exception e) {
			System.out.println("in catch");
		}
		finally {
			System.out.println("in finally");
		}
	}

}
