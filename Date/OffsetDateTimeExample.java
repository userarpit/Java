package Date;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;

public class OffsetDateTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OffsetDateTime odt = OffsetDateTime.now();
		System.out.println(odt);
		System.out.println(odt.getDayOfMonth());
		System.out.println(odt.getDayOfYear());
		System.out.println(odt.getHour());
		System.out.println(odt.getDayOfWeek());
		LocalDate ld = odt.toLocalDate();
		System.out.println(ld);
		System.out.println(odt.getMonthValue());
		//System.out.println(odt.getNano());
		System.out.println(odt.getOffset());
		System.out.println(odt.toEpochSecond());
		System.out.println(odt.truncatedTo(ChronoUnit.HOURS));
		
	}

}
