package practice;

import java.util.Scanner;

public class ASCII_value {

	public static void main(String[] args) {
		//"American Standard Code for Information Interchange"
		
		System.out.print("Enter character: ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int i = ch;
		System.out.println("ASCII value of "+ch+" is "+i);
		sc.close();
	}
}
