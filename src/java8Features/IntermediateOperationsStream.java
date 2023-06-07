package java8Features;

import java.util.Arrays;
import java.util.stream.Stream;

public class IntermediateOperationsStream {

	
	// Perform intermediate operations on stream pipeline
	
	
	public static void main(String[] args) {
		
		
// filter operation: Returns a stream consisting of the elements of this stream that match the given predicate
		
		String[] names = {"Virat", "Sachin", "Dhoni", "Dinesh","Rohit","Rohit"};
		
		// print the elements whose names starts with D
		
		Arrays.stream(names).filter(name -> name.startsWith("D"))
				.forEach(n-> System.out.println(n));
		
// Map: Returns a stream consisting of the results of applying the given function to the elements of this stream
		
		System.out.println("///////////Applying Map function////////////////");
		Arrays.stream(names).map(name -> name.substring(0,4)).forEach(n -> System.out.println(n));
		
// limit: limit the result of the stream
		
		Arrays.stream(names).limit(3).forEach(name -> System.out.println(name));  //Virat Sachin Dhoni this will print only 3 result
		
//skip: It will skip the elements from the stream.		
		
		Arrays.stream(names).skip(3).forEach(name -> System.out.println(name));  //Dinesh Rohit

		System.out.println("Combine both limit and skip");
		Arrays.stream(names).skip(1).limit(names.length).forEach(name -> System.out.println(name));
		
//distinct
		long uniqueElements = Arrays.stream(names).distinct().count();
		System.out.println(names.length + " total elements");
		System.out.println(uniqueElements + " unique elements");

		
// sorted
		
		System.out.println("In sorted order");
		System.out.println();
		
		// by default it will sort as per dictionary
		Arrays.stream(names).sorted().forEach(name -> System.out.println(name));
		
		// we can reverse the sorting order
		
		System.out.println();
		System.out.println("In reverse sorted order");
		
		Arrays.stream(names).sorted((a,b)-> b.compareTo(a)).forEach(name -> System.out.println(name));
		
// flatMap
		
		
// peek		
	}

}
