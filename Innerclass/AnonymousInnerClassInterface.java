package Innerclass;

public class AnonymousInnerClassInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInnerClassInterfaceI a = new AnonymousInnerClassInterfaceI() {
			public void eat() {
				System.out.println("eat interface");
			}
		};
		a.eat();
	}

}

interface AnonymousInnerClassInterfaceI {
	void eat();
}
