package Date;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;
public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Year y = Year.of(2021);
		System.out.println(y);
		LocalDate ld = y.atDay(119);
		System.out.println("ld " + ld);
		System.out.println(y.length());
		
		// YearMonth
		YearMonth ym = YearMonth.now();
		System.out.println(ym);
		
		LocalDate ld1 = (LocalDate)ym.adjustInto(ld);
		System.out.println("ld1 " + ld1);
		System.out.println(y.plus(Period.ofYears(10)));
		System.out.println(ym.plus(Period.ofYears(10)));
		System.out.println(ym.atEndOfMonth());
		System.out.println(ym.withMonth(10));
		
		// Period
		Period p = Period.of(2000, 7, 12);
		System.out.println(p.addTo(ld));
		System.out.println(p.getYears());
		System.out.println(p.isZero());
		System.out.println(Period.between(ld, ld1));
		System.out.println(p.getChronology());
		System.out.println(p.getUnits());
		System.out.println(p.normalized());
		System.out.println(p.negated());
		
		//Instant
		Instant i = Instant.now();
		System.out.println("Instant " + i);
		System.out.println(i.minus(Period.ofDays(2)));
		System.out.println(i.isSupported(ChronoField.SECOND_OF_MINUTE));
		System.out.println(i.truncatedTo(ChronoUnit.MINUTES));
		
		//DayOfWeek
		LocalDate date = LocalDate.of(2022, Month.MAY, 9);  
		DayOfWeek dof = DayOfWeek.from(date);
		System.out.println(dof);
		System.out.println(dof.isSupported(ChronoField.DAY_OF_MONTH));
		System.out.println(dof.isSupported(ChronoField.DAY_OF_WEEK));
		System.out.println(dof.getValue());
		System.out.println(dof.name());
		
		//Month
		Month m = Month.valueOf("May".toUpperCase());
		System.out.println(m.getValue());
		System.out.println(m.length(true));
		System.out.println(m.maxLength());
		System.out.println(m.minLength());
		System.out.println(m.minus(2));
		System.out.println(m.plus(4));
		System.out.println(Month.of(10));
		System.out.println(m.plus(4).adjustInto(ld1));
		System.out.println(m.firstDayOfYear(false));
		System.out.println(m.minus(2).firstMonthOfQuarter());
		System.out.println(m.get(ChronoField.MONTH_OF_YEAR));
		
		Month[] m1 = m.values();
		for(Month m2 : m1) {
			System.out.print(m2 + ",");
		}
		System.out.println();
		Date d = Date.from(i);
		System.out.println(d);
		System.out.println(d.getTime());
		System.out.println(d.hashCode());
		System.out.println(d.getDay());
		
	}

}
