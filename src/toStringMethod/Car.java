package toStringMethod;

public class Car {

	//global variables 
	
	String make = "Ford";
	String model = "Mustang";
	String color = "red";
	int year = 2021;
	
	//toString() method
	

	public String toString(){
		String toString = make + " " +  model +" " + color;
		//Must return a value
		return toString;
		
		//OR just 
		// return  make + " " +  model +" " + color;
		
		//Now we get a textual representation of our object
		
	}
	
}
