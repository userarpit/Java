package Innerclass;

public class LocalInnerClass {

	private int data1 = 100;
	void callinner() {
		//System.out.println(a);
		int data2 = 200;
		class local1 {
			int data3 = 300;
			void msg() {
				System.out.println(data1);
				System.out.println(data2);
				System.out.println(data3);
			}
		}
		local1 l = new local1();
		l.msg();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LocalInnerClass().callinner();
	}

}
