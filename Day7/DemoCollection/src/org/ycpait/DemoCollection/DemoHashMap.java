package org.ycpait.DemoCollection;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {
		
		Map<Integer, String> cities;
		cities = new HashMap<Integer, String>();
		
		cities.put(22, "Mumbai");
		cities.put(11, "Delhi");
		System.out.println(cities);
		System.out.println(cities.size());
		System.out.println(cities.get(22));
		System.out.println(cities.containsKey(11));
		System.out.println(cities.containsKey("Mumbai"));
		
		//duplicate key is not allowed
		cities.put(11, "Bangalore");
		System.out.println(cities);
		
		//duplicate value is allowed
		cities.put(20, "Mumbai");
		System.out.println(cities);
		
		cities.remove(22);
		System.out.println(cities);

		cities.clear();
	}
}
