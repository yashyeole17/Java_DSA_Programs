import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
// HashMap is SAME as tree map only difference is tree show data in sorted form

public class Collection_HashMap {
	public static void main(String[] args) {
/*		Map<Integer, String> c = new HashMap<>();
		c.put(1,"AAA");
		c.put(2,"BBB");			// it is ordered set
		c.put(3,"CCC");
		c.put(4,"DDD");
		//System.out.println(c);
		//c.put(3, "YASH");      // if duplicate value give it take latest value only
		
//		System.out.println(c);
//		c.putIfAbsent(5, "LLL");
//		System.out.println(c);
		
	//	c.remove(2);
		System.out.println(c);
		
		for(Integer d : c.keySet()) {
			System.out.print(d+" ");
		}
		System.out.println();
		for(String d : c.values()) {
			System.out.print(d+" ");
		}
*/		
		Map<Integer, Integer> c = new HashMap<>();
		c.put(1,11);
		c.put(2,12);	
		// it is ordered set
		c.put(3,121);
		c.put(4,34);
		System.out.println(c);
		//c.put(3, "YASH");
		
	}

}
