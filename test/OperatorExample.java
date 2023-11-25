package test;
public class OperatorExample{  
public static void main(String args[]){  
System.out.println(10<<2);//10*2^2=10*4=40  
System.out.println(10<<3);//10*2^3=10*8=80  
System.out.println(20<<2);//20*2^2=20*4=80  
System.out.println(15<<4);//15*2^4=15*16=240 
short a = 10;
short b = 11;
//short c = 5;

int min = (a < b)?a:b;
System.out.println(min);
short c = (short)(a + b);
System.out.println(c);
System.out.println(-10>>>2);
}}  