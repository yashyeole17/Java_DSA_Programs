package practice;

import java.util.Scanner; 
/*
class Palindrome_word {
	private static String reverse(String str) {
		// TODO Auto-generated method stub
		char[] ch = str.toCharArray();
		int left = 0;
		int right = ch.length-1;
		
		while(left < right){
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
		
		left++;
		right--;
		}
		return new String(ch);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter String:  ");
		//String str = sc.nextLine();
		
		String str = "nayan";
		String rev = reverse(str);
		System.out.println("Reverse String: "+rev);
		
		if(str.equals(rev)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}	
		sc.close();
	}
}

*/
// Palindrome_word using StringBuilder
class Palindrome_word {
	
	static boolean Is_Palindrome(String word) {
		
		if(word == null || word.isEmpty()) {
			return true;
		}
		char[] arr = word.toCharArray();
		StringBuilder sb = new StringBuilder(word.length());
		for(int i= word.length()-1; i>=0; i--) {
			sb.append(arr[i]);
		}
		String rev = sb.toString();	
		return word.equals(rev);
	}
	public static void main(String args[]) {
		String word = "nayan";
		Boolean a = Is_Palindrome(word);
		System.out.println("Is Palindrome \""+word+"\" is "+a);
	}
}
