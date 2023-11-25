package Date;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample {
	static LocalTime lt = LocalTime.now();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(lt);
		
		String europeanTimePattern = "hh:mm:ss SSS";
		DateTimeFormatter europeanTimeFormatter = DateTimeFormatter.ofPattern(europeanTimePattern);
		System.out.println(lt.format(europeanTimeFormatter));
		System.out.println(lt.minusHours(2));
		System.out.println(lt.minusMinutes(20));
		ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
	    ZoneId zone2 = ZoneId.of("Europe/London");  
	    LocalTime lt1 = LocalTime.now(zone1);
	    LocalTime lt2 = LocalTime.now(zone2);
	    
	    System.out.println("India - " + lt1);
	    System.out.println("Japan - " + lt2);
	}

}
