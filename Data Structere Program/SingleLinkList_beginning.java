
import java.util.Scanner;
public class SingleLinkList_beginning {

	static class Node{									//create node class structure
		int data;
		Node next;
		Node(int data){									// create node constructor
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;
	public void creation(){
		int data, n;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Enter data: ");
			data = sc.nextInt();
			
			Node new_node = new Node(data);
			if(head == null) {
				head = new_node;
			}
			else {
				new_node.next = head;
				head = new_node;
				
			}
			System.out.print("Want to add more data(PRESS 1): ");
			n = sc.nextInt();
			
		}while(n == 1);
	}
	
	public void traverse(){
		Node temp = head;
		if(head == null) {
			System.out.println("Link List not exist....");
		}else {
			while(temp != null) {
				System.out.print(temp.data+"  ");
				temp = temp.next;						// from this next assign location of node to temp
			}
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkList_beginning l1 = new SingleLinkList_beginning();
		l1.creation();
		l1.traverse();
	}

}
