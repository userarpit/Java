package test;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		do {
			System.out.println(j);
			i = i + 1;
			j+=2;
			if (j == 12)
				break;
		} while(i<=10);
	}

}
