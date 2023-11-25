package test;

public class Aggregation {
	String name;
	Address add;
	
	public static void main(String[] args) {
		Aggregation a = new Aggregation();
		a.add = new Address();
		//a.add.setData();
		System.out.println(a.add.getData());
	}
	
	
}

class Address {
	int plotnumber;
	String streetline;
	int pincode;
	String landmark;
	String city;
	
	Address() { 
		this.plotnumber = 254;
		this.streetline = "Alok Nagar";
		this.pincode = 452016;
		this.landmark = "oppo. Karnataka school";
		this.city = "Indore";
	}
	void setData() {
		plotnumber = 254;
		streetline = "Alok Nagar";
		pincode = 452016;
		landmark = "oppo. Karnataka school";
		city = "Indore";
	}
	String getData() {
		return plotnumber + " " + streetline + " " + landmark + " " + city + " " + pincode ;
	}
}
