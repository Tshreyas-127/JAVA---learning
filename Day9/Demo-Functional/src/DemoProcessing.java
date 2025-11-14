import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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
		
		cities.forEach(str-> System.out.println(str));//declarative programming
		
		
		
		
		//1.Create new list using existing list
		//imperative style of programming 
		List<String> newCities = new ArrayList<String>();
		
		for(String s : cities) {
			if(s.startsWith("M"))
					newCities.add(s);
		}
		System.out.println(newCities);
		
		//USING STREAM
		Stream<String> streamCities = cities.stream();
		Stream<String> filteredStream = streamCities.filter(c-> c.startsWith("M"));// filter accepts predicate lambda
		List<String> li = filteredStream.toList();// toList is the method of stream
		
		System.out.println(li);
		
		//SIMPLE WAY
		newCities = cities.stream()
							.filter(c-> c.startsWith("M"))
							.toList();
		System.out.println(newCities);
		
		
		
		
		
		//2.Create a new list from cities list which stores length of each city
		List<Integer> citiesLength = new ArrayList<Integer>();
		
		for (String city : cities) {
				citiesLength.add(city.length());
		}
		
		//USING STREAM
		//WITH PREDICATE
		streamCities = cities.stream();
		Stream<Integer> lengthStream = streamCities.map(s-> s.length());
		citiesLength = lengthStream.toList();
		System.out.println(citiesLength);
		
		//SimpleWay
		citiesLength = cities.stream()
							 .map(s-> s.length())
							 .toList();
		System.out.println(citiesLength);
				
		
		
		
		//prints cities with length greater than 5.
		//WITH FUCNTION
		Stream<String> streamCitieslength = cities.stream();
		Stream<String> filteredStreamLength = streamCitieslength.filter(l->l.length()>=5);
		List<String> lilength = filteredStreamLength.toList();
		
		System.out.println("length ====>" + lilength);
		System.out.println(citiesLength);
		
		//SimpleWay
		
		lilength = cities.stream()
						 .filter(l->l.length()>=5)
						 .toList();
		System.out.println(citiesLength);
	}

}
