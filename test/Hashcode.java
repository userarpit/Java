package test;

public class Hashcode {
	int a;
	Hashcode(int a){
		this.a = a;
	}
	public static void main(String[] args) {
		Hashcode hc = new Hashcode(10),hc1=new  Hashcode(20);
		System.out.println(hc.hashCode());
		System.out.println(hc1.hashCode());
	}
	
}
