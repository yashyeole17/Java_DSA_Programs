package practice;

import java.util.Scanner;

public class Vovel_Consonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a character: ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println(ch+" is Vowel");
		}
		else if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0') {
			System.out.println(ch+" is Number");
		}else {
			System.out.println(ch+" is Consonent");
		}
	}
}
