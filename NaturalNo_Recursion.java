package practice;
import java.util.Scanner;
public class NaturalNo_Recursion {

	static int Natural_Number(int n) {
		if(n == 0) 
			return n;
		return n + Natural_Number(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter last no: ");
		int n = sc.nextInt();
		
		int ans = Natural_Number(n);
		System.out.println("Sum of Natural No upto: "+n+" is "+ans);
	}

}
