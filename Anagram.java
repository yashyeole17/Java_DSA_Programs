package practice;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	private static boolean isAnagram(String s1, String s2) {
		s1 = s1.replaceAll("\\s", "").toLowerCase();
		s2 = s2.replaceAll("\\s", "").toLowerCase();
		
		if(s1.length() != s2.length()) {
			return false;
		}else {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
		
			return Arrays.equals(ch1, ch2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st String: ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter 2nd String: ");
		String s2 = sc.nextLine();
		
		boolean status = isAnagram(s1, s2);
		if(status)
			System.out.println(s1+ " and "+s2+" are anagram");
		else
			System.out.println(s1+ " and "+s2+" are not anagram");
		sc.close();
	}

}
