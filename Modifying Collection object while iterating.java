//Collections cannot be modified while getting iterated, for example in below code if tried, java.util.ConcurrentModificationException is thrown
//Two ways to avoid this 1. create a new arraylist that consists of pet friendly rooms and invoke removeAll method on the collection.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class RoomMain {

	public static void main(String[] args) {

		Room room1 = new Room("Talia", "queen", 2, 9999, false);
		Room room2 = new Room("Haden", "Family Suite", 4, 20999, false);
		Room room3 = new Room("Renee", "single", 1, 7000, false);

    room1.setPetFriendly(true);
    
    //method 1: using iterator
		Iterator<Room> iterator= rooms.iterator();
		while (iterator.hasNext()) {
			Room room = iterator.next();
			if (room.getPetFriendly()) {
				iterator.remove();
			}
			
		}
		

    // not allowed to modify the object, will throw an exception
		for (Room room : c) {
			if (room.getPetFriendly()) {
			//	c.remove(room);
			}
		}
		c.stream().forEach(r -> System.out.println(r.getName()));
	}

}
