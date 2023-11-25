package test;
import test.*;
import Arraypkg.*;

final class AccessModifier extends ArrayExample{
	public static void main(String[] args) {
        D d = new D();
        System.out.println(d.eid);
        System.out.println(d.ename); 
        System.out.println(D.department); 
        d.department = "AB";
        System.out.println(D.department);
        EqualOverrideExample e = new EqualOverrideExample(10,20);
        System.out.println(e.getA());
        AccessModifier ae = new AccessModifier(100,200,300,400);
//        System.out.println(ae.a);  //default not visible outside the package 
//        System.out.println(ae.b);  //private not visible 
         System.out.println(ae.c);  
//       protected not visible outside package and 
//                                   this is not a sub class.
//                       make this class as sub class, and 'c' will be visible
        System.out.println(ae.d);   // public . it is visible
    }

	AccessModifier(int a, int b, int c, int d) {
		super(a,b,c,d);
	}
  
}

class D {
	public String ename;
	protected int eid;
	static String department = "CS";
	
	D() {
		this.ename = "Arpit";
		this.eid = 1111345;
	}
	 }
