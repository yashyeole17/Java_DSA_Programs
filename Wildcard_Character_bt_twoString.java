package practice;

public class Wildcard_Character_bt_twoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "he*o";
		String text = "hello";
		
		if(isMatch(text, pattern)) 
			System.out.println("The string match");
		else
			System.out.println("The String not match");
	}
	
	private static boolean isMatch(String text, String pattern) {
		int i =0, j=0;
		int starIndex = -1;
		int textIndex = -1;
		
		while(i < text.length()) {
			if(j < pattern.length() && (pattern.charAt(j) == '?' || text.charAt(i) == pattern.charAt(j))) {
				i++;
				j++;
			}
			else if(j < pattern.length() && pattern.charAt(j) == '*') {
				starIndex = i;
				textIndex = j;
				j++;
			}
			else if(starIndex != -1) {
				j = starIndex + 1;
				i = textIndex + 1;
				textIndex++;
			}
			else {
				return false;
			}
		}
		while (j < pattern.length() && pattern.charAt(j) == '*') {
            j++;
        }
		return j == pattern.length();
	}
}
