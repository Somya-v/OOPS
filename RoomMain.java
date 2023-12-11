import java.util.Collection;
import java.util.List;

public class RoomMain {

	public static void main(String[] args) {

		Room room1 = new Room("Talia", "queen", 2, 9999);
		Room room2 = new Room("Haden", "Family Suite", 4, 20999);
		Room room3= new Room("Renee", "single", 1, 7000);

//		a Collection is a top-level interface in the Java Collections Framework.
//		It is the root interface for all the other collection interfaces (such as List, Set, and Queue).
		Collection<Room> rooms = List.of(room1, room2, room3);
		double total = getRevenue(rooms);
		System.out.println(total);
	}

	private static double getRevenue(Collection<Room> rooms) {
		return rooms.stream()    //While streams in Java share some similarities with loops in terms of iterating over elements, they represent a higher-level abstraction with a different programming paradigm
				.mapToDouble(r->r.getRate()) // converts the rates to doubles using mapToDouble()
				.sum();

	}
}
