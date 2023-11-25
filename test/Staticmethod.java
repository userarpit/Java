package test;

public class Staticmethod {
	static int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticmethod.printName();
		//new Staticmethod().printName();
	}
	static void printName() {
		System.out.println("abc");
		a = 10;
		System.out.println(Staticmethod.a);
	}
	static {
		System.out.println("first statement to execute");
	}
} 
