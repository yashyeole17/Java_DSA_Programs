import java.util.Scanner;
public class SingleLinkList_DELETE {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;
	int count = 0;
	public void creation() {
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
				Node temp = head;
				while(temp.next != null) {
					temp = temp.next;
				}
				temp.next = new_node;
			}
			System.out.print("Want to add press 1: ");
			n = sc.nextInt();
			count++;
		}while(n == 1);
	}
	public void traverse(){
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+"  ");
			temp = temp.next;
		}
		System.out.println("");
	}
	public void deletion() {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			if(head == null){
				System.out.println("List not exit");
			}else {
				System.out.println("Enter 1:  BEGIN delete: ");
				System.out.println("Enter 2:  END delete: ");
				System.out.println("Enter 3:  POSITION delete: ");
				int m = sc.nextInt();
				switch(m) {
					case 1:		// BEGINNING 
						Node temp = head;
							temp = temp.next;
							head = temp;
						break;
						
					case 2:		//  ENDING
						Node temp1 = head;
						Node ptr =  temp1.next; 
						while(ptr.next != null) {
							temp1 = ptr;
							ptr = ptr.next;
						}
							temp1.next = null;
						break;
						
					case 3:		//POSITION 
						Node temp2 = head;
						Node ptr2 =  temp2.next;
						
						System.out.println("Enter position to delete: ");
						int val = sc.nextInt();
						
						if(val > 0 && val <= count) {
							System.out.println("Position out of range");
						}
						else {
							for(int i =0; i < val-1; i++) {
								temp = ptr2;
								ptr = ptr2.next;
							}
							temp2.next = ptr2.next;
						}
						break;
						
				}
				System.out.println("DELETE SUCCESSFUL");
				count--;
			}
			System.out.print("Want to delete more preass 1: ");
			n = sc.nextInt();
		}while(n == 1);
		
	}
	public static void main(String[] args) {
		SingleLinkList_DELETE l1 = new SingleLinkList_DELETE();
		l1.creation();
		l1.traverse();
		l1.deletion();
		l1.traverse();
	}
}