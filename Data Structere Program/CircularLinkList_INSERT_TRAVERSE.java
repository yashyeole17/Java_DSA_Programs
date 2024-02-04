import java.util.*;

//import SingleLinkList_position.Node;

public class CircularLinkList_INSERT_TRAVERSE {

	public static class Node{
		int data; 
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	Node head = null;
	Node tail = null;
	void creation() {
		
		Scanner sc = new Scanner(System.in);
		int data, n, count = 0;;
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
				System.out.println("For Begin: press 1: ");
				System.out.println("For END: press 2: ");
				System.out.println("For POSITION: press 3: ");
				int val = sc.nextInt();
				
				switch(val) {
				
					case 1:		//begin
							newnode.next = head;
							head = newnode;
							tail.next = head;
						break;
					
					case 2:  //end
							tail.next = newnode;
							tail = newnode;
							newnode.next = head;
						break;
			
					case 3: // position
							System.out.println("Enter Position: ");
							int p = sc.nextInt();
							Node temp = head;
							for(int i = 0; i < p-1; i++){
								temp = temp.next;
							}
								newnode.next = temp.next;
								temp.next = newnode;
						break;
				}
			}
			System.out.print("Want to add press 1: ");
			n = sc.nextInt();
			count++;
				
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
		CircularLinkList_INSERT_TRAVERSE l1 = new CircularLinkList_INSERT_TRAVERSE();
		l1.creation();
		l1.traverse();
	}

}
