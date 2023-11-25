package test;

interface X{
	void a();
	void b();
}

abstract class B implements X{
	public void a() {
		System.out.println("i am a");
	}
}

class C extends B{
	public void b() {
		System.out.println("i am b");
	}
}
public class Test {
	public static void main(String[] args) {
		X a1 = new C();
		a1.a();
		a1.b();
	}
}