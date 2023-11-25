package exception;

public class Divideby0 {
	public static void main(String[] args) {
	try { 
		check();	
	}
	catch(Exception e) {
		System.out.println("catch");
		e.printStackTrace();
	}
	try {
		System.out.println("before a");
		int a = 50/0;	
	}
	
	catch(ArithmeticException ae) {
		System.out.println(ae);
		
		System.exit(0);
	}
	catch(NullPointerException e) {
		System.out.println(e);
	}
	finally {
		System.out.println("finally always executed");
	}
	System.out.println("Processing continues");
	//System.out.print("Processing continues...1");
	}
	static void check() throws Exception{
		try {
			System.out.println("before b");
			int b = 50/0;	
		}
		
		catch(ArithmeticException ae) {
			System.out.println(ae);
			System.out.println("before c");
			int c = 50/0;
			System.exit(0);
		}
	}
}
