//  push pop peek search for-loop isempty operation
import java.util.Stack;
import java.util.Scanner;
public class Collection_Stack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s1 = new Stack<>();
		/*
		
		for(int i=0; i<4; i++) {
			System.out.println("Enter data: ");
			int value = sc.nextInt();
			s1.push(value);
		}
		*/
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		
		//System.out.println(s1);
		
		int d = s1.peek();
		//System.out.println(d);
		
		System.out.println(s1.get(2));
		
		//s1.pop();
		//System.out.println(s1);
		
		
		int s= s1.search(30);
		//System.out.println(s);
		//System.out.println(s1);
		
		if(!s1.isEmpty()) {
	//		System.out.println("Underflow condition");
			s1.pop();
		}
//		System.out.println(s1);
	}

}
