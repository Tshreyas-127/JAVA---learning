package org.ycpait.DemoCollection;

import java.util.Set;
import java.util.HashSet;

public class DemoHashSet {

	public static void main(String[] args) {
		
		Set<String> cities;
		cities = new HashSet<String>();
		cities.add("Mumbai");
		cities.add("Pune");
		System.out.println(cities);
		System.out.println(cities.size());
		cities.add("Mumbai");
		System.out.println(cities);
		System.out.println(cities.contains("Mumbai"));// returns boolean true or false;
		
		
//		System.out.println(cities);
//		cities.add(1,"Delhi");//unordered hence no index which is causing error
		
		cities.clear();
		
	}
	

}
