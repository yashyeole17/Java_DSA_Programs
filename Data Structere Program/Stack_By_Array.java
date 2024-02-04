/*
 1. Underflow condition = stack is empty :  top=-1
 2. Overflow condition = stack is full :    top = size
 3. Push()		// check in overflow
 4. Pop()      / check in underflow
 */
import java.util.*;
class Stack1{	
	int top = -1;
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int arr[] = new int[size];
	
	void push() {
		if(top == size-1) {
			System.out.println("Stack is full: overflow() condition");
		}
		else {
			System.out.println("Enter data: ");
			int data = sc.nextInt();
			top++;
			arr[top] = data;
			System.out.println("item inserted"+arr[top]);
		}
	}
	
	void pop() {
		if(top == -1) {
			System.out.println("Stack is empty: underflow() condition");
		}
		else {
			top--;
			System.out.println("item delete"+arr[top]);
		}
	}
	
	void display() {
		if(top == -1) {
            System.out.println("Stack is empty");
        }
        else {
        	System.out.println("Items are: ");
        	for(int i = top; i >= 0; i--) {
        		System.out.print(arr[i]+" ");
        	}
        	System.out.println("");
        }
	}
	void count() {
		System.out.println("Number of elements in the stack: "+(top+1));
	}
}
public class Stack_By_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		Stack1 st = new Stack1();
		int n;
		do {
			System.out.println("Enter 1 : push || 2 : pop || 3 : display || 4 : count ");
			int d = sc.nextInt();
			switch(d){
			case 1:
					st.push();
				break;
			case 2:
					st.pop();
				break;
			case 3:
					st.display();
				break;
			case 4:
					st.count();
				break;
			}
			System.out.println("Enter 1 do again opearation: ");
			System.out.println("Enter anything to exit");
			n = sc.nextInt();
		}while(n == 1);
		System.out.print("Successfully Exit..");
	}
}
