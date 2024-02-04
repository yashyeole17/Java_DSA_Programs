
import java.util.*;

public class CircularLinkList_DELETION {

	public static class Node{
		int data; 
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	Node head = null;
	Scanner sc = new Scanner(System.in);
	Node tail = null;
	int count = 0;
	void creation() {
		
		
		int data, n;;
		do {
			System.out.print("Enter data: ");
			data = sc.nextInt();
			
			Node newnode =new Node(data);
			
			if(head == null) {
				head = newnode;
				tail = newnode;
				tail.next = head;
			}
			else {	
				newnode.next = head;
				head = newnode;
				tail.next = head;
			}
			System.out.print("Want to add press 1: ");
			n = sc.nextInt();
			count++;
		}while(n == 1);	
	}
	
	void deletion() {
		System.out.println("Deletion:");
		int n, val;
	do {
		if(head  == null) {
				System.out.println("List not exits..");
		}
		else {
			System.out.println("Enter no to delete: ");
			System.out.println("Enter 1: BEGIN");
			System.out.println("Enter 2: End ");
			System.out.println("Enter 3: Position ");				
			val = sc.nextInt();
			switch(val) {
			//Beginning
				case 1:
						Node temp = head;
						temp = temp.next;
						temp = head;
						tail.next = head;
						break;
			//Ending
				case 2:	
					Node temp1 = head;
					Node ptr = temp1.next;
					while (ptr.next != head) {
						temp1 = ptr;
						ptr = ptr.next;
					}
						temp1.next = head;
						tail = temp1;
						break;
			//Position
				case 3:	
						Node temp2 = head;
						Node ptr2 = temp2.next;
						System.out.println("Enter position:");
						int position = sc.nextInt();
						if(position >= 0 && position <= count) {
								
							for(int i=0; i<position-1; i++) {
								temp2 = ptr2;
								ptr2 = ptr2.next;
							}
								temp2.next = ptr2.next;
							
						}else {
							System.out.println("Position out of range..");
						}
					break;
			}
		}
		count--;
		System.out.println("Done.");
		System.out.print("Want to DELETE more preass 1: ");
		n = sc.nextInt();
	}while(n == 1);	
}
	
	
	public void traverse() {
		Node temp = head;
		if(head == null) {
			System.out.println("List not exist");
		}
		 else{
			 do{
		          System.out.print(temp.data + "  ");
		           temp = temp.next;
		     }while(temp != head);
		 }	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkList_DELETION l1 = new CircularLinkList_DELETION();
		l1.creation();
		l1.traverse();
		System.out.println();
		l1.deletion();
		l1.traverse();
	}

}
