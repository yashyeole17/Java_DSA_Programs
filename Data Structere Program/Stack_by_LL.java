import java.util.Scanner;

public class Stack_by_LL {
	//Scanner sc = new Scanner(System.in);
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	Node top = null;
	void push(Scanner sc) {
		System.out.print("Enter data : ");
		int data = sc.nextInt();
		Node newnode = new Node(data);
		if(top == null) {
			top = newnode;
		}else {
			newnode.next = top;
			top = newnode;
		}
	}
	void pop(){
		if(top == null) {
			System.out.println("List/stack is empty..Underflow condition");
		}else {
			top = top.next;
		}
	}
	void display() {
		System.out.println("Data item are: ");
		Node temp = top;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Stack_by_LL st = new Stack_by_LL();
		Scanner sc = new Scanner(System.in);
		int d,n;
		do {
			System.out.println("Enter 1 : push");
			System.out.println("Enter 2 : pop");
			System.out.println("Enter 3 : display");
			System.out.println("");
			System.out.print("Enter choice: ");
			d = sc.nextInt();
			
			switch(d) {
			case 1:
					st.push(sc);
				break;
			case 2:
					st.pop();
				break;
			case 3:
					st.display();
				break;
			}
			System.out.println("Enter 1 for operation");
			System.out.println("Enter anything than 1 to exit");
			n = sc.nextInt();
		}while(n == 1);
		System.out.println("Exit successful");
	}

}
