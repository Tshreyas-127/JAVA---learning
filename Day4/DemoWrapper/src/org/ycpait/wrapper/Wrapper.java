package org.ycpait.wrapper;

public class Wrapper {

	public static void main(String[] args) {
		
		//primitive
		int i=3;

		//primitive to Wrapper
		
		//Integer iObj = new Integer(i); Since it is depricated
		
		// instead use this
		Integer iObj = i;//auto-boxing
		
		//wrapper to primitive
		int j = iObj.intValue();
		
		//String to wrapper
		Integer o = Integer.valueOf("77");
		
		//wrapper to String
		String str = o.toString();
		
		//String to primitive
		int p = Integer.parseInt("78");
		
		//primitive to String
		String data = o.toString(); 
		
		
		

	}

}
