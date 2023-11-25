package test1;

public class Percen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countpercent("India is my country 100%");
		
	}

	static void countpercent(String s) {
		int i = 0;
		s = s.replace("\\s", "");
		int len = s.length();
		double uppercase = 0;
		double lowercase = 0;
		double digit = 0;
		double other = 0;
		while(i<len) {
			if (Character.isUpperCase(s.charAt(i))) 
				uppercase++;
			else if (Character.isLowerCase(s.charAt(i))) 
				lowercase++;
			else if (Character.isDigit(s.charAt(i))) 
				digit++;
			else
				other++;
			i++;
		}
		
			
		System.out.println("Following are the % of upper case, lower case, digit, and other characters :");
		System.out.println(("upper case - " + Math.round(uppercase / len * 100)) +  "%");
		System.out.println(("lower case - " + Math.round(lowercase / len * 100)) +  "%");
		System.out.println(("digit - " + Math.round(digit / len * 100)) +  "%");
		System.out.println(("other characters - " + Math.round(other / len * 100)) +  "%");
		
	}
	
}
