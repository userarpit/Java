package test1;

public class StringTest {
	public static void main(String[] args) {
		Short count =0;
		double valueof = 10.10000;
		char[] a = {'w','e','l','c','o','m','e'};
		String s = new String(a);
		String s1 = "welcome";
		String s2 = "Welcome to Java";
		String s3 = "  ";
		String s4 = "Java Language Java Lang";
		String s5 = "meow";
		String s6 = s5 + "bill";
		String s7 = "meowbill";
		String s8 = "meowbill";
		
		System.out.println(s);
		System.out.println(s.charAt(4));
		System.out.println(s.length());
		System.out.println(String.format("%s",s));
		System.out.println(s.substring(2, 4));
		System.out.println(s.concat(" to Java"));
		System.out.println(s.equals(s1));
		System.out.println(s == s1);
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s.contains("c"));
		System.out.println(s.indexOf("come"));
		System.out.println(s.endsWith("come"));
		System.out.println(s1.equalsIgnoreCase(s2));
		try {
		System.out.println(s.contains(null));	
		}
		catch(NullPointerException np) {}
		System.out.println(String.format("|%10d|", 100));
		byte[] barr = s.getBytes();
		for(byte b:barr) {
			System.out.print(b + " ");
		}
		char[] ch = new char[4];
		s2.getChars(11, 15, ch, 0);
		for(char c:ch) {
			System.out.print(c);
		}
		System.out.println();
		System.out.println(s2.indexOf("to",3));
		System.out.println(s.intern() == s1);
		System.out.println(s3.isEmpty());
		System.out.println(s3.isBlank());
		System.out.println(s3.trim().isEmpty());
		System.out.println(String.join("-", "arpit","khandelwal"));
		System.out.println(s2.charAt(1));
		for(int i=s2.length()-1;i>=0;i--) {
			System.out.print(s2.charAt(i));
			if((s2.charAt(i) == 'a') ||(s2.charAt(i) == 'e') ||(s2.charAt(i) == 'i') ||(s2.charAt(i) == 'o') ||
					(s2.charAt(i) == 'u')) {
				count++;
			}
		}
		System.out.println("");
		System.out.println("Total Vowel " + count);
		System.out.println(s4.replace("Java", "cobol"));
		String[] str = s4.split("\\s");
		for(String x:str)
			System.out.println(x);
		System.out.println("****");
		for(String q:s4.split("La",2))
			System.out.println(q);
		System.out.println("****");
		System.out.println(s4.substring(2, 3));
		char[] ch1 = new char[s4.length()];
		ch1 = s4.toCharArray();
		for(char c:ch1) {
			System.out.print(c);
		}
		System.out.println("----");
		System.out.println(String.valueOf(valueof) + 10);
		System.out.println(s5 == s6);
		System.out.println(s5 == s7);
		System.out.println(s6 == s7);
		System.out.println(s8 == s7);
	}
	
	
}
