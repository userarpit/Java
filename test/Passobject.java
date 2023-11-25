package test;

public class Passobject {
	int data=50;
	public void change(Passobject p) {
		p.data = p.data + 100;
	}
	public static void main(String[] args) {
		Passobject po = new Passobject();
		System.out.println("before change " + po.data);
		po.change(po);
		System.out.println("After change " + po.data);
	}
}
