import java.util.*;

public class DLL_INSERTION {
    public static class Node {
        int data;
        Node next, prev;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    void creation() {
        Scanner sc = new Scanner(System.in);
        int data, n, count = 0;
        do {
            System.out.print("Enter data: ");
            data = sc.nextInt();
            Node newnode = new Node(data);
            
            if (head == null) {
                head = newnode;
                tail = newnode;
                tail.next = head;
            } else {
                System.out.println("For Begin: press 1");
                System.out.println("For END: press 2");
                System.out.println("For POSITION: press 3");
                int val = sc.nextInt();

                switch (val) {
                    case 1: // begin
                        newnode.next = head;
                        head.prev = newnode;
                        head = newnode;
                        break;

                    case 2: // end
                        tail.next = newnode;
                        newnode.prev = tail;
                        tail.next = head;
                        tail = newnode;
                        break;

                    case 3: // position
                        System.out.println("Enter Position: ");
                        int pos = sc.nextInt();
                        Node temp = head;
                        Node ptr = temp.next;
                        for (int i = 0; i < pos - 1; i++) {
                            temp = ptr;
                            ptr = ptr.next;
                        }
                        newnode.prev = temp;
                        newnode.next = ptr;
                        temp.next = newnode;
                        ptr.prev = newnode;
                        break;
                }
            }
            System.out.print("Want to add press 1: ");
            n = sc.nextInt();
            count++;
        } while (n == 1);
    }
    public void traverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("List not exist");
        } else {
            do {
                System.out.print(temp.data + "  ");
                temp = temp.next;
            } while (temp != head);
        }
    }

    public static void main(String[] args) {
        DLL_INSERTION l1 = new DLL_INSERTION();
        l1.creation();
        l1.traverse();
    }
}
