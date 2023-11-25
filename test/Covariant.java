package test;

public class Covariant extends A{
	/*A foo() {
		return this;
	}*/	
	Covariant fooanother() {
		return this;
	}
	void print() {
		System.out.println("print covariant");
		System.out.println(A.t);
	}
	static {
		System.out.println("static in child class");
	}
	public static void main(String[] args) {
		((Covariant)new Covariant().foo()).print();
		new Covariant().fooanother().print();
	}
}
class A {
	static final int t;
	final int a;
	
	A() {
		//t=33;
		a=20;
		System.out.println("super class");
	}
	static { t=55;
	
	System.out.println("Static in parent class");
	}
	final A foo() {
		return this;
	}
	A fooanother() {
		return this;
	}
}
