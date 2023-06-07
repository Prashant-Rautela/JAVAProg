package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreams {

	public static void main(String[] args) {
		
		
		String[] names = {"Virat", "Sachin", "Dhoni", "Dinesh","Rohit","Rohit"};
		
		
	// create parallel streams using parallel method on existing stream
		
	// not necessary of faster performance
		// lots of elements in the stream	
		
		List<String> listname = Arrays.stream(names).parallel()
				.filter(name -> name.length() > 5)
				.collect(Collectors.toList());
		System.out.println(listname);
	}

}
