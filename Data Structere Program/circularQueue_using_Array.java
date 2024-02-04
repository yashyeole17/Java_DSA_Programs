 
import java.util.*;

class Queue4{
	int front = -1, rear = -1;
	Scanner sc = new Scanner(System.in);
	
	int size = sc.nextInt();
	int arr[] = new int[size];
	
	void enqueue() {
		if(front == (rear+1) % size) {
			System.out.println("Overflow queue is full");
		}else {
			System.out.print("Enter data: ");
			int data = sc.nextInt();
			if(front == -1) {
               front = 0;
           }
			rear = (rear+1)%size;
			arr[rear] = data;
			System.out.println("Item Inserted"+arr[rear]);
		}
	}
	
	void dequeue() {
		if(front == -1 & rear == -1) {
			System.out.println("Underflow : Queue is empty");
		}else{
			if(front == rear) {
				front = rear = -1;
				System.out.println("Underflow : Queue is empty");
			} else {
				System.out.println("Item deleted: " + arr[front]);
				front = (front+1)%size;
			}

		}
	}
	
	void display() {
		System.out.println("Queue items are..");
		int i ;
		 for(i = front; i <= rear; i = (i+1)%size) {
			System.out.print(arr[i]+" ");
		}
		 System.out.print(arr[i]+" ");
		System.out.println("");
	}
}
;
public class circularQueue_using_Array {

	public static void main(String[] args) {
		System.out.println("Enter size of array: ");
		Scanner sc = new Scanner(System.in);
		Queue4 q1 = new Queue4();
		int n, d;
		do {
			System.out.println("Enter 1: enqueue || 2: dequque || 3: display");
			d = sc.nextInt();
			switch(d) {
				case 1:
						q1.enqueue();
					break;
				case 2:
						q1.dequeue();
					break;
				case 3:
						q1.display();
					break;
			}
			
			System.out.print("Enter 1 for again opearation: ");
			System.out.println("Except 1 anything for exit..");
			n = sc.nextInt();
		}while(n == 1);	
	}
}
