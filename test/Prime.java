package test;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean prime = true;
		int n = 1993;
		int m = n/2;
		if (n==0||n==1)
			System.out.println(n + " is not prime number");
		for(int i=2;i<=m;i++) {
			if (n%i == 0) {
				System.out.println(n + " is not prime number, it is divisible by " + i);
				prime = false;
				break;
			}
		}
		if (prime)
		    System.out.println(n + " is prime number");
	}

}
