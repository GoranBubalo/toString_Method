package toStringMethod;

public class Main {

	public static void main(String[] args) {
		// toString() = > is a special method that all objects inherit
		//				  that returns a string that " textually represents" an object. 
		// 				  can be used both implicitly and explicitly

		Car car ;
		car = new Car();
		//Explicitly
		System.out.println("Explicitly");
		System.out.println(car.toString());
		System.out.println();
		System.out.println("Implicitly");
		//Implicitly
		System.out.println(car);
		
	}

}
