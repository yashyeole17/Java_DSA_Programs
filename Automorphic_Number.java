package practice;

import java.util.Scanner;

public class Automorphic_Number {

	public static void main(String[] args) {
	/*
	  	 A number is called an automorphic number 
		 if and only if the square of the given number ends with the same number itself. 
		 For example, 25, 76 are automorphic numbers because their square is 625 and 5776, respectively 	 
	 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		
		int number = sc.nextInt();
		String s1 = Integer.toString(number);
		int l1 = s1.length();
		
		int n2 = number * number;
		String s2 = Integer.toString(n2);
		int l2 = s2.length();
		
		System.out.println("Square: "+s2);
		
		String s3 = s2.substring(l2-l1);
		if(s1.equals(s3)) 
			System.out.println(s1+" :Automorphic Number");
		else
			System.out.println(s1+" :Not an Automorphic Number");
		sc.close();
	}

}
