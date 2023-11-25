package Date;

import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class ZonedDateTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		System.out.println(zdt.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
		System.out.println(zdt.get(ChronoField.CLOCK_HOUR_OF_DAY));
		System.out.println(zdt.getZone());
		System.out.println(zdt.withZoneSameInstant(ClockExample.zone2));
		System.out.println(zdt.minus(2, ChronoUnit.HOURS));
		System.out.println(zdt.minus(Period.ofDays(11)));
	    System.out.println(ClockExample.zone2.getDisplayName(TextStyle.FULL, Locale.ROOT));  
	}

}
