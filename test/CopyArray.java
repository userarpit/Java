package test;

public class CopyArray {
	
	
	public static void main(String[] args) {
		short i = 0;
		int[] a = new int[] {1,2,3,4,5};
		int length = a.length;
		int[] b = new int[length];
		for(int z:a) {
			b[i] = z;
			i++;
		}
		
		for(int z:b) {
			System.out.println(z);
		}
	}
	
	
}
