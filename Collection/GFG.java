package Collection;

//Java program to demonstrate
//computeIfAbsent(Key, Function) method.

import java.util.*;

public class GFG {

	// Main1 method
	public static void main(String[] args)
	{

		// create a HashMap and add some values
		HashMap<Integer, String>
			map1 = new HashMap<>();
		map1.put(1, "Ram");
		map1.put(2, "Rohan");
		map1.put(3, "Shivam");

		HashMap<Integer, String>
			map2 = new HashMap<>();
		map2.put(1, "Tushar");
		map2.put(10, "Satya");
		map2.put(12, "Sundar");

		// print map details
		System.out.println("HashMap1: "
						+ map1.toString());

		System.out.println("HashMap2: "
						+ map2.toString());

		// provide value for new key which is absent
		// using computeIfAbsent method
		map2.forEach((key, value)-> map1.merge(key,	value,(v1, v2)-> v1.equalsIgnoreCase(v2)
							? v1
							: v1 + ", " + v2));

		// print new mapping
		System.out.println("New HashMap: " + map1);
		map1.replace(1, "Arpit");
		System.out.println(map1.toString());
		System.out.println(map1.replace(1, "Arpit", "abcde"));
		System.out.println(map1.toString());
		
	}
}

