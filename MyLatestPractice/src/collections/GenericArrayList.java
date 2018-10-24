package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericArrayList {
	
	public static void main(String[]args){
		/*ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(15);
		ar1.add(20);
		ar1.add(30);
		
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(100);
		ar2.add(200);
		ar2.add(300);
		
		System.out.println("Array list 1 size is  "+ar1.size());
		
		System.out.println("Array list 2 size is  "+ar2.size());
		
		ar1.addAll(ar2);
		ar1.remove(5);
		System.out.println("After Adding ar2 into Ar1 "+ ar1.size());
		Iterator ir = ar1.iterator();
		
		while(ir.hasNext()){
			System.out.println(ir.next());
		}
		
		Iterator ir1 = ar2.iterator();
		while(ir1.hasNext()){
			System.out.println(ir1.next());
		}*/

		Employee e1 = new Employee("Satish", 1009, "Hyd", 29 , "QA");
		Employee e2 = new Employee("kavya", 1010, "Bangalore", 29 , "Dev");
		Employee e3 = new Employee("Test", 1011, "Chennai", 35 , "Admin");
		
		
		ArrayList<Employee> emp = new ArrayList<Employee> ();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		Iterator r3 = emp.iterator();
		while(r3.hasNext()){
			Employee ep =  (Employee) r3.next();
			
			System.out.println(ep.empName);
			System.out.println(ep.empNo);
			System.out.println(ep.address);
			System.out.println(ep.age);
			System.out.println(ep.dept);
		}
		
		
				
		
		
	}

}
