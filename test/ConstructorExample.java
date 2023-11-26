package test;

//Java Program to Illustrate Invocation
//of Constructor Calling With Usage 
//of super Keyword

//Class 1
//Super class
class Base1 {
	int x;

	// Constructor of super class
	Base1(int _x) { x = _x; }
	Base1() {
		System.out.println("Default Base1 constructor");
	}
}

//Class 2
//Sub class
class Derived1 extends Base1 {

	int y;

	// Constructor of sub class
	Derived1(int _x, int _y)
	{

		// super keyword refers to super class
		super(_x);
		y = _y;
	}

	// Method of sub class
	void Display()
	{
		// Print statement
		System.out.println("x = " + this.x + ", y = " + this.y);
	}
}

//Class 3
//Main1 class
public class ConstructorExample {

	// Main1 driver method
	public static void main(String[] args)
	{

		// Creating object of sub class
		// inside main() method
		Derived1 d = new Derived1(10, 20);

		// Invoking method inside main() method
		d.Display();
	}
}

