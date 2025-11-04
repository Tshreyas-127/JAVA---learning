class DemoConditionalConstructs1{
	public static void main(String[] args)
 	{
 	  	int age; //variable declaration
		age = 20; //assigning value
		char nationality = 'I' ;
	 
		if(age>18 && nationality == 'I'){
			System.out.println("Eligible for voting");
		}
		else{
			System.out.println("Not eligible for voting");
		}
	}
}