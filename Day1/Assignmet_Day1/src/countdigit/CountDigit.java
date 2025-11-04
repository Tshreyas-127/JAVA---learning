package countdigit;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num = 12321312;
			int count = 0 ; 
			  
			while(num>0) {
					int digit = num%10;
					count +=1;
					num = num/10;
			} 
			
			System.out.println(count);	

	}
}
