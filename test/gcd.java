package test;

public class gcd {
	public static void main(String[] args) {
		int a = getgcd(12,2);
		System.out.println("GCD is " + a);
	}
	
	static int getgcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return getgcd(b , a % b);
	}
}
