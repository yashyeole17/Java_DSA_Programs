package practice;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter year: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year % 400 == 0)
			System.out.println("Leap year: "+year);
		else if(year % 4 == 0 && year % 100 != 0)
			System.out.println("Leap year: "+year);
		else
			System.out.println("Not a leap year: "+year);
	}
}
