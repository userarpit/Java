package Date;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Date currentDate = new Date();  
	        System.out.println("Current Date: "+currentDate);  
	  
	        String dateToStr = DateFormat.getInstance().format(currentDate);  
	        System.out.println("Date Format using getInstance(): "+dateToStr);  
	  
	        dateToStr = DateFormat.getDateInstance().format(currentDate);  
	        System.out.println("Date Format using getDateInstance(): "+dateToStr);  
	  
	        dateToStr = DateFormat.getTimeInstance().format(currentDate);  
	        System.out.println("Date Format using getTimeInstance(): "+dateToStr);  
	  
	        dateToStr = DateFormat.getDateTimeInstance().format(currentDate);  
	        System.out.println("Date Format using getDateTimeInstance(): "+dateToStr);  
	  
	        dateToStr = DateFormat.getTimeInstance(DateFormat.SHORT).format(currentDate);  
	        System.out.println("Date Format using getTimeInstance(DateFormat.SHORT): "+dateToStr);  
	  
	        dateToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);  
	        System.out.println("Date Format using getTimeInstance(DateFormat.MEDIUM): "+dateToStr);  
	          
	        dateToStr = DateFormat.getTimeInstance(DateFormat.LONG).format(currentDate);  
	        System.out.println("Date Format using getTimeInstance(DateFormat.LONG): "+dateToStr);  
	          
	        dateToStr = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM).format(currentDate);  
	        System.out.println("Date Format using getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT): "+dateToStr);  
	  
	        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
	        String strDate = formatter.format(currentDate);  
	        System.out.println("Date Format with MM/dd/yyyy : "+strDate);  
	      
	        formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
	        strDate = formatter.format(currentDate);  
	        System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);  
	      
	        formatter = new SimpleDateFormat("dd MMMM yyyy");  
	        strDate = formatter.format(currentDate);  
	        System.out.println("Date Format with dd MMMM yyyy : "+strDate);  
	      
	        formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");  
	        strDate = formatter.format(currentDate);  
	        System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);  
	      
	        formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
	        strDate = formatter.format(currentDate);  
	        System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);
	        System.out.println(formatter.toPattern());
	}

}
