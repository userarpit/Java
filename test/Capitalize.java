package test;
//import java.util.*;
public class Capitalize {
	public static void main(String[] args) {
		
		//captalize each word
		String capitalizestr = "";
		String[] words = "this is javapoint".split("\\s");
		
		for(String s:words) {
			String s1 = s.substring(0, 1);
			String s2 = s.substring(1);
			capitalizestr += s1.toUpperCase() + s2 + " ";
		}
		System.out.println(capitalizestr.trim());
		capitalizestr = capitalizestr.trim();
		
		//reverse
		StringBuffer sb = new StringBuffer(capitalizestr);
		System.out.println(sb.reverse());
		
		//toggle each word
		words = "this is javapoint".split("\\s");
		String toggle = "";
		for(String s:words) {
			String s1 = s.substring(0, 1);
			String s2 = s.substring(1);
			toggle += s1 + s2.toUpperCase() + " ";
		}
		System.out.println(toggle.trim());
		System.out.println(Integer.parseInt("123") + 12);
	//	Integer i1 = Integer.valueOf("123");
	}
	
}
