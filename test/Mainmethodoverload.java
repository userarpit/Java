package test;

public class Mainmethodoverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		Mainmethodoverload.main(10);
	}
	
	public static void main() {
		System.out.println("overload main method");
	}
	public static void main(int a) {
		System.out.println("int main method");
	}
}
