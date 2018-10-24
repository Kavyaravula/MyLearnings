package collections;

public class FbanacciSeries {
	
	public static void main(String[] args){
		
	
		int nextNumber=1;
		int previousNum =1;
		
		int lastnumber= 10;
		
		
			 
		for (int l=0; l<lastnumber; l++)
		{
			 
			System.out.println(nextNumber); 
			previousNum= previousNum+nextNumber; 
			nextNumber= previousNum- nextNumber;
			
		}
		
		
	}

}
