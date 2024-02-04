/*
 FIFO = FIRST IN FIRST OUT
 	 Linear data structure
	Implementation array and link-list
	Operation : enqueue dequeue, overflow, underflow
	Priority Elements: Front and rear
	eg: Train, bus, movie ticket booking
		CPU Scheduling
		
	Initially front = rear = -1
	// Insert
	Step 1:  First element front&rear ++
	Step 2:  Second element only rear++
	//Delete
    Step 3:  Remove first element only front++ (rear at is.) 
	Step 4:  Remove last element set front & rear = -1
*/

import java.util.*;

class Queue{
	int front = -1, rear = -1;
	Scanner sc = new Scanner(System.in);
	
	int size = sc.nextInt();
	int arr[] = new int[size];
	
	void enqueue() {
		if(rear == size-1) {
			System.out.println("Overflow queue is full");
		}else {
			System.out.print("Enter data: ");
			int data = sc.nextInt();
			if(front == -1) {
                front = 0;
            }
			rear++;
			arr[rear] = data;
			System.out.println("Item Inserted"+arr[rear]);
		}
	}
	
	void dequeue() {
		if(rear == -1) {
			System.out.println("Underflow queue id empty");
		}else{
			if(front == rear) {
				front = rear = -1;
			} else {
				front++;
			}
			System.out.println("Item deleted: " + arr[front]);
		}
	}
	
	void display() {
		System.out.println("Queue items are..");
		 for(int i = front; i <= rear; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
}
;
public class Queue_using_Array {

	public static void main(String[] args) {
		System.out.println("Enter size of array: ");
		Scanner sc = new Scanner(System.in);
		Queue q1 = new Queue();
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
