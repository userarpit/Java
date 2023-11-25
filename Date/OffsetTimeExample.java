package Date;

import java.time.OffsetTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class OffsetTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OffsetTime ot = OffsetTime.now();
		System.out.println(ot);
		System.out.println(ot.getHour());
		System.out.println(ot.getMinute());
		System.out.println(ot.getSecond());
		ValueRange r1 = ot.range(ChronoField.MINUTE_OF_DAY);
		System.out.println(r1);
		System.out.println(ot.toLocalTime());
		
		
	}

}
