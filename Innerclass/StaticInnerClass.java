package Innerclass;

public class StaticInnerClass {

	static private int a = 10;
	static class StaticInnerClassC {
		void msg() {
			System.out.println(a);
		}
		static void display() {
			System.out.println(true);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInnerClass.StaticInnerClassC sicc = new StaticInnerClass.StaticInnerClassC();
		sicc.msg();
		StaticInnerClass.StaticInnerClassC.display();
	}

}
