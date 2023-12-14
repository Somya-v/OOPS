//traditonal way by creating a class that implements interface
import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {

	public static void main(String[] args) {
		Predicate<Integer> predicate= new PredicateDemo();
		System.out.println(predicate.test(5));

	}

	@Override
	public boolean test(Integer t) {
		if (t % 2 == 0)
			return true;
		return false;
	}

}
//Using lambda function
public class PredicateDemo  {

	public static void main(String[] args) {
		Predicate<Integer> predicate= ( t)-> {
			if (t % 2 == 0)
				return true;
			return false;
		};

// Predicate<Integer> predicate=  t->  (t % 2 == 0); //more concise method   
    
		System.out.println(predicate.test(4));
    List<Integer> list= Arrays.asList(1,2,3,6,7);
		list.stream().filter(predicate)  //use of predicate in filter method
		             .forEach(t->System.out.println("printing even"+t));

    //one more way
    list.stream().filter( t->  (t % 2 == 0))
		             .forEach(t->System.out.println("printing even"+t));

	}
