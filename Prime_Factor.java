package practice;

import java.util.Scanner;

public class Prime_Factor {
	
	public static boolean isPrime(int i) {
		int count = 0;
		for(int j = 2; j <= i; j++) {
			if(i % j == 0) {
				count++;
			}
		}
		if(count == 1) {
			return true;
		}else {
			return false;
		}
	}

	public static void primefactor(int num) {
		for(int i = 2; i <= num; i++) {
			if(isPrime(i) == true) {
	            while (num % i == 0) {
	            	System.out.println("Prime factor is "+i);
	                num /= i;
	            }
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter No: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		primefactor(num);
	}

}
