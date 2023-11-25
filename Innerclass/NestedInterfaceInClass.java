package Innerclass;

class A {
	interface Showable{
		void show();
	}
}

public class NestedInterfaceInClass implements A.Showable{

	public void show() {
		System.out.println("show");
	}
	
	public static void main(String[] argvs) {
		// TODO Auto-generated method stub
		A.Showable niic = new NestedInterfaceInClass();
		niic.show();
	}
}