/**
 * 
 */
package test;

/**
 * 
 */
interface Interface {
	int a = 99;
	default void print_geek() {
		System.out.println("Interface geek");
	}
	
	static void print_name() {
		System.out.println("Arpit");
	}
}

interface Two{
	public void print_for();
//	public void print_geek();
	
	default void print_geek() {
		System.out.println("Two geek");
	}
}

interface Three extends Interface, Two {
    public void print_geek();
}

