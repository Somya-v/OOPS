package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Represents an operation that takes one argument of type T and returns no result.
//Commonly used for actions that consume elements without returning a value.
public class ConsumerDemo {

	public static void main(String[] args) {

//		Consumer<Integer> consumer= (t)->{
//			System.out.println("printing "+t);
//		};
//	    consumer.accept(12);

		List<Integer> list = Arrays.asList(1, 2, 3, 6, 7);
//		list.stream().forEach(consumer);
		list.stream().forEach(t -> System.out.println("printing " + t)); // internally accept method is getting called
																			// from consumer interface

	}
}
