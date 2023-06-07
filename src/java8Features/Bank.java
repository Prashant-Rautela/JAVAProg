package java8Features;


@FunctionalInterface
public interface Bank {

	// Interfaces can have abstract methods.
	// don't have any implementations.
	// if we give any body to method, change the keyword to default or static.
	
	abstract void rateOfInt();
	
	//abstract void rateOfInst();   uncommenting this code with throw compile error as functional interface can have only abstract method.
	
	static void giveLoan() {
		System.out.println("loan method in interface");
	};
	
	
	default void giveCredit() {
		System.out.println("default method in interface");
	}
	
	
	//Static methods on Interfaces cannot be overridden or hidden in the Class.
	//Default methods can be overridden in the Class that implements the interface.
	
	
	// Functional Interface: 
	// 1. an interface with only abstract method.
	// 2. can contain many default and static methods.
	// 
	
	/*Common built in funtional interface.
	 * 
	 * Predicate<T>
	 * Supplier<T>
	 * Consumer<T>
	 * Function<T,R>
	 * 
	 * 
	 * */
	
}
