package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapLearning {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Kavya");
		hm.put(2, "Satish");
		hm.put(3, "Anil");
		hm.put(4, "Swetha");
		System.out.println(hm);
		System.out.println(hm.get(2));
		System.out.println(hm.keySet());
		System.out.println(hm.values());

		for (Entry e : hm.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		Employee e1 = new Employee("Satish", 1009, "Hyd", 29 , "QA");
		Employee e2 = new Employee("kavya", 1010, "Bangalore", 29 , "Dev");
		Employee e3 = new Employee("Kumar", 1011, "Chennai", 35 , "Admin");
		
		HashMap<Integer, Employee> hm1= new HashMap<Integer, Employee>();
		hm1.put(1, e1);
		hm1.put(2, e2);
		hm1.put(3, e3);
		
		for (Entry<Integer, Employee> ehm1 : hm1.entrySet()){
			int key= ehm1.getKey();
			Employee e = ehm1.getValue();
			System.out.println("Employee  "+ key + " Info is :");
			System.out.println(e.empName +"  " + e.empNo  +"  " + e.address  +"  " +e.age  +"  " + e.dept);
			
		}
	}

}
