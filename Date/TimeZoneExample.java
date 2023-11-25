package Date;

import java.util.TimeZone;

public class TimeZoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeZone tz = TimeZone.getDefault();
		System.out.println(tz);
		System.out.println(tz.getID());
		System.out.println(tz.getDisplayName());
		String[] str = TimeZone.getAvailableIDs();
		/*for(int i =230;i<=240;i++) {
			System.out.print(str[i] + ",");
		}*/
		System.out.println(tz.getID());
		System.out.println(tz.getOffset(1));
		
	}

}
