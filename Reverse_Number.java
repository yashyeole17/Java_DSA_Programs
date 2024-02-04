package practice;
import java.util.Scanner;
public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a No: ");
		int number = sc.nextInt();
		System.out.println("Reverse of No: "+number+" is ");
		
		int reverse = 0;
		while(number != 0) { 			// eg 123
			int digit = number % 10;	// 123 % 10 = 3
			reverse = reverse * 10 + digit;
			number = number / 10;
			
		}
		System.out.println(reverse);
		sc.close();
	}

}
