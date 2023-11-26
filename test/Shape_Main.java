package test;

import java.text.DecimalFormat;

abstract class Shape {
	public abstract double getArea(); 
}

class Circle extends Shape{
	
	private double radius;
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}

class Ractangle extends Shape{
	private double width;
	private double height;
	
	Ractangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	
}
public class Shape_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c = new Circle(7);
		Shape r = new Ractangle(10,14);
		
//		DecimalFormat df = new DecimalFormat("####.##");
		
		System.out.println("Area of circle " + String.format("%.3f",c.getArea()));
		System.out.println("Area of ractangle " + r.getArea());
		
	}

}
