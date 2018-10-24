package collections;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListDay2 {
	
	public static void main(String[]args){
	ArrayList ar= new ArrayList();
	ar.add(10);
	ar.add("Selenium");
	ar.add(1.2563);
	ar.add('K');
	
	System.out.println(ar.size());
	
	for (int i=0;i<ar.size();i++){
		
		System.out.println(ar.get(i));
	}
	
	Iterator it = ar.iterator();
	
	while(it.hasNext()){
		System.out.println(it.next());
	}
	
	}
	
	

}
