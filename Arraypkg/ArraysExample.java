package Arraypkg;
import java.util.*;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 15, 22, 35 }; 
		Arrays.sort(arr);
		System.out.println("Sorted array " + Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, 22));
		Arrays.fill(arr, 0);
		System.out.println(Arrays.toString(arr));
	}

}
