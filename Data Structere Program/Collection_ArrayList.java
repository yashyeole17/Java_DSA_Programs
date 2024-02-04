/*
 Functions in ArrayList:
 		add(),  get(),   remove(),   clear(),      set(),   contains()
 */
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class Collection_ArrayList {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		//System.out.println(l1);
		
		l1.remove(3);			// 3 is index
//		System.out.println(l1);
		
		int d = l1.get(1);				// 1 is index
//		System.out.println(d);
		
		
		//set data at index
		l1.set(2,100);
		System.out.println(l1);
		
		
		boolean f = l1.contains(100);
	//	System.out.println(f);
		
		
		//display list
	//	System.out.print("LIST: ");
		for(int i= 0;  i< l1.size(); i++) {
	//		System.out.print(l1.get(i)+"  ");
		}
	//	System.out.println();
		
		//delete all data 
		//l1.clear();
	//	System.out.println(l1);
		
		// Iterator class
		 ListIterator<Integer> t = l1.listIterator();
	        while(t.hasNext()) {						
	            System.out.println(t.next());
	        }
	

	
	}
}
