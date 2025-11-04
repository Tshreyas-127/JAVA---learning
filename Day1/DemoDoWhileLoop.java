class DemoDoWhileLoop{
	public static void main(String[] args)
 	{
 		
		int choice = 1 ; 
		
		do{
			System.out.println("Menu");
			System.out.println("1.Register");
			System.out.println("2.Find");
			System.out.println("3.FindAll");
			System.out.println("4.Delete");
			System.out.println("5.Update");
			System.out.println("-1.Exit");
			switch(choice)
		 	{
				case 1:
					System.out.println("1.Register");
					break;
				case 2:	
					System.out.println("2.Find");
					break;
				case 3:	
					System.out.println("3.FindAll");
					break;
				case 4:	
					System.out.println("4.Delete");
					break;
				case 5:	
					System.out.println("5.Update");
					break;
				case -1:
					break;
				default:
					System.out.println("Incorrect Value");
					break;		
			}
		}while(choice==1);
			System.out.println("Program Exit Successful");
	}

}