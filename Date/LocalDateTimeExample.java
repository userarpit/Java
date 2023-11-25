package Date;

import java.time.LocalDateTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		System.out.println(LocalDateTime.of(LocalDateExample.ld, LocalTimeExample.lt));
	}

}
