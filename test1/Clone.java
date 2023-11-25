package test1;

public class Clone implements Cloneable{
	int rollno;
	String name;
	Clone(int rollno,String name) {
		this.rollno = rollno;
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public static void main(String[] args) {
		Clone c1 = new Clone(101,"Amit");
		Clone c2;
		try {
		c2 = (Clone)c1.clone();
		System.out.println(c2.rollno + " " + c2.name);
		c2.rollno = 102;
		System.out.println(c1.rollno);
	}
		catch(CloneNotSupportedException c) {}
System.out.println(Long.MAX_VALUE);		
}
}
