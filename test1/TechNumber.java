package test1;

public class TechNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long a = 1312;
		TechNumber t = new TechNumber();
		int count;
		long divideby2;
		long firsthalf,secondhalf;
		for(long i = 1;i<=1000000;i++) { 
			count = t.countdigit(i);
			if(count%2 == 0) {
				divideby2 = count / 2;
				firsthalf = (long)(i / Math.pow(10,divideby2));
				secondhalf = (long)(i % Math.pow(10,divideby2));
			
				//System.out.println(firsthalf);
				//System.out.println(secondhalf);
				long sum = firsthalf + secondhalf;
				long square = sum * sum;
				if (square == i) 
					System.out.println(i + " is a tech number");	
			}
		}
}
	
	int countdigit(long a) {
		long temp = a;
		int count = 0;
		while(temp != 0) {
			count++;
			temp /= 10;
		}
		return count;
	}
}