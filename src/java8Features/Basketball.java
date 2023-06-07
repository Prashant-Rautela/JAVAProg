package java8Features;

public class Basketball {

	public static void main(String[] args) {
		
		// Sports is functional interface.
		// this will map the lambda function with abstract method.
		Sports sport = () -> System.out.println("I play basketball");
		
		//sport is implementation of setUpRules abstract method in the interface.
		sport.setUpRules();

	}

	

}
