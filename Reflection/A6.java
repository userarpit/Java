package Reflection;

/*interface Printable {
	int a= 10;
	void run();

}

 class A6 implements Printable{
	public void run() {
		System.out.println("A6 run");
	}

	public static void main(String[] args) {
		//a = 12;
		//System.out.println("a");
	}
}
 */
interface Printable {
	void print();

	default void printdefault() {
		System.out.println("print default");
	}
}

interface Showable extends Printable {
	@Override
	void print();

	static double cube(int x) {
		return Math.pow(x, 3);
	}
}

class A6 implements Printable, Showable {
	@Override
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		Printable obj = new A6();
		obj.print();
		obj.printdefault();
		System.out.println(Showable.cube(3));
	}

	@Override
	public String toString() {
		return "A6 []";
	}
}
