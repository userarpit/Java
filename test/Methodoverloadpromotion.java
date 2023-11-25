package test;

public class Methodoverloadpromotion {
	static void sum(int a, float b) {
		System.out.println("int " + (a + b));
	}
	
	static void sum(long a, long b) {
		System.out.println("long " + (a + b));
	}
	
	public static void main(String[] args) {
		Methodoverloadpromotion.sum(100000000,100000000f);
	}
}
