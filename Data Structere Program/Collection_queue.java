// Operations:  offer() for add data, pool() for delete,    peek();   break();
import java.util.LinkedList;
import java.util.Queue;

public class Collection_queue {

	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<>();
		
		q1.offer(10);		// front = 10
		q1.offer(20);
		q1.offer(30);
		q1.offer(40);
		q1.offer(50);		// rear = 50
		
		//System.out.println(q1);
		//System.out.println(q1.peek());
		
		q1.poll();
		System.out.println(q1);
		//System.out.println(q1.peek());
		
		
	}

}
