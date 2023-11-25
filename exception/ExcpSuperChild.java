package exception;

public class ExcpSuperChild extends Exception{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcpSuperChild a = new Child();
		a.a();
		try {
			throw new ExcpSuperChild("custom excep");
		}
		catch(ExcpSuperChild esc) {
			System.out.println(esc);
		}
	}
	public String toString() {
		return "overide custom excep";
	}
	ExcpSuperChild(String s) {
		super(s);
	}
	ExcpSuperChild() {
		
	}
	 void a() throws ArithmeticException{
		System.out.println("parent - a() method");
	}
}

class Child extends ExcpSuperChild {
	 void a() {
		System.out.println("child - a() method");
	}
}
