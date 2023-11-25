package Date;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class CurrentDateTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LocalTime.now());
		System.out.println(LocalDate.now());
		System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now()));  
	}

}
