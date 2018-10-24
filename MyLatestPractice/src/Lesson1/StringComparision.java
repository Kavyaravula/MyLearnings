package Lesson1;

public class StringComparision {
	public static void main(String[] args){
		
		String[] s1 ={"anil", "kavya","satish","balu"};
		String[] s2= {"anil", "kavya","satish","balu"};
		
		if (s1.length==s2.length){
			for (int i = 0; i<s1.length; i++){
				boolean found= false;
				for (int j= 0; j<s2.length; j++){
					if (s1[i].contentEquals(s2[j])){
						System.out.println(s1[i]+ "Exists");
					found = true;
						break;
					}
				}
					
				if(found) {
	               System.out.println("equal");
	        } 
				else {
	               System.out.println("not equal");                                             
	        }
					}
		}
		
		else{
			System.out.println("Given Strings are not equal");
		}
		
	

}
}
