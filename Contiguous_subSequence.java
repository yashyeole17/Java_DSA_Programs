package practice;

import java.util.Arrays;

public class Contiguous_subSequence {

	public static void ContiguousSubSequence(int[] arr) {
		
		int count = 1;
		int maxCount =1;
		for(int i=0; i<arr.length-1; i++) {
				if(arr[i]+1 == arr[i+1]) {
					count++;
					 maxCount = Math.max(maxCount, count);
				}else {
					count = 1;
			}
		}
		System.out.println("Length of the Longest contiguous subsequence is "+maxCount);
	
	}
	

	public static void print(int[] arr, int n) {
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 9, 3, 10,4, 4, 20, 2};
		int n = arr.length;

		System.out.println("Origianl array: ");
		print(arr, n);
		
		System.out.println("Sorted array: ");
		Arrays.sort(arr);
		print(arr, n);
		
		ContiguousSubSequence(arr);
	}
}
