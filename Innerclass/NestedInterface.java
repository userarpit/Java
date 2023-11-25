package Innerclass;

interface Showable {
	void show();
	interface Message {
		void msg();
	}
}


public class NestedInterface implements Showable, Showable.Message{

	public void msg() {
		System.out.println("message");
	}
	
	public void show() {
		System.out.println("show");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedInterface ni = new NestedInterface();
		ni.show();
		ni.msg();
		
		Showable s1 = new NestedInterface();
		s1.show();
		
		Showable.Message s2 = new NestedInterface();
		s2.msg();
	}

}
