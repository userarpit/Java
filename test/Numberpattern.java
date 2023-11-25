package test;

public class Numberpattern {
	public static void main(String[] args) {
		int k = 1;
		for(int i = 1; i<=7; i++) {
			
			for (int j = 1; j<=i;j++) { 
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
		
		// 
		
		for(int i = 0; i<=6; i++) {
			k=1;
			for(int q=1;q<=7-i;q++) {
				System.out.print(" ");
			}
			for (int j = 0; j<=i;j++) { 
				System.out.print(k + " ");
				k = k * (i-j) / (j+1);
			}
			System.out.println();
		}
		
		//
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int l=1;l<=n-i;l++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			for (int q=2;q<=i;q++) {
				System.out.print(q);	
			}
			System.out.println();
		}
		
		for(int i=n-1;i>=1;i--) {
			for(int l=1;l<=n-i;l++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			for (int q=2;q<=i;q++) {
				System.out.print(q);	
			}
			System.out.println();
		}
		n=9;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i +  " ");
			}
			System.out.println();
		}
		n=8;
		
		for(int i=n;i>=1;i--) {
			k=n;
			for(int j=0;j<=n-i;j++) {
				System.out.print(k +  " ");
				k--;
			}
			System.out.println();
		}
		
		n=8;
		
		for(int i=1;i<=n;i++) {
			k=i;
			for(int j=1;j<=i;j++) {
				System.out.print(k +  " ");
				k--;
			}
			System.out.println();
		}
		n=9;
	
		for(int i=1;i<=n;i++) {
			k=i;
			for(int j=1;j<=i;j++) {
				System.out.print(k +  " ");
				k = k + n - j;
			}
			System.out.println();
		}
		
		n=9;
		
		for(int i=1;i<=n;i++) {
			k=i;
			for(int j=1;j<=n;j++) {
				System.out.print(k +  " ");
				k++;
				if(k > n)
					k-=n;
			}
			System.out.println();
		}
	}
}
