package org.ycpait.DemoCollection;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class DemoVector {

	public static void main(String[] args) {
		
		List<String> cities ; 
		cities  = new Vector<String>();//<> helps us to make or collection type safe.
		
		System.out.println(cities.size());
		
		cities.add("Mumbai");//adding elements at last
		cities.add("Pune");
		cities.add("Goa");
		cities.add("Mumbai");
//		cities.add(12);//boxing (primitive to wrapper)//when added generics it will show error
		
		System.out.println("before" + cities);
		Collections.sort(cities);
		System.out.println("after" + cities);
		
		
		System.out.println(cities.size());//number of elements
		System.out.println(cities);
		
		cities.add(1,"delhi");//adding at given index
		System.out.println(cities);
		
		System.out.println(cities.size());//number of elements
		System.out.println(cities.get(0));
		
		cities.remove(1);//removes element from given index
		System.out.println(cities);

		cities.clear();//clears all elements from array
		System.out.println(cities.size());//number of elements
		System.out.println(cities);
		

	}

}
