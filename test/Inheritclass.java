package test;

public class Inheritclass extends Employee{
	float bonus = 0.50f;
	int salary = 20000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritclass e1 = new Inheritclass();
		System.out.println(e1.salary);
		System.out.println("Salary after include bonus " + (e1.salary + 
				((float) (e1.bonus * e1.salary))));
	}

}

class Employee {
	int salary = 10000;
}
