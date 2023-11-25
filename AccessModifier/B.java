package AccessModifier;

//Java program to showcase the example
//of protected access modifier
//import required packages
import java.io.*;
import java.util.*;



//creating a child class by extending the class A
class B {
//	protected void m1() { System.out.println("GFG - B"); }
	// main method
	public static void main(String[] args)
	{
		// creating an object of parent class
		// using parent reference
		A a = new A();
		
		/// calling method m1
		a.m1();
		System.out.println(a.getA());
		
		// creating an object of child class
		// using child reference
	/*	B b = new B();
		
		// calling method m1
		b.m1();
		
		// creating an object of child class
		// using parent reference
		A a1 = new B();
		
		// calling m1 method
		a1.m1();*/
	}
}
