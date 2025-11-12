import java.util.ArrayList;
import java.util.List;

public class DemoProcessing {

	public static void main(String[] args) {
		
		
		//Create a list and add 5 cities name in the list
		List<String> cities = new ArrayList<String>();
		
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Pune");
		cities.add("Mysore");
		cities.add("Manglore");
		
//		System.out.println(cities);
		
		cities.forEach(str-> System.out.println(str));
		
		
		
		
		//Create new list using existing list
		List<String> newCities = new ArrayList<String>();
		
		for (String s : cities) {
			if(s.startsWith("M"))
					newCities.add(s);
		}
		System.out.println(newCities);
		
		
		
		
		//Create a new list from cities list which stores length of each city
		
		List<Integer> citiesLength = new ArrayList<Integer>();
		
		for (String city : cities) {
				citiesLength.add(city.length());
		}
		System.out.println(citiesLength);
		

	}

}
