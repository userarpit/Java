package Date;

import java.time.Month;
import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class MonthDayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthDay md = MonthDay.now();
		System.out.println(md);
		System.out.println(md.atYear(2022));
		System.out.println(md.getDayOfMonth());
		MonthDay md1 = MonthDay.of(11, 11);
		System.out.println(md.isBefore(md1));
		System.out.println(md.with(Month.DECEMBER));
		System.out.println(md.withDayOfMonth(20));
		
		
		ValueRange r1 = md.range(ChronoField.MONTH_OF_YEAR);  
	    System.out.println(r1);  
	    ValueRange r2 = md.range(ChronoField.DAY_OF_MONTH);  
	    System.out.println(r2); 
	}

}
