package test;

public class Upcast {
	int a=100;
	public static void main(String[] args) {
	Bank b;
	b=new Axisbank();
	System.out.println(b.getRateOfInterest());
	b=new Icicibank();
	System.out.println(b.getRateOfInterest());
	System.out.println(b.a);
	}
	
}


class Bank {
	int a=100;
	float getRateOfInterest() {
		return 0.0f;
	}
}

class Axisbank extends Bank{
	int a=100;
	float getRateOfInterest() {
		return 10.0f;
	}
}

class Icicibank extends Bank{
	int a=100;
	float getRateOfInterest() {
		return 6.5f;
	}
}