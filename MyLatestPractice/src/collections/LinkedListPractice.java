package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {
	
	public static void main(String[] args){
		
		LinkedList lt = new LinkedList();
		lt.add(10);
		lt.add(20);
		lt.add(30);
		lt.add("Selenium");
		
		System.out.println(lt.size());
		 
		Iterator ir = lt.iterator();
		while(ir.hasNext()){
			System.out.println(ir.next());
		}
		
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Java");
		ll.add("Selenium");
		ll.add("Testing");
		ll.add("Core Java");
	
		System.out.println(ll.size());
		
		Iterator it2 = ll.iterator();
		
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		
		Employee emp1 = new Employee("Balu", 10056,"Hyderbad", 27, "Dev");
		Employee emp2 = new Employee("Sreelatha", 10058,"Chennai", 29, "Admin");
		Employee emp3 = new Employee("Kiran", 10060,"Bangalore", 30, "Automatio QA");
		
		LinkedList<Employee> lemp = new LinkedList<Employee>();
		lemp.add(emp1);
		lemp.add(emp2);
		lemp.add(emp3);
		
		Iterator it4 = lemp.iterator();
		
		while(it4.hasNext()){
			Employee e = (Employee) it4.next();
			System.out.println(e.empName);
			System.out.println(e.empNo);
			System.out.println(e.address);
			System.out.println(e.age);
			System.out.println(e.dept);
		}
		
	}

}
