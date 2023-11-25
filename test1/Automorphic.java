package test1;

public class Automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = 1;
		long end = 1000000;
		for(long i = start;i<=end;i++) { 
			long numsqu = (i * i);
			
			String snum = Long.toString(i);
			String s = Long.toString(numsqu);
			
			if(s.endsWith(snum))
				System.out.println(i);
		}
	}
}