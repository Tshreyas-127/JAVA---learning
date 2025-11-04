package Skippingzero;

public class Skippingzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1007;
		int skipNum = 0 ;
		int place=1;
		while(num>0) {
			
			int digit = num%10;
			if(digit != 0) {
				skipNum=skipNum+digit*place;
				place*=10;
		}
			
			num = num/10;
		}
		System.out.println(skipNum);
	}

}
