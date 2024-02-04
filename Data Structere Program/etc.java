import java.util.Scanner;
class Queuee{
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int arr[] = new int[size];
	int front = rear = -1;
	int rear = -1;
	void enqueue() {
		if(rear == size-1) {
			System.out.println("Queue full ");
		}
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		if(front == -1) {
			front = 0;
		}
		rear++;
		arr[rear] = data;
		System.out.println("Data insert");
	}
	void dequeue() {
		if(front == -1) {
			System.out.println("Queue empty ");
		}
		else {
			if(front == rear) {
				front = -1;
				rear = -1;
			}else {
				front++;
				System.out.println("Data delete");
			}
		}
	}
	void display() {
		if(front == -1) {
			System.out.println("Queue empty ");
		}
		else {
			System.out.println("List: ");
			for(int i = front; i <= rear; i++) {
				System.out.println(arr[i]+" ");
			}
		}
	}
}
public class etc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Size of array: ");
		Queuee q1 = new Queuee();
		Scanner sc = new Scanner(System.in);
		int n, d;
		do {
			System.out.println("Enter 1: enqueue || 2:dequeue || 3:display: ");
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
			System.out.print("Enter 1 fto again opearation");
			System.out.println("other than 1 to EXIT: ");
			n = sc.nextInt();
		}while(n == 1);
	}
}
