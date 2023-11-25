package test;

public class Parameterconstructor {
	int a;
	int b;
	Parameterconstructor(int a, int b) {
		this();
		this.a = a;
		this.b = b;
		
	}
	Parameterconstructor() {
		System.out.println("default constructor");
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		Parameterconstructor pc = new Parameterconstructor(6,2);
		System.out.println(Math.pow(pc.a, pc.b));
		System.out.println(pc);
	}
}
