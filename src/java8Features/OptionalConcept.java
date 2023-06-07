package java8Features;

import java.util.Optional;

public class OptionalConcept {

	public static void main(String[] args) {
		
		int[] marks = {45,43,56,67,89};
		//int[] marks = null;
		
		//empty optional
		Optional<String> stringempty = Optional.empty();
		stringempty.orElse("Percy");
		
		
		// optional with non nullable value. If value is null, it will throw null pointer exception
		Optional<int[]> list_marks = Optional.of(marks);
		
		
		
		

	}

}
