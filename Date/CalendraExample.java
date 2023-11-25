package Date;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import AccessModifier.A;

public class CalendraExample extends GregorianCalendar{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalendraExample c = new CalendraExample();
	//	System.out.println(c);
		System.out.println(c.getTime());
	//	c.clear();
//		System.out.println(c);
		c.add(Calendar.YEAR, 2);
		
		System.out.println(c.getTime());
		CalendraExample c1 = (CalendraExample)c.clone();
		c1.set(Calendar.YEAR, 2014);
		if(c.after(c1)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
			
		System.out.println(c1);
		c1.clear(Calendar.MONTH);
		c1.clear(Calendar.HOUR);  
	    c1.clear(Calendar.MINUTE);  
	    c1.clear(Calendar.SECOND);
	    System.out.println(c1.isSet(SECOND));
		System.out.println("--------");
		System.out.println(c1);
		System.out.println(c1.compareTo(c));
		System.out.println(AccessModifier.A.getA());
		//c1.complete();
		//c1.computeFields();
		c1.computeTime();
		System.out.println("after complete");
		System.out.println(c1);
		System.out.println(c1.get(Calendar.YEAR));
		System.out.println(c1.get(Calendar.MONTH));
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));
		System.out.println(c1.getActualMaximum(Calendar.DAY_OF_YEAR));
		System.out.println(c1.getActualMinimum(Calendar.DAY_OF_MONTH));
		
		Set<String> s = Calendar.getAvailableCalendarTypes();
		/*s.forEach((s1) -> {System.out.println(s);});     
		System.out.println(s.size());
		*/
		for(Object s1 : s) {
			System.out.println(s1);
		}
			
		System.out.println(c.getDisplayName(Calendar.MONTH, LONG, Locale.US));
		Locale[] l = Calendar.getAvailableLocales();
		for(Locale l1 : l) { 
			System.out.println(l1 + " Country " + l1.getDisplayCountry());
		}
		
		System.out.println(c1.getCalendarType());
		System.out.println(c1.getGreatestMinimum(Calendar.MONTH));
		System.out.println(c1.getLeastMaximum(Calendar.MONTH));
		System.out.println(c1.getFirstDayOfWeek());
		System.out.println(c1.getMinimalDaysInFirstWeek());
		System.out.println(c1.getTimeInMillis());
		System.out.println(c1.getTimeZone());
		System.out.println(c1.getWeeksInWeekYear());
		System.out.println(c1.getWeekYear());
		System.out.println(c1.getTime());
		c1.set(Calendar.YEAR, 2022);
		System.out.println(c1.getTime());
		System.out.println(c1.getWeekYear());
		System.out.println(c1.internalGet(Calendar.DAY_OF_MONTH));
		System.out.println(c1.isLenient());
		System.out.println(c1.isSet(SECOND));
		System.out.println(c1.isWeekDateSupported());
		System.out.println(c1.getTime());
		c1.roll(YEAR, false);
		c1.roll(Calendar.DAY_OF_WEEK,true);
		c1.roll(MONTH, true);
		System.out.println(c1.getTime());
		c1.set(2022, 11, 31);
		System.out.println(c1.getTime());
		c1.setWeekDate(2024, 3, 1);
		System.out.println(c1.getTime());
		System.out.println(c1.toString());
	}

		
	}

