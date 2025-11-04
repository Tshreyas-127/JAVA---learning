class PrimeNumber{
	public static void main(String[] args)
 	{
 		
		int number = 13 ; 
		int i = 1;

		boolean isPrime = true ; 
		while(i <= number){
			if(number%i==0){
				isPrime = false;
				break;
			}
			i++;
			
		}
		if (isPrime)
			System.out.println("Is Prime");
		else 						
			System.out.println("Not Prime");
	
			
	}

}