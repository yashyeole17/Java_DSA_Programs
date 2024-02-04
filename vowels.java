package practice;

import java.util.Scanner;

public class vowels {

	public static void stringContainsVowels(String str) {
		System.out.println(str.toLowerCase().matches(".*[aeiou].*"));	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		stringContainsVowels(str);
	}

}
