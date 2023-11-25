package exception;

public class NumberformatException {
	public static void main(String[] args) {
		String s = "abc";
		try {
			System.out.println(Integer.parseInt(s));
		}
		catch(NumberFormatException e) {
			System.out.println(s + " is String. can not be converted to integer");
		}
		
	}
}
