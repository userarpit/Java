package AccessModifier;

public class A {
	protected static int a=10;
	// declaring a protected method m1()
	protected void m1() { System.out.println("GFG - A"); }
	public static int getA() {
		return a;
	}
	public static void setA(int a) {
		A.a = a;
	}
}