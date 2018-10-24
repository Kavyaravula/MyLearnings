package collections;

public class PalindromeNumber {
	
	public static void main(String[] args){
		
		int num = 14041;
		int r, sum=0;
		
		while (num>0){
			r = num%10;
			sum= (sum*10)+r;
			num= num/10;	
		}
		
		System.out.println(sum);
		
		
	}

}
