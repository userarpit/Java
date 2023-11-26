package test;

public class InterfaceExample implements Interface, Two{

	public InterfaceExample() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample ie = new InterfaceExample();
//		ie.print_geek();
//		ie.print_for();
//		System.out.println(Interface.a);
//		Interface.print_name();
//		Interface.a = 34;
		ie.print_geek();
	}

	@Override
	public void print_geek() {
		// TODO Auto-generated method stub
		Interface.super.print_geek();
		Two.super.print_geek();
	}

	@Override
	public void print_for() {
		// TODO Auto-generated method stub
		System.out.println("for");
	}

}
