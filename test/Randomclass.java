package test;

import java.util.Random;

public class Randomclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		/*System.out.println(r.nextInt(50));
		System.out.println(r.nextLong());
		System.out.println(r.nextFloat());
		System.out.println(r.nextDouble());
		System.out.println(r.nextBoolean());*/
		r.ints(9,50,90).forEach(System.out::println);  
		r.ints(3).forEach(System.out::println);
	}

}
