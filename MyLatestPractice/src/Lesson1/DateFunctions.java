package Lesson1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFunctions {
	
	public static void main(String[] args) throws ParseException{
		
		Date dt= new Date();
		SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MMM-dd");
		System.out.println(dt);
		System.out.println(sdf.format(dt));
		
		Date d1= sdf.parse("1989-Mar-15");
		Date d2= sdf.parse("1989-Oct-16");
		
		System.out.println(d1.compareTo(d2));
		
		
		
	}

}
