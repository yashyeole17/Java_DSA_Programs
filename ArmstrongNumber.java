package practice;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static boolean armStrong(int num , int len) {
		int sum =0;
		int temp = num;
		int digit;
		
		while(temp != 0) {
			digit = temp % 10;
			sum += Math.pow(digit, len);
			temp /= 10;
		}	
		return sum == num;
	}
	
	static int order(int x) {
		int len = 0;
		while(x != 0) {
			len++;
			x = x/10;
		}
		return len;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int num = 153;      // 407
		System.out.println("Enter No: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int len = order(num);
		if(armStrong(num, len)){
			System.out.println(num+" is Armstrong");
		}else {
			System.out.println(num+" is not Armstrong");
		}
	}

}
