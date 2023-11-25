package test;

public class Fibonacci {
	
	public static void main(String[] args) {
		fib(10);
	}
	
    static void fib(int a) {
		int m=0;
		int n=1,k=0;
		System.out.print(m + " ");
		System.out.print(n + " ");
		for (int i=1;i<=a-2;i++) {
			k=m+n;
			System.out.print(k + " ");			
			m=n;
			n=k;
		}
		
	}
}
