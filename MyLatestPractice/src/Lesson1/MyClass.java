package Lesson1;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

public class MyClass {
 public static void main (String []args) {
	 System.out.println(LocalDateTime.now());
	 System.out.println( new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()) );
	
	}
}
	


		
	
	


