package Demo;

public class DemoString {

	public static void main(String[] args) {
		
		String city = new String("Mumbai");
			
		System.out.println(city);// invokes toString() of String class
		System.out.println(city.length());
		System.out.println(city.charAt(0));
		System.out.println(city.equals("Mumbai"));
		System.out.println(city.equals("mumbai"));
		System.out.println(city.equalsIgnoreCase("mumbai"));
		System.out.println(city.substring(2));
		System.out.println(city.substring(0,5));//It print char between index 2 and 5,excluding 5.
		
		city.replace('M','P');
		
		String newcity = city.replace('M', 'P');
		System.out.println(newcity);
		
		System.out.println(city);
		
		String s = new String();
		
		

	}

}
