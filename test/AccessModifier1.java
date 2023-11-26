package test;

public class AccessModifier1 {
    public static void main(String[] args) {
    	AM a1 = new AM();
    	System.out.println(a1.getA());
    	System.out.println(new A().r);
    }
}

class AM {
	private int a = 10;
	int getA() {
		return a;
	}
}
