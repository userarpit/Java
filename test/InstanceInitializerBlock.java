package test;

public class InstanceInitializerBlock extends Parent{
	final int a;
	
	{//a=100 * 10 - 4;
		System.out.println("Instance Initializater called");
	}
	
	InstanceInitializerBlock () { 
		a = 10;
		System.out.println("constructor called");
		System.out.println(a);
	}
	
	
	static {
		System.out.println("static block");
	}
	public static void main(String[] args) {
		new InstanceInitializerBlock();
	}
}

class Parent {
	Parent() {
		System.out.println("Parent class constructor");
	}
}
