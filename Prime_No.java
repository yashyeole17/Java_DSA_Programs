package practice;


import java.lang.Math;
import java.util.Scanner;
public class Prime_No {
	
	public static void primeNo(int num) {
		int count = 0;
		for(int i = 2; i <= num; i++) {
			if(num % i == 0) {
				System.out.println("Prime factors are: "+i);
				count++;
			}
		}
		if(count == 1) {
			System.out.println(num+" is prime ");
		}else {
			System.out.println(num+" is NOT prime ");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter No: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		primeNo(num);
	}
}
