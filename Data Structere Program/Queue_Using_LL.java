import java.util.*;

class Queue3{
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	Node front = null;
	Node rear = null;

	void enqueue() {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        Node newnode = new Node(data);
		if(front == null) {
			front = newnode;
			rear = newnode;
		}else {
			rear.next = newnode;
			rear = newnode;
		}
		System.out.println("Item insert");
	}
	
	void dequeue() {
		if(front == null) {
			System.out.println("Queue LL is empty");
		}else {
			front = front.next;
			System.out.println("Item delete "+front.data);
		}
	}
	void display() {
		System.out.println("Data item are: ");
		Node temp = front;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println("");
	}
	
}

public class Queue_Using_LL {
	public static void main(String[] args) {
		System.out.println("Enter something to start:");
		Queue3 q1 = new Queue3();
		Scanner sc = new Scanner(System.in);
		int d,n;
		do {
			System.out.println("Enter 1 : push | 2 : pop | 3 : display");
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
			System.out.println("Enter 1 for operation");
			System.out.println("Enter anything than 1 to exit");
			n = sc.nextInt();
		}while(n == 1);
		System.out.println("Exit successful");
	}
}
