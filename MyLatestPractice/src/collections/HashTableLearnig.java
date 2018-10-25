package collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableLearnig {
	public static void main(String[]args){
		
		Hashtable <Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "Selenium");
		ht.put(2, "UFT");
		ht.put(3, "RFT");
		ht.put(4, "REST API");
		System.out.println(ht);		
		System.out.println(ht.get(2));		
		/*ht.remove(2);
		System.out.println(ht.get(2));*/
		
		System.out.println(ht.entrySet());
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		
		Enumeration<String> e = ht.elements();
		
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
	}
}
