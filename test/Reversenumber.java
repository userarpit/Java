package test;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8374957;
		System.out.println(reverse(a));
	}

	static int reverse(int a)  {
		int b = a;
		int remainder;
		int reversenum = 0;
		while(b != 0) {
			
			remainder = b % 10;
			reversenum = reversenum * 10 + remainder;
			b /= 10;
			
		}
		return reversenum;
	}
}
