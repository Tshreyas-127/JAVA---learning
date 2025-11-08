package org.ycpait.DemoInterface;

public class DemoLambda {

	public static void main(String[] args) {
		
		int a = 10;
		
//		Printable f = () ->{}//valid
		
//		Taxable t = (double income) -> { return income * 0.20;};//Valid method
//		Taxable t = (income) -> { return income * 0.20;};//Valid method 
//		Taxable t = income -> { return income * 0.20;};//valid method
		Taxable t = income -> income * 0.20;// valid method ***Recommended
		System.out.println(t.calculateTax(1000));
		
		
//		StringJoiner sj = (String s1, String s2) -> {return s1+s2;};//Valid
//		StringJoiner sj = (s1, s2) -> {return s1+s2;};//Valid
		StringJoiner sj = (s1, s2) -> s1+s2;//Valid ** recommended
		System.out.println(sj.join("Shreyas", " Tukrul"));
		
//		Searchable s = (String d) -> { return data==null;};//valid method
//		Searchable s = (d) -> { return data==null;};//valid method
//		Searchable s = d -> { return data==null;};//valid method
		Searchable s = data -> data!=null;//valid method
		
		Sizable l = (String name) -> { return name.length();};//valid
//		Sizable l = (n) -> { return s.length();};//valid
///		Sizable l = n -> {return s.length();};//valid
		Sizable l = n -> n.length();//valid
		
		
	}
}