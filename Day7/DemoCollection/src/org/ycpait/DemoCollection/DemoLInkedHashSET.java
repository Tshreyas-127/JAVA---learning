package org.ycpait.DemoCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DemoLInkedHashSET {

	public static void main(String[] args) {
		
		Set<String> cities ; 
		cities  = new LinkedHashSet<String>();//<> helps us to make or collection type safe.
		
		System.out.println(cities.size());
		
		cities.add("Mumbai");//adding elements at last
		cities.add("Pune");
		cities.add("Goa");
		cities.add("Mumbai");
//		cities.add(12);//boxing (primitive to wrapper)//when added generics it will show error
		
//		System.out.println("before" + cities);
//		Collections.sort(cities);//unordered
//		System.out.println("after" + cities);
//		
		
		System.out.println(cities.size());//number of elements
		System.out.println(cities);
		
//		cities.add(1,"delhi");//unsorted hence no index,hence errors
//		System.out.println(cities);
		
//		System.out.println(cities.size());//number of elements
//		System.out.println(cities.get(0));//unordered
		
		cities.remove(1);//removes element from given index
		System.out.println(cities);

		cities.clear();//clears all elements from array
		System.out.println(cities.size());//number of elements
		System.out.println(cities);

		
	}

}
