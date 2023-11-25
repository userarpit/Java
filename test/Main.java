package test;

//A Java program to demonstrate that overridden
//method can be called from sub-class

//Base Class
class Parent1 {
	void show() { System.out.println("Parent's show()"); }
	static void showstatic() { System.out.println("Parent's static show()"); }
}

//Inherited class
class Child extends Parent1 {
	// This method overrides show() of Parent
	@Override void show()
	{
		super.show();
		Parent1.showstatic();
		System.out.println("Child's show()");
	}
}

//Driver class
class Main {
	public static void main(String[] args)
	{
		Parent1 obj = new Child();
		obj.show();
	}
}
