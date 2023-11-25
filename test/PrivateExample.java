package test;

class SuperClass {
	private void privateMethod()
	{
		System.out.println(
			"This is a private method in SuperClass");
	}

	public void publicMethod()
	{
		System.out.println(
			"This is a public method in SuperClass");
		privateMethod();
	}
}

class SubClass extends SuperClass {
	// This is a new method with the same name as the
	// private method in SuperClass
	private void privateMethod()
	{
		System.out.println(
			"This is a private method in SubClass");
	}

	// This method overrides the public method in SuperClass
	public void publicMethod()
	{
		System.out.println(
			"This is a public method in SubClass");
		privateMethod(); // calls the private method in
						// SubClass, not SuperClass
	}
}

public class PrivateExample {
	public static void main(String[] args)
	{
		SuperClass obj1 = new SuperClass();
		obj1.publicMethod(); // calls the public method in
							// SuperClass

		SubClass obj2 = new SubClass();
		obj2.publicMethod(); // calls the overridden public
							// method in SubClass
		
		SuperClass obj3 = new SubClass();
		obj3.publicMethod();
	}
}
