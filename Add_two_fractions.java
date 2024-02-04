package practice;

import java.util.Scanner;

public class Add_two_fractions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first Numerator: ");
		float n1 = sc.nextFloat();
		System.out.print("Enter first Denomenator: ");
		float d1 = sc.nextFloat();
		System.out.print("Enter Second Numerator: ");
		float n2 = sc.nextFloat();
		System.out.print("Enter Second Denomenator: ");
		float d2 = sc.nextFloat();
		
		float num, den, x;
		System.out.println("( "+n1+"/"+d1+") + ("+n2+"/"+d2+")");
		
		if(d1 == d2) {
			num = n1 + n2;
			den = d1;
		}else {
			num = (n1 * d2) + (n2 * d1);
			den = d1 * d2;
		}
		
		if(num > den) x = num;
		else x = den;
		
		for(float i =1; i<=x; i++) {
			if(num % i ==0 && den%i==0) {
				num /= i;
				den /= i;
			}
		}
		System.out.println("Ans "+num / den);
		sc.close();
	}

}
