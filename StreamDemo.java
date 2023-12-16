//-> Arrays.asList method is used to convert an array into a fixed-size list.
//-> changes to the elements (e.g., using set) will be reflected in both the array and the list, but changes to the structure (size) are not allowed. throws runtime error.
//-> If you need a modifiable list, you can create a new ArrayList using the ArrayList constructor and passing the Arrays.asList result as an argument: List<String> list = new ArrayList<>(Arrays.asList(array));

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractice {
	public static void main(String[] args) {

		// always better to have immutable data-> dont change existing values/list
		List<Integer> list = Arrays.asList(11, 2, 3, 14, 5);

		// stream method creates a stream and returns it
		//Stream<Integer> stream = list.stream(); // this stream is not existing list
		//Stream<Integer> sortedStream = stream.sorted();
		// once stream is consumed, cannot be used again
				
		//Stream<Integer> doubledStream = sortedStream.map(n->n*2);
		//doubledStream.forEach(n -> System.out.println(n));
		list.stream()
			.filter(n-> n%2==1)
		    .sorted()
		    .map(n-> n*2)
		    .forEach(n-> System.out.println(n));
		
		// double list values using for loop
		for (Integer i : list) {
		//	System.out.println( i * 2);
		}
	}
}
