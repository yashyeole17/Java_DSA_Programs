package practice;

import java.util.Scanner;

public class Fibinacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		System.out.print("Enter nth term: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n == 0 || n == 1) {
			System.out.println("Enter more than 0-1");
			return;
		}
		for(int i=0; i<n; ++i) {
			System.out.print(a+" ");
			int c = a+b;
			a = b; 
			b = c;	
		}
		sc.close();
	}

}
