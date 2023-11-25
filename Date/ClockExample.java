package Date;

import java.time.Clock;
import java.time.Duration;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;

public class ClockExample {
	static ZoneId zone2 = ZoneId.of("Europe/London");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock c = Clock.systemDefaultZone();
		
		System.out.println(c.getZone());
		System.out.println(c.instant());
		System.out.println(Clock.systemUTC());
		
		System.out.println(Clock.system(zone2));
		System.out.println(c.hashCode());
		System.out.println(c.millis());
		Duration duration = Duration.parse("P1DT0H00M00.345000S");
		System.out.println(duration.getSeconds());
		List<TemporalUnit> l1 = duration.getUnits();
		for (TemporalUnit l : l1) {
			System.out.println(l);
		}
		 System.out.println("NANOS     : " + duration.get(ChronoUnit.NANOS));
	        System.out.println("SECONDS   : " + duration.get(ChronoUnit.SECONDS));
	}

}
