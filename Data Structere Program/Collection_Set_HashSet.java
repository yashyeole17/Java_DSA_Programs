
// Operation:   ADD() REMOVE() CONTAINS() SIZE() CLEAR()

import java.util.Set;
import java.util.HashSet;
public class Collection_Set_HashSet {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		
		s.add(5000);  s.add(800);  s.add(200);  s.add(500);  s.add(1000); 
		s.add(1000);  // duplicate not allow in set and unordered
		 
	    System.out.println(s);
		
		// delete
		//System.out.println(s.remove(100));
		//System.out.println(s);
		
		System.out.println(s.contains(200));        // check availability data
		System.out.println(s.size());				// size
		
	 
		
	}

}
