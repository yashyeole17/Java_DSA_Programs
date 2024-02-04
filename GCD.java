package practice;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st No: ");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd No: ");
		int n2 = sc.nextInt();
		int n = 1;
		
		if(n2 == 0) {
			System.out.println("Exception: Divide by Zero");
		}
		else if(n1 != n2) {
			while(n != 0) {
				n = n1 % n2;
				if(n != 0) {
					n1 = n2;
					n2 = n;
				}
			}
			System.out.println("GCD / HCF is: "+n2);
		}else {
			System.out.println("Wrong no");
		}
		sc.close();
	}
}
