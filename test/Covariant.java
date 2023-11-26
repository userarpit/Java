package test;

public class Covariant extends A1{
	/*A foo() {
		return this;
	}*/	
	Covariant fooanother() {
		return this;
	}
	void print() {
		System.out.println("print covariant");
		System.out.println(A1.t);
	}
	static {
		System.out.println("static in child class");
	}
	public static void main(String[] args) {
		((Covariant)new Covariant().foo()).print();
		new Covariant().fooanother().print();
	}
}
class A1 {
	static final int t;
	final int a=10;
	
	A1() {
		//t=33;
//		a=20;
		System.out.println("super class");
	}
	static { t=55;
	
	System.out.println("Static in parent class");
	}
	final A1 foo() {
		return this;
	}
	A1 fooanother() {
		return this;
	}
}
