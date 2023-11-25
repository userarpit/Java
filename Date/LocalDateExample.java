/**
 * 
 */
package Date;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @author HP
 *
 */
public class LocalDateExample {
	static LocalDate ld = LocalDate.now();
	/**
	 * 
	 */
	public LocalDateExample() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.out.println(ld);
	System.out.println(ld.atTime(10, 10));
	LocalDate ld1 = LocalDate.now().plusDays(10);
	System.out.println(ld1.compareTo(ld));
	System.out.println(ld1.equals(ld));
	//DateTimeFormatter dtf = new DateTimeFormatter
	System.out.println(LocalDate.of(2021,02,28));
	LocalDate ld2 = LocalDate.of(2020,02,28);
	
	String europeanDatePattern = "dd-MM-yyyy";
	DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
	System.out.println(ld.format(europeanDateFormatter));
	System.out.println(ld.isLeapYear());
	System.out.println(ld.minusDays(31));
	System.out.println(ld.minusMonths(2));
	System.out.println(ld.getDayOfMonth());
	System.out.println(ld.getDayOfWeek());
	System.out.println(ld.getDayOfYear());
	System.out.println(ld.getMonth());
	System.out.println(ld.getMonthValue());
	System.out.println(ld.getYear());
	System.out.println(ld.lengthOfMonth());
	System.out.println(ld2.lengthOfYear());
	System.out.println(LocalDate.ofYearDay(2022, 360));
	
	
	
	
	}

}
