package test1;
 import  test.*;
 import static java.lang.System.*;   

public class A extends Overload{
	int r = 100;
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
	}
	
	int[] get(){ 
		return new int[] {10,30};
	}
}