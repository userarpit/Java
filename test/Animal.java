package test;
/**
 * @author HP
 */
abstract public class Animal {
	/**
	 * @return nothing
	 */
	abstract void sound();
	/**
	 * 
	 * @param args list of arguments
	 */
	public static void main(String[] args) {
		//Dog d = (Dog)new Animal();
		Animal a = new Dog(8);
		System.out.println(a instanceof Dog);	
		Dog g = (Dog)a;
		//g.setAge(8);
		System.out.println(g.getAge());
		g.sound("Bow");
		a = new Cat();
		a.sound();
	}
	/**
	 * 
	 */
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
}

class Dog extends Animal{
	int age;
	/**
	 * @param age
	 */
	public Dog(int age) {
		super();
		this.age = age;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	void sound() {
		System.out.println("Barking...");
	}
	
	void sound(String s) {
		System.out.println(s);
	}
 }

class Cat extends Animal {
	void sound() {
		System.out.println("Meow");
	}
}