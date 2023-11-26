package test;

public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Honda();
		b.run();
	}

}

 abstract class Bike{
	abstract void run();
	Bike() {
		System.out.println("Bike created");
	}
}

 class Honda extends Bike{
	void run() {
		System.out.println("running...");
	}
	Honda() { 
		System.out.println("Honda created");
	}
}