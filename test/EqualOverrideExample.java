package test;

public class EqualOverrideExample {

	int a;
	/**
	 * @return the a
	 */
	protected int getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}

	int b;
	public EqualOverrideExample(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}
	
//	@override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof EqualOverrideExample)) {
	            return false;
	    }
		 
		EqualOverrideExample e = (EqualOverrideExample) obj;
		return ((e.a == this.a) && (e.b == this.b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualOverrideExample eq1 = new EqualOverrideExample(10,20);
		EqualOverrideExample eq2 = new EqualOverrideExample(10,20);
		
		if(eq1.equals(eq2)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
