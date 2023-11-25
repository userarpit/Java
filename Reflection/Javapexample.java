package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Javapexample {
	public static void main(String[] args) {
		Class c = Simple.class; 
		System.out.println("Fields........");  
	    Field f[]=c.getDeclaredFields();  
	    for(int i=0;i<f.length;i++)  
	        System.out.println("\t" + f[i]);  
	      
	    System.out.println("Constructors........");  
	    Constructor<Simple> con[];
		try {
			con = c.getDeclaredConstructors();
			con[1].setAccessible(true);
		    try {
				con[1].newInstance(2);
				System.out.println(con[1]);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  
	  /*  for(int i=0;i<con.length;i++)  
	        System.out.println("\t" + con[i]);
	    */
	     
	        System.out.println("Methods........");  
	    Method m[]=c.getDeclaredMethods();  
	    for(int i=0;i<m.length;i++)  
	        System.out.println("\t" + m[i]); 
	    
	    m[0].setAccessible(true);
	    try {
			m[0].invoke(c.newInstance(),4,5);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }  
}