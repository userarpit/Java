package test;
 import  test.*;
 import static java.lang.System.*;   

public class A extends Overload{
	int r = 103;
	public static void main(String[] args) {
		System.out.println(Overload.sum(10, 20));
		out.println("a");
		A ol = new A();
		ol.msg();
	//	System.out.println(A.b); 
		int[] arr = ol.get();
		for(int a:arr) {
			System.out.println(a);
		}
		
		ol.getR();
	}
	
	void getR() {
		System.out.println(this.r);
	}
	int[] get(){ 
		return new int[] {10,30};
	}
}