import java.util.Scanner;
public class SingleLinkList_position {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;
	public void creation() {
		int data, n, val, count=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter data ");
			data = sc.nextInt();
			Node newNode = new Node(data);
			if(head  == null) {
				head = newNode;
			}
			else {
				System.out.println("Enter 1: BEGIN");
				System.out.println("Enter 2: End ");
				System.out.println("Enter 3: Position ");				
				val = sc.nextInt();
				switch(val) {
				//Beginning
					case 1:
							newNode.next = head;
							head = newNode;
							break;
				//Ending
					case 2:							
							Node temp = head;
							while(temp.next != null) {
								temp = temp.next;
							}
							temp.next = newNode;
							break;
				//Position
					case 3:							
							System.out.println("Enter position:");
							int position = sc.nextInt();
							if(position >= 0 && position <= count) {
								Node temp1 = head;
								for(int i = 0; i < position - 1; i++) {
									temp1 = temp1.next;
								}
									newNode.next = temp1.next;
									temp1.next = newNode;
							}else {
								System.out.println("Position out of range..");
							}
						break;
				}
				count++;
			}
			System.out.print("Want to add more preass 1: ");
			n = sc.nextInt();
		}while(n == 1);	
	}
	public void traverse() {
		Node temp = head;
		if(head == null) {
			System.out.println("List not exist");
		}else {
			while(temp != null) {
				System.out.print(temp.data+"  ");
				temp = temp.next;
			}
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkList_position l1 = new SingleLinkList_position();
		l1.creation();
		l1.traverse();
	}
}
