package conversion;

import Date.*;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConversionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "+200";
		try {
		System.out.println(Integer.parseInt(s)+100);
		System.out.println(s+100);
		System.out.println(Integer.valueOf(s));
		}
		catch(NumberFormatException e) {
			System.out.println("handle");
		}
		System.out.println("--------------");
		int i = 300;
		System.out.println(String.valueOf(i)+100);
		
		String s1 = "1234562332799";
		System.out.println(Long.parseLong(s1)+100);
		
		long l = 1234567890987L;
		System.out.println(Long.toString(l)+100);
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy");
		String sdate = "12-Mar-2022";
		try {
			System.out.println(format1.parse(sdate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat format2 = new SimpleDateFormat("E, dd-MMM-yyyy HH:mm:ss z");
		System.out.println(format2.format(date));
		
		String hello="hello";
		for(int j = 0;j<hello.length();j++) {
			System.out.print(hello.charAt(j));
		}
		System.out.println();
		char[] c1 = hello.toCharArray();
		for(int m = 0;m<c1.length;m++) {
			System.out.print(c1[m]);
		}
		System.out.println();
		System.out.println(String.valueOf(c1, 1, 2));
		
		Object o = hello;
		System.out.println(o.toString());
		
		Class c=null;
		try {
			c = Class.forName("Date.ClockExample");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c.getName());
		System.out.println(c.getSuperclass().getName());
		
		System.out.println(c.toString());
		Examples e = new Examples();
		
		System.out.println(e.toString());
		
		
		System.out.println("------------------");
		int i1 =200;
		long l1 = i;
		System.out.println("promotion " + l1);
		
		//Long.valueOf(i1);
		
		long l2 = 400003000;
		System.out.println((int)l2);
		
		Double d1 = new Double(10.4);
		System.out.println(d1.intValue());
		
		System.out.println("-------");
		char c2 = '2';
		System.out.println(Character.getNumericValue(c2));
		
		System.out.println("----");
		int i3 = 15;
		System.out.println(Character.forDigit(i3,16));
		
		String s4 = "true";
		String s5 = "ok";
		System.out.println(Boolean.parseBoolean(s4));
		System.out.println(Boolean.parseBoolean(s5));
		
		System.out.println(Boolean.valueOf(s4).toString());
		
		
		Timestamp ts = new Timestamp(date.getTime());
		System.out.println(ts);
		System.out.println(ts.getTime());
		Date date3 = new Date(ts.getTime());
		System.out.println(date3);
		
		System.out.println("----");
		String OctaString = "27";
		System.out.println(Integer.parseInt(OctaString, 8));
		
		System.out.println(Integer.toBinaryString(12));
	}

}
