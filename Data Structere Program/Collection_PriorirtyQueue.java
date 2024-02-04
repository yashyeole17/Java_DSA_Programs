
// priority queue implements min heap

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Collection_PriorirtyQueue {

	public static void main(String[] args) {
		//Queue<Integer> q = new PriorityQueue<>();  // default minimum element first minHeap
		Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());  // maximum element at first MaxHeap
		q.offer(200);
		q.offer(900);
		q.offer(300);
		q.offer(400);
		q.offer(400);q.offer(400);

		System.out.println(q);
		System.out.println(q);
		//q.poll();
		System.out.println(q);
	
	}

}
