package test;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(6));
	}
	public static int fact(int a) {
		if (a == 0)
			return 1;
		if (a  == 1)
			return 1;
		else
			return fact(a-1) * a;
	}
}
