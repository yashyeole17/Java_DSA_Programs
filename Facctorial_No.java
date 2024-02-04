package practice;

import java.util.Scanner;

class Factorial{
	public static int factorial(int n) {
		int ans = 1;
		if(n < 0) {
			System.out.println("Enter greater value");
		}
		else if(n == 0) {
			return 1;
		}else {
			for(int i = n; i>0; i--) {
				ans = ans * i;
			}		
		}
		return ans;
	}
}

public class Facctorial_No {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No: ");
		int n = sc.nextInt();
		
		Factorial f1 = new Factorial();
		
		int ans = f1.factorial(n);
		System.out.println("Factorial of "+n+" is "+ans);
	}
}
