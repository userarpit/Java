package test;

public class ArrayFrequency {
	public static void main(String[] args) {
		int[] a = new int[] {1,2,4,3,2,4,1,3,2,4,1,3,3,4};
		int[] alreadycounted=new int[a.length];
		int k = 0;
		int nexti;
		int count;
		System.out.println(a.length);
		for (int i=0;i<a.length;i++) {
			nexti = 0;
			count = 1;
			for(int l=0;l<k;l++) {
				if (alreadycounted[l] == a[i]) {
					nexti = 1;
					break;
				}
			}
			if (nexti == 0) { 
				for(int j=i+1;j<a.length;j++) {
					if(a[i] == a[j]) {
						count++;
					}
				}
				System.out.println(a[i] + " frequency is " + count);
				alreadycounted[k] = a[i];
				k++;
			}
		}
	}
}
