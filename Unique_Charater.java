package practice;

import java.util.Scanner;

public class Unique_Charater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int freq[] = new int[256];
		
		for(int i=0; i<str.length(); i++) {
			freq[str.charAt(i)]++;
		}
		System.out.println("The Unique character: ");
		
		for(int i = 0; i < 256; i++) {
			if(freq[i] == 1) {
				System.out.print((char)i+" ");
			}
		}
		sc.close();
	}

}
