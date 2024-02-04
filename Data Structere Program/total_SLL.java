import java.util.*;


class SLL{
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	Scanner sc = new Scanner(System.in);
	Node head = null;
	int count=0;
	public void create() {
		int n, data, val;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter data: "); 
			data = sc.nextInt();
			Node newNode = new Node(data);
			if(head == null) {
				head = newNode;
			}
			else{
				System.out.print("Enter 1-begin | 2-position | 3-end:");
				val = sc.nextInt();
				
				switch(val) {
				case 1:
					newNode.next = head;
					head = newNode;
					break;
					
				case 2:
					System.out.print("Enter pos: ");
					int pos = sc.nextInt();
					if(pos < 0 || pos >count) {
						System.out.println("Invalid position");
					}else {
						Node temp2 = head;
						for(int i=0; i<pos-1; i++) {
							temp2 = temp2.next;
						}
						newNode.next = temp2.next;
						temp2.next = newNode;
					}
					
					break;
					
				case 3:
					Node temp1= head;
					while(temp1.next != null) {
						temp1 = temp1.next;
					}
						temp1.next = newNode;
					break;
					
				
						
				}
				count++;	
			}
			
			System.out.print("Want to add:  (Enter 1 )");
			n = sc.nextInt();
		}while(n == 1);
	}
	
	
	public void delete() {
		int n1;
		do {
			if(head == null) {
				System.out.println("Link list not exit");
			}else {
				
				System.out.println("for delete: Enter 1-begin | 2-pos | 3-end: ");
				int val1 = sc.nextInt();
					switch(val1) {
						case 1:
							Node temp = head;
							temp = temp.next;
							head = temp;
							break;
						
						case 2:
							Node temp2 = head;
							Node ptr2 = temp2.next;
							System.out.print("Enter pos to del: ");
							int del = sc.nextInt();
							if(del <= 0 || del > count) {
								System.out.println("Not exits");
							}else {
								for(int i =0; i < del-1; i++) {
									temp2 = ptr2;
									ptr2 = ptr2.next;
								}
								temp2.next = ptr2.next;
							}
							
							
							break;
							
						case 3:
							Node temp1 = head;
							Node ptr = temp1.next;
							while(ptr.next != null) {
								temp1 = ptr;
								ptr = ptr.next;
							}
							temp1.next = null;
							break;
					}
					System.out.println("Deleted");
			}
			System.out.print("You want to delete enter 1: ");
			n1 = sc.nextInt();
		}while(n1 == 1);
	}
	
	
	
	public void traverse() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
}

class total_SLL{
	public static void main(String[] args) {
		SLL s1 = new SLL();
		s1.create();
		s1.traverse();
		s1.delete();
		s1.traverse();
	}
}