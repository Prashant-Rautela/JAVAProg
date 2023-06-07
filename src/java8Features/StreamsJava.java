package java8Features;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsJava {

	public static void main(String[] args) {
		
		
		// Stream can be useful if you want to modify list without modify original list.
		
		String[] names = {"Virat", "Sachin", "Dhoni", "Dinesh","SRK"};
		Integer[] marks = {33, 34,35,36,40,43,54};
		
		List<String> cricketers = new ArrayList<String>(Arrays.asList(names));

		// create stream based on array
		
		Stream<String> streamArray =  Arrays.stream(names);
		
		// for each will perform certain function on each element
		
		// this for each is called terminal operations in the stream and is the last step in the stream pipeline
		
		Arrays.stream(names).forEach(n -> System.out.println(n.startsWith("D")));
		
		// find the minimum element
		Optional<String> minString = Arrays.stream(names).min((a,b)-> a.compareTo(b));
		System.out.println(minString); //Dhoni
		
		Optional<String> maxString = Arrays.stream(names).max((a,b)-> a.compareTo(b));
		System.out.println(maxString); //Virat
		
		long elementsCount  = Arrays.stream(names).count();
		System.out.println(elementsCount);
		
		// it will true or false if all match the criteria
		boolean nameStartWithD = Arrays.stream(names).allMatch(name -> name.startsWith("D"));
		System.out.println(nameStartWithD);
		
		
		
		// Collectors is use to filter and collect the filter elements
		
		List<String> namesStartsWithD = Arrays.stream(names).filter(name -> name.startsWith("D")).collect(Collectors.toList());
		System.out.println("Names starts with D: " + namesStartsWithD);
		
		
		
		//Reduce:  to perform actions so that actions are combined on each element and on final output is obtained.
		
		
		int[] scores = {45, 67, 89, 94,98};
		
		//aggregate functions
		int sum = Arrays.stream(scores).reduce(0,(a,b) -> a+b);
		System.out.println(sum);
		
		// create stream based on collection
		
		Stream<String> collectionStream = cricketers.stream();
		
		
		// create stream based on generate method
		
		Stream<Integer> streamGenerate = Stream.generate(() -> 5);
		
		// create stream based on iterate method
		
		Stream<Integer> streamIterate = Stream.iterate(1, x -> x+2);  //second argument is function on first argument.
		
		

	}

}
