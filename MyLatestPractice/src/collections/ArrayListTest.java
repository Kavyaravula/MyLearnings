package collections;

import java.util.ArrayList;
import java.util.Iterator;

import com.gargoylesoftware.htmlunit.javascript.host.Symbol;

public class ArrayListTest {
	
	
	public static void main(String[] args) {
		
		ArrayList ar= new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add("Selenium");
		System.out.println(ar.size());
		
		
		System.out.println(ar);
		
		for (int i=0; i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("QTP");
		ar1.add("ALM");
		ar1.add("JIRA");
		ar1.add("QTP");
		
		for (int i=0; i< ar1.size(); i++){
			System.out.println(ar1.get(i));
		}
		
		
		System.out.println("Using an Iterator");
		
		Iterator<String> it = ar1.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		ArrayList<Integer> ar2= new ArrayList<Integer>();
		ar2.add(100);
		ar2.add(200);
		ar2.add(300);
		ar2.add(400);
		
		
		ArrayList<Integer> ar3= new ArrayList<Integer>();
		ar3.add(600);
		ar3.add(700);
		ar3.add(800);
		ar3.add(900);
		
		ar2.addAll(ar3);
		//ar2.retainAll(ar3);//only ar3 will retain
		ar2.remove(2);
		ar2.removeAll(ar3);
		ar2.add(1000);
		boolean f = ar2.contains(1000);
		System.out.println(f);
		for (int i=0;i<ar2.size();i++)
		{
			System.out.println(ar2.get(i));
		}
		
		//ArrayList<E>  emp = new ArrayList<E>();
		
		Employee e1 = new Employee("kavya", 1002, "Hyderabd", 25, "Automation QA");
		Employee e2 = new Employee("Satish", 1003, "Hyderabd", 26, "QA");
		Employee e3 = new Employee("Swetha", 1004, "Hyderabd", 27, "Dev");
		Employee e4 = new Employee("Anil", 1005, "Bangalore", 28, "Admin");
		
		
		ArrayList<Employee> aremp = new ArrayList<Employee>();
		aremp.add(e1);
		aremp.add(e2);
		aremp.add(e3);
		aremp.add(e4);
		
		
		
		Iterator <Employee> ir = aremp.iterator();
		while(ir.hasNext()){
			
			Employee ep = ir.next();
			System.out.println(ep.empName);
			System.out.println(ep.empNo);
			System.out.println(ep.address);
			System.out.println(ep.age);
			System.out.println(ep.dept);
			
		}
		
	}

	

}
