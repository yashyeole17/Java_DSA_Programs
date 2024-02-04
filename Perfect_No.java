package practice;

import java.util.Scanner;

public class Perfect_No {

	public static void main(String[] args) {
		System.out.print("Enter No: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean ans = perfect_number(n);
		
		System.out.println("Perfect Number: "+n+" is "+ans);
		sc.close();
	}

	 private static boolean perfect_number(int n) {
		int add = 0;
		 if(n != 0) {
			for(int i=1; i<n; i++) {
				if (n % i == 0) {
					add += i;
					System.out.println("Divisor Number: "+i);
				}
			}
			if(add == n) {
				return true;
			}
		}else {
			return false;
		}
		return false;
	}

}
