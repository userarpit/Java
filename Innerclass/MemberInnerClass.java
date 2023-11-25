package Innerclass;

public class MemberInnerClass {

	private  int a = 10;
	
	
	class innera {
		 void print() {
			System.out.println(a);
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberInnerClass outer = new MemberInnerClass();
		MemberInnerClass.innera inner = outer.new innera();
		inner.print();
	}
}
