package practice;

public class Longest_palindrome {

	public static boolean isPalindrome (int n) {
		int divisor = 1;
		while(n / divisor >= 10) {
			divisor = divisor * 10;
		}
		
		while(n != 0) {
			int x = n / divisor;		// first digit
			int y = n % 10;				// last digit
			
			if(x != y){
				return false;
			}
		 n = (n % divisor) / 10;
		 divisor = divisor /100;
		}
		return true;
	}                                                                                                 
	
	public static int Longestpalindrome(int[] arr, int n) {
		int ans = -1;
		for(int i=0; i<n; i++) {
			if(arr[i] > ans && isPalindrome(arr[i])) {
				ans = arr[i];
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {121, 2322, 54545, 999990};
		int n = arr.length;
		System.out.println(Longestpalindrome(arr, n));
	}

}
