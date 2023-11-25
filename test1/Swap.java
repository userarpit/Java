package test1;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(swap("Love You"));
	}

	static String swap(String s) {
		String afterswap = "";
		String[] s1 = s.split("\\s");
		int i = s1.length;
		while(--i>=0) {
			System.out.println(i);
			afterswap += s1[i] + " ";
			
		}
		afterswap.trim();
		
		
		
		String a = "love";
		String b = "you";
		
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length(), a.length());
		return a + " " + b ;
		
	}
}
