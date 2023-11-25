package test;

public class Overload {
	static int a = 10;
	public int b = 10;
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	protected void msg(){System.out.println("Hello");}  
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	Overload() {
		
	}
	
	private Overload(int a, int b){
		Overload.a = a;
		this.b = b;
	}
	
	
	public static void main(String[] args) {
		System.out.println(Overload.sum(10, 20));
		System.out.println(Overload.sum(10, 20, 30));
		Overload o = new Overload(100,20);
		System.out.println("sum = " + (Overload.a + o.b));
		System.out.println(Overload.a);
		
		System.out.println(o instanceof Overload);
		String s = null;
		System.out.println(s instanceof String);
	}
}