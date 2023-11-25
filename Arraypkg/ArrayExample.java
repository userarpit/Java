package Arraypkg;
import java.util.*;
import java.lang.reflect.*;

public class ArrayExample {
	int a;
	private int b;
	protected int c;
	public int d;
	/**
	 * @param a
	 */
	public ArrayExample(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		return;
	}
	
//	protected ArrayExample() {
//		
//	}
	
	
	/**
	 * @return the c
	 */
	protected int getC() {
		return c;
	}

	/**
	 * @param c the c to set
	 */
	protected void setC(int c) {
		this.c = c;
	}

	public static void main(String[] args) {
		float[] arr = (float[]) Array.newInstance(float.class, 5);
		
		
		Array.setFloat(arr, 0, 10.14f);
		System.out.println(Arrays.toString(arr));
	}
	
	
	
}
